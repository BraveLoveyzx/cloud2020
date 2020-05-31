package com.yzx.springwebsocket.one;

import com.yzx.springwebsocket.shakeInterceptor.MyAbstractHandshakeHandler;
import com.yzx.springwebsocket.shakeInterceptor.MyHttpSessionHandshakeInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.*;

@Configuration
@EnableWebSocket
public class MyWebSocketConfig implements   WebSocketConfigurer {

    @Autowired
    private MyWebSocketHandler myWebSocketHandler;

    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {

        registry.addHandler(myWebSocketHandler,"/pos/websocket")
                .addInterceptors(new MyHttpSessionHandshakeInterceptor())
                .setHandshakeHandler(new MyAbstractHandshakeHandler())
                //跨域
                .setAllowedOrigins("*");

    }
}