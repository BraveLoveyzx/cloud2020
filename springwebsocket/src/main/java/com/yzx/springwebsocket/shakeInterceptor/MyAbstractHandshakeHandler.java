package com.yzx.springwebsocket.shakeInterceptor;

import org.springframework.web.socket.server.support.AbstractHandshakeHandler;

public class MyAbstractHandshakeHandler extends AbstractHandshakeHandler {

    
    /**
     * @Description: 项目在启动时会执行1
     * @Param: 
     * @return: 
     * @Author: mastermind
     * @Date: 2020-05-17 11:23
     */ 
    @Override
    public void start() {
        System.err.println("start");
        super.start();
    }


    @Override
    public void stop() {
        super.stop();
    }

    /**
     * @Description: 项目在启动时会执行2
     * @Param: 
     * @return: 
     * @Author: mastermind
     * @Date: 2020-05-17 11:23
     */ 
    @Override
    public boolean isRunning() {
        return super.isRunning();
    }


}

