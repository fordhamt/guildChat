package com.guild.guildChat.Controller;

public class ChatMessageRequest {
    String User;
    String Message;

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
