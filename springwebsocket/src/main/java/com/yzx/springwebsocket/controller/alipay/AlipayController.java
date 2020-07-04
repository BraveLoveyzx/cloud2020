package com.yzx.springwebsocket.controller.alipay;

import org.springframework.web.bind.annotation.*;
import org.weixin4j.util.XStreamFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/alipay")
public class AlipayController {


    /**
     * @Description: 服务器配置
     * @Param:
     * @return:
     * @Author: mastermind
     * @Date: 2020-06-28 16:23
     */
    @PostMapping
    public String aaa(@RequestParam Map map, HttpServletRequest request, HttpServletResponse response) {
        try {
            System.err.println(map);
            String xml = XStreamFactory.inputStream2String(request.getInputStream());
            System.err.println(xml);
            return "";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map.get("echostr").toString();
    }


    /**
     * @Description: 服务器配置
     * @Param:
     * @return:
     * @Author: mastermind
     * @Date: 2020-06-28 16:23
     */
    @GetMapping("/card")
    public String card(@RequestParam Map map, HttpServletRequest request, HttpServletResponse response) {
        try {
            System.err.println(map);
            String xml = XStreamFactory.inputStream2String(request.getInputStream());
            System.err.println(xml);
            return "success";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map.get("echostr").toString();
    }
}
