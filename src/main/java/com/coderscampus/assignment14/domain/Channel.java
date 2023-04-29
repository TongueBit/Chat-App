package com.coderscampus.assignment14.domain;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private List<Message> messages = new ArrayList<>();
    private String channelName;


    private Long id;
    private Long currentId = 1L;

    public Channel(String channelName) {

        this.channelName = channelName;
        this.id = currentId++;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> channel) {
        this.messages = messages;
    }

    public void addMessage(Message message) {
        messages.add(message);
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

}
