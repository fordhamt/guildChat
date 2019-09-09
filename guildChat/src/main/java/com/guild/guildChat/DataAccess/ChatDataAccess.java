package com.guild.guildChat.DataAccess;

import com.guild.guildChat.ChatMessage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ChatDataAccess {
    List<ChatMessage> chatMessages = new ArrayList<>();

    public void create(ChatMessage chatMessage){
        chatMessages.add(chatMessage);
    }

    public List<ChatMessage> read() {
        return chatMessages;
    }
}
