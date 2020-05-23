package com.yzx.cloudconsumerorder80.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {


    /**
     * @Description: 新增
     * @Param:
     * @return:
     * @Author: mastermind
     * @Date: 2020-03-20 07:47
     */
    @PostMapping("/add")
    public String add() {

        //调用8001新增

        return "success";
    }


    /**
     * @Description: 查询
     * @Param:
     * @return:sss
     * @Author: mastermind
     * @Date: 2020-03-20 07:50
     */
    @GetMapping("/query")
    public String query(Long id) {

        //调用8001查询

        return "success";
    }


}
