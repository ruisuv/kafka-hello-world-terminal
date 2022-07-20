package com.encora.kafkahelloworldterminal.model;

import lombok.Data;

@Data
public class Message {
    private String author;
    private String text;
}
