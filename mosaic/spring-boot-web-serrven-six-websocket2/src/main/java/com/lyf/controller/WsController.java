package com.lyf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.security.Principal;

/**
 * Created by 刘亚飞 on 2017/6/2.
 */
@Controller
public class WsController {
    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/chat")
    public void handleChat(Principal principal, String msg) {
        if (principal.getName().equals("lyf")) {
            messagingTemplate.convertAndSendToUser("wisely",
                    "/queue/notifications",
                    principal.getName() + "-send:" + msg);
        }else {
            messagingTemplate.convertAndSendToUser("lyf",
                    "/queue/notifications",
                    principal.getName()+"-send:"+msg);
        }
    }
}
