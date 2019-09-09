package com.guild.guildChat.Controller;

import com.guild.guildChat.Service.ChatService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class ChatController {

    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    // <--------------------- POST Chat Message
    @RequestMapping(
            value = "/messages",
            method = RequestMethod.POST,
            consumes =  "application/json"
    )
    @ResponseStatus(HttpStatus.CREATED)
    public void postChatMessage(@RequestBody ChatMessageRequest requestBody) {
        this.chatService.create(requestBody.getUser(), requestBody.getMessage());
    }

    // <--------------------- GET Chat Messages
    @RequestMapping(
            value = "/messages",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    @ResponseStatus(HttpStatus.OK)
    public ChatMessageResponse getChatMessages() {
        ChatMessageResponse response = new ChatMessageResponse();
        response.setChatMessages(this.chatService.read());

        return response;
    }
}
