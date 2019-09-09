package com.guild.guildChat.Controller;

import com.guild.guildChat.ChatMessage;

import java.util.List;

public class ChatMessageResponse {
    List<ChatMessage> chatMessages;

    public List<ChatMessage> getChatMessages() {
        return chatMessages;
    }

    public void setChatMessages(List<ChatMessage> chatMessages) {
        this.chatMessages = chatMessages;
    }
}
