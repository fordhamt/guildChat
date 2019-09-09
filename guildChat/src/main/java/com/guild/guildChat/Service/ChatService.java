package com.guild.guildChat.Service;

import com.guild.guildChat.ChatMessage;
import com.guild.guildChat.DataAccess.ChatDataAccess;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;

@Service
public class ChatService {
    private final ChatDataAccess dataAccess;

    public ChatService(ChatDataAccess chatDataAccess){
        dataAccess = chatDataAccess;
    }

    public void create(String user, String message) {
        Date date = new Date();
        ChatMessage chatMessage = new ChatMessage();

        chatMessage.setMessage(message);
        chatMessage.setUser(user);
        chatMessage.setTimeStamp(date);

        dataAccess.create(chatMessage);
    }

    public List<ChatMessage> read(){
        return dataAccess.read();
    }
}
