package com.star.forum.controller;

import com.star.forum.dto.CommentDTO;
import com.star.forum.dto.CommentQueryDTO;
import com.star.forum.dto.QuestionDTO;
import com.star.forum.dto.UserDTO;
import com.star.forum.enums.CommentTypeEnum;
import com.star.forum.service.CommentService;
import com.star.forum.service.QuestionService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author: zzStar
 * @Date: 12-07-2020 12:58
 */
@Controller
public class CommentController {

    @Resource
    private CommentService commentService;
    @Value("${vaptcha.vid}")
    private String vaptcha_vid;
    @Resource
    private QuestionService questionService;

    @GetMapping(value = {"/comment/{id}"})
    public String comment(@PathVariable(name = "id") Long id, HttpServletRequest request, Model model) {

        UserDTO viewUser = (UserDTO) request.getAttribute("loginUser");
        if (viewUser == null) {
            model.addAttribute("rsTitle", "您无权访问！");
            model.addAttribute("rsMessage", "高级回复页游客不可见，快去登录吧");
            return "result";
        }
        CommentDTO commentDTO;
        CommentQueryDTO commentQueryDTO = new CommentQueryDTO();
        commentQueryDTO.setId(id);
        commentQueryDTO.convert();
        List<CommentDTO> commentDTOs = commentService.list(commentQueryDTO).getData();
        if (commentDTOs.size() == 1) {
            commentDTO = commentDTOs.get(0);
        } else {
            model.addAttribute("rsTitle", "该页面无法访问！");
            model.addAttribute("rsMessage", "请确认路径是否正确");
            return "result";
        }
        List<CommentDTO> subComments = commentService.listByTargetId(id, CommentTypeEnum.COMMENT);
        QuestionDTO questionDTO = questionService.getById(commentDTO.getParentId(), viewUser.getId());
        model.addAttribute("question", questionDTO);
        model.addAttribute("comment", commentDTO);
        model.addAttribute("subComments", subComments);
        model.addAttribute("navtype", "communitynav");
        model.addAttribute("vaptcha_vid", vaptcha_vid);
        return "p/comment";
    }
}
