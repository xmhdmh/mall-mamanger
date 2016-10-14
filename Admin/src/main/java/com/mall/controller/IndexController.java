package com.mall.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class IndexController extends BaseController{

    @RequestMapping("/index")
    public String index() {
        return "/index"; 
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() throws Exception {
        if(null!=SecurityUtils.getSubject().getSession().getAttribute("userInfo")){
            return "redirect:/index.html";
        }
        return "/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest request, Map<String, Object> map)
            throws Exception {
        // 登录失败从request中获取shiro处理的异常信息。
        // shiroLoginFailure:就是shiro异常类的全类名.
        String exception = (String) request.getAttribute("shiroLoginFailure");
        String msg = "";
        if (exception != null) {
            if (UnknownAccountException.class.getName().equals(exception)) {
                msg = "账号不存在";
            } else if (IncorrectCredentialsException.class.getName().equals(
                    exception)) {
                msg = "密码不正确";
            } else if ("kaptchaValidateFailed".equals(exception)) {
                msg = "验证码错误";
            } else {
                msg = exception;
            }
        }
        map.put("msg", msg);
        // 此方法不处理登录成功,由shiro进行处理.
        return "/login";
    }

    @RequestMapping("/home")
    public String test() {
        return "/home";
    }

    @RequestMapping("/403")
    public String noPermission() {
        return "/403";
    }
}
