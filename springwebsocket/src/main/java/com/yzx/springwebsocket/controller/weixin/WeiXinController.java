package com.yzx.springwebsocket.controller.weixin;

import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.weixin4j.util.XStreamFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.DataBuffer;
import java.io.IOException;
import java.util.Map;


/**
 * @Description: 微信控制器
 * @Param:
 * @return:
 * @Author: mastermind
 * @Date: 2020-06-28 16:22
 */
@RestController
@RequestMapping("/watch")
public class WeiXinController {


//    /**
//     * @Description: 服务器配置
//     * @Param:
//     * @return:
//     * @Author: mastermind
//     * @Date: 2020-06-28 16:23
//     */
//    @GetMapping
//    public String aaa(@RequestParam Map map) {
//        System.err.println(map);
//        return map.get("echostr").toString();
//    }


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
            return "ea529bcb60ee7c0ff2f19da4ebd75c9c";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map.get("echostr").toString();
    }



//------------------------开放平台回调-----------------


    /**
     * @Description: 服务器配置 【授权事件接收URL】
     * @Param:
     * @return:
     * @Author: mastermind
     * @Date: 2020-06-28 16:23
     */
    @PostMapping("/ticket")
    public String ticket(@RequestParam Map map, HttpServletRequest request, HttpServletResponse response) {
        try {
            System.err.println("---------授权事件接收URL start----------");
            System.err.println(map);
            String xml = XStreamFactory.inputStream2String(request.getInputStream());
            System.err.println(xml);
            System.err.println("---------授权事件接收URL end----------");
            response.getWriter().write("success");
            response.getWriter().flush();
            response.getWriter().close();

            return "success";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "error";
    }


    /**
     * @Description: 服务器配置 【消息与事件接收URL】
     * @Param:
     * @return:
     * @Author: mastermind
     * @Date: 2020-06-28 16:23
     */
    @PostMapping("/acceptmsg/{APPID}")
    public void acceptmsg(@PathVariable String APPID, @RequestParam Map map, HttpServletRequest request, HttpServletResponse response) {
        try {
            System.err.println("---------消息与事件接收URL start----------");
            System.err.println(map);
            String xml = XStreamFactory.inputStream2String(request.getInputStream());
            System.err.println(xml);
            System.err.println("---------消息与事件接收URL end----------");
            response.getWriter().write("success");
            response.getWriter().flush();
            response.getWriter().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * @Description: 微信开放平台授权回调
     * @Param:
     * @return:
     * @Author: mastermind
     * @Date: 2020-06-28 16:23
     */
    @GetMapping("/authRedirect")
    public String authRedirect(@RequestParam Map map, HttpServletRequest request, HttpServletResponse response) {
        try {
            System.err.println("---------微信开放平台授权回调 start----------");
            System.err.println(map);
            String xml = XStreamFactory.inputStream2String(request.getInputStream());
            System.err.println(xml);
            System.err.println("---------微信开放平台授权回调 end----------");
            return "微信开放平台授权回调sucess";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "微信开放平台授权回调error";
    }


}
