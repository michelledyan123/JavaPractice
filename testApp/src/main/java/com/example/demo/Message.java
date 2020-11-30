package com.example.demo;

public class Message {

    private final long id;
    private final String greeting;
    private final String name;

    public Message(long id, String greet, String name) {
        this.id = id;
        this.greeting = greet;
        this.name = name;
    }
}