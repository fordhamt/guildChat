package com.guild.guildChat;

import java.util.Date;

public class ChatMessage {
    String User;
    String Message;
    Date TimeStamp;

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

    public Date getTimeStamp() {
        return TimeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        TimeStamp = timeStamp;
    }
}
