package com.yzx.springwebsocket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * @Description: 登陆
     * @Param: 
     * @return: 
     * @Author: mastermind
     * @Date: 2020-05-18 09:40
     */ 
    @GetMapping("/do")
    public void doLogic(HttpServletRequest request){

        HttpSession session = request.getSession();

        session.setAttribute("aa","1");
        session.setAttribute("bb","2");
    }

}
