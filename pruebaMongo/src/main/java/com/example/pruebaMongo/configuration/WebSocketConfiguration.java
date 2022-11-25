package com.example.pruebaMongo.configuration;


<<<<<<< HEAD
import com.example.pruebaMongo.Handler.MapWebSocketHandler;
=======

import com.example.pruebaMongo.handler.ChatWebSocketHandler;
>>>>>>> arturo
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class WebSocketConfiguration implements WebSocketConfigurer {

<<<<<<< HEAD
    private final static String WEB_ENDPOINT = "/chat";

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry){
        webSocketHandlerRegistry.addHandler(getMapWebSocketHandler(), WEB_ENDPOINT)
=======
    private final static String CHAT_ENDPOINT = "/chat";

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        webSocketHandlerRegistry.addHandler(getChatWebSocketHandler(), CHAT_ENDPOINT)
>>>>>>> arturo
                .setAllowedOrigins("*");
    }

    @Bean
<<<<<<< HEAD
    public WebSocketHandler getMapWebSocketHandler(){
        return new MapWebSocketHandler();
    }
}
=======
    public WebSocketHandler getChatWebSocketHandler(){
        return new ChatWebSocketHandler();
    }
}
>>>>>>> arturo
