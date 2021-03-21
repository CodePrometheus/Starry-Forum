package com.star.forum.search;

import com.star.forum.mapper.QuestionMapper;
import com.star.forum.model.Question;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zzStar
 * @Date: 03-06-2021 09:32
 */
@Component
public class ElasticSearchUtil {

    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private PostRepository postRepository;

    @Async
    public void save(Question question) {
        Post post = new Post();
        BeanUtils.copyProperties(question, post);
        postRepository.save(post);
    }

    @Async
    public void deleteById(long id) {
        postRepository.deleteById(id);
    }

    @Async
    public void sync() {
        postRepository.deleteAll();
        List<Question> questions = questionMapper.selectList(null);
        List<Post> posts = new ArrayList<>();
        for (Question question : questions) {
            Post post = new Post();
            post.setId(question.getId());
            post.setTitle(question.getTitle());
            post.setTag(question.getTag());
            posts.add(post);
        }
        postRepository.saveAll(posts);
    }

}
