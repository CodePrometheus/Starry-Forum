package com.star.forum.api;

import com.star.forum.annotation.UserLoginToken;
import com.star.forum.cache.TemporaryCache;
import com.star.forum.dto.ResultDTO;
import com.star.forum.service.UserService;
import com.star.forum.util.CookieUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录注册逻辑
 *
 * @Author: zzStar
 * @Date: 12-06-2020 17:45
 */
@Controller
@RequestMapping("/api/sso")
@ApiIgnore
public class SsoApi {

    @Resource
    private CookieUtils cookieUtils;
    @Resource
    private UserService userService;
    @Resource
    private TemporaryCache temporaryCache;


    @Value("${sms.enable}")
    private Integer smsEnable;


    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Object login(HttpServletRequest request,
                        @RequestParam("name") String name,
                        @RequestParam("password") String password,
                        @RequestParam("type") Integer type,
                        HttpServletResponse response) {
        // 1为手机号，2为邮箱号
        ResultDTO resultDTO = (ResultDTO) userService.login(type, name, password);
        if (200 == resultDTO.getCode()) {
            Cookie cookie = cookieUtils.getCookie("token", "" + resultDTO.getData(), 86400 * 3);
            response.addCookie(cookie);
        }
        return resultDTO;
    }

    @ResponseBody
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Object register(HttpServletRequest request,
                           @RequestParam("name") String name,
                           @RequestParam("password") String password,
                           @RequestParam("type") Integer type,
                           HttpServletResponse response) {
        // 1为手机号，2为邮箱号
        ResultDTO resultDTO = (ResultDTO) userService.register(type, name, password);
        if (200 == resultDTO.getCode()) {
            Cookie cookie = cookieUtils.getCookie("token", "" + resultDTO.getData(), 86400 * 3);
            response.addCookie(cookie);
        }
        return resultDTO;
    }

    @UserLoginToken
    @ResponseBody
    @RequestMapping(value = "/mail/submitMail", method = RequestMethod.POST)
    public Object submitMail(@RequestParam("id") String id,
                             @RequestParam("mail") String mail,
                             @RequestParam("code") String code) {
        System.out.println("mail code" + mail + code);
        if (!code.equals(temporaryCache.getMailCode(mail)))
            return ResultDTO.errorOf("验证码不匹配，可能已经超过5分钟，请重试");        // TODO 自动生成的方法存根
        return userService.updateUserMailById(id, mail);
    }

    @ResponseBody
    @RequestMapping(value = "/mail/registerOrLoginWithMail", method = RequestMethod.POST)
    public Object registerOrLoginWithMail(
            @RequestParam("mail") String mail,
            @RequestParam("code") String code,
            @RequestParam(name = "password", required = false) String password,
            HttpServletResponse response) {
        if (!code.equals(temporaryCache.getMailCode(mail)))
            return ResultDTO.errorOf("验证码不匹配，可能已经超过5分钟，请重试");
        if ("null".equals(password)) password = null;
        ResultDTO resultDTO = (ResultDTO) userService.registerOrLoginWithMail(mail, password);
        if (200 == resultDTO.getCode()) {
            Cookie cookie = cookieUtils.getCookie("token", resultDTO.getMessage(), 86400 * 3);
            response.addCookie(cookie);
        }
        return resultDTO;
    }

}
