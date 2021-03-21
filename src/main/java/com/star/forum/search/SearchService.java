package com.star.forum.search;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.star.forum.mapper.QuestionMapper;
import com.star.forum.model.Question;
import com.star.forum.rabbitmq.PostMqMessage;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.index.query.MultiMatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @Author: zzStar
 * @Date: 03-06-2021 09:12
 */
@Slf4j
@Service
public class SearchService {

    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private PostRepository postRepository;

    public IPage search(Page page, String keyword) {
        int current = (int) page.getCurrent() - 1;
        int size = (int) page.getSize();
        PageRequest.of(current, size);

        MultiMatchQueryBuilder query = QueryBuilders.multiMatchQuery(keyword, "title", "authorName", "TagName");
        org.springframework.data.domain.Page<Post> posts = postRepository.search(query, Pageable.unpaged());

        IPage pageData = new Page(page.getCurrent(), page.getSize(), posts.getTotalElements());
        pageData.setRecords(posts.getContent());
        return pageData;
    }

    public void createOrUpdateIndex(PostMqMessage mqMessage) {
        Long postId = mqMessage.getPostId();
        Question question = questionMapper.selectOne(new QueryWrapper<Question>().eq("id", postId));
        ModelMapper modelMapper = new ModelMapper();
        Post map = modelMapper.map(question, Post.class);
        postRepository.save(map);
        log.info("index updated successfully --> {}", map.toString());
    }

    public void removeIndex(PostMqMessage mqMessage) {
        Long postId = mqMessage.getPostId();
        postRepository.deleteById(postId);
        log.info("index remove successfully --> {}", mqMessage.toString());
    }
}
