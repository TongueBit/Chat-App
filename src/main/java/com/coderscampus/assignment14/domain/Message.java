package com.coderscampus.assignment14.domain;


public class Message {
    private String sentence;
    private String username;

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    @Override
    public String toString() {
        return sentence;
    }

    public Message() {
        super();
    }

    public Message(String message) {
        super();
        this.sentence = message;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

}
