package com.star.forum.controller;

import com.star.forum.util.CookieUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Controller
public class AuthorizeController {

    @Resource
    private CookieUtils cookieUtils;

    @GetMapping("/logout")
    public String logout(HttpServletResponse response) {
        Cookie cookie = cookieUtils.getCookie("token", null, 0);
        response.addCookie(cookie);
        return "redirect:/forum";
    }

    @PostMapping("/callbackOpenid")
    @ResponseBody
    public Map<String, Object> callbackOpenid() {
        Map<String, Object> map = new HashMap<>();
        map.put("info", "进来了");
        return map;
    }

}
