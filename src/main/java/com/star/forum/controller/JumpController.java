package com.star.forum.controller;

import com.star.forum.dto.PaginationDTO;
import com.star.forum.dto.UserDTO;
import com.star.forum.dto.UserQueryDTO;
import com.star.forum.exception.CustomizeErrorCode;
import com.star.forum.exception.CustomizeException;
import com.star.forum.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 回跳到用户首页或者是社区首页
 *
 * @Author: zzStar
 * @Date: 12-07-2020 17:46
 */
@Controller
public class JumpController {
    @Resource
    private UserService userService;

    @GetMapping("/jump")
    public String jump(
            HttpServletRequest request,
            Model model
            , @RequestParam(name = "type") String type
            , @RequestParam(name = "target") String target) {

        if ("user_home".equals(type)) {
            UserQueryDTO userQueryDTO = new UserQueryDTO();
            userQueryDTO.setName(target);
            userQueryDTO.convert();
            PaginationDTO paginationDTO = userService.list(userQueryDTO);
            List<UserDTO> userDTOs = paginationDTO.getData();
            if (userDTOs.size() != 1)
                throw new CustomizeException(CustomizeErrorCode.USER_IS_EMPTY);
            return "redirect:/user/" + userDTOs.get(0).getId();
        }
        return "redirect:/forum";
    }


}
