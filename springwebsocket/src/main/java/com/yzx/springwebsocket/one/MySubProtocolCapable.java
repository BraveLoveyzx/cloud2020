package com.yzx.springwebsocket.one;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.SubProtocolCapable;

import java.util.List;

@Component
public class MySubProtocolCapable implements SubProtocolCapable {

    public List<String> getSubProtocols() {
        System.err.println("MySubProtocolCapable---getSubProtocols");
        return null;
    }
}
