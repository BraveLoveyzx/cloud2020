package com.yzx.springwebsocket.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webSocket")
public class MyController {

    @Autowired
    private MyWebSocketHandler myWebSocketHandler;
}
