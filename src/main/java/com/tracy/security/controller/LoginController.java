package com.tracy.security.controller;

import com.tracy.security.model.AuthenticationRequest;
import com.tracy.security.model.UserDto;
import com.tracy.security.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/5/7 16:32
 */
@Controller
public class LoginController {

    @Autowired
    AuthenticationService authenticationService;

    @PostMapping(value = "/login", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String login(AuthenticationRequest authenticationRequest, HttpSession session){
        UserDto userDto = authenticationService.authentication(authenticationRequest);

        //存入session
        session.setAttribute(UserDto.SESSION_USER_KEY,userDto);

        return userDto.getUsername()+"登录成功";
    }

    @GetMapping(value = "/r/r1",produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String getUser(HttpSession session){
        String fullname ;
        Object o = session.getAttribute(UserDto.SESSION_USER_KEY);
        if (o == null){
            fullname = "匿名";
        }else{
            UserDto userDto = (UserDto) o;
            fullname = userDto.getFullname();
        }
        return fullname+"访问资源r1";
    }

    @GetMapping(value = "/r/r2",produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String getUser2(HttpSession session){
        String fullname ;
        Object o = session.getAttribute(UserDto.SESSION_USER_KEY);
        if (o == null){
            fullname = "匿名";
        }else{
            UserDto userDto = (UserDto) o;
            fullname = userDto.getFullname();
        }
        return fullname+"访问资源r2";
    }

    @GetMapping(value = "/logout",produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String logout(HttpSession session){
        session.invalidate();
        return "退出成功";
    }

}
