package com.example.pruebaMongo.Handler;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.ArrayList;
import java.util.List;

public class MapWebSocketHandler extends TextWebSocketHandler {

    private final List<WebSocketSession> webSocketSessions = new ArrayList<>();

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        webSocketSessions.add(session);
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        // Aca es donde las sesiones viven 
        for(WebSocketSession webSocketSession : webSocketSessions){
            webSocketSession.sendMessage(message);
        }
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        webSocketSessions.remove(session);
    }
}
