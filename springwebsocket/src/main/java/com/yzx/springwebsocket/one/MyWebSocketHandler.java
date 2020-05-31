package com.yzx.springwebsocket.one;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;

@Component
public class MyWebSocketHandler implements WebSocketHandler  {


    /**
     * @Description: 在WebSocket协商成功且WebSocket连接已打开并可以使用后调用。
     * 抛出：
     * @Param:
     * @return:
     * @Author: mastermind
     * @Date: 2020-05-17 10:51
     */
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {

        String path = session.getUri().getPath();


        String query = session.getUri().getQuery();


        System.err.println("MyWebSocketHandler----afterConnectionEstablished");
    }

    /**
     * @Description: 接受到前台发送过来消息，处理消息，当新的WebSocket消息到达时调用。
     * @Param:
     * @return:
     * @Author: mastermind
     * @Date: 2020-05-17 10:52
     */
    @Override
    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
        System.err.println("MyWebSocketHandler----handleMessage");
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        System.err.println("MyWebSocketHandler----handleTransportError");

    }

    /**
     * @Description: 关闭时触发
     * @Param:
     * @return:
     * @Author: mastermind
     * @Date: 2020-05-17 11:09
     */
    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {

        System.err.println(session.isOpen());

        System.err.println("MyWebSocketHandler----afterConnectionClosed");

    }

    /**
     * @Description: WebSocketHandler是否处理部分消息, 如果此标志设置为true并且基础WebSocket服务器支持部分消息，
     * 则可能会拆分大的WebSocket消息或大小未知的消息，
     * 并且可能会通过对handleMessage（WebSocketSession，WebSocketMessage）的多次调用来接收该消息。
     * 标志WebSocketMessage.isLast（）指示消息是否为部分消息以及是否为最后一部分。
     * @Param:
     * @return:
     * @Author: mastermind
     * @Date: 2020-05-17 10:50
     */
    @Override
    public boolean supportsPartialMessages() {
        System.err.println("MyWebSocketHandler----supportsPartialMessages");
        return false;
    }
}
