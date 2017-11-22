package com.example.opilane.chatapp;

import java.util.Date;

/**
 * Created by opilane on 22.11.2017.
 */

public class ChatMessage {
    private String messageText;
    private String MessageUser;
    private long messageTime;

    public ChatMessage(String messageText, String messageUser, long messageTime) {
        this.messageText = messageText;
        MessageUser = messageUser;
        messageTime = new Date().getTime();
    }

    public ChatMessage() {

    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getMessageUser() {
        return MessageUser;
    }

    public void setMessageUser(String messageUser) {
        MessageUser = messageUser;
    }

    public long getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }
}
