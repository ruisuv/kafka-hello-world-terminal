package com.encora.kafkahelloworldterminal.controller;

import com.encora.kafkahelloworldterminal.model.Message;
import com.encora.kafkahelloworldterminal.service.PublisherService;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@Log4j2
@RestController("/api/v1")
public class MessageController {

    private PublisherService service;

    public MessageController(PublisherService service) {
        this.service = service;
    }

    @PostMapping(value = "/messages",
            produces = {"application/json"},
            consumes = {"application/json"})
    public ResponseEntity<String> sendMessage(@RequestBody Message message) {
        log.info("{} sent the message {}", message.getAuthor(), message.getText());
        service.publish(message);
        return ResponseEntity.ok("Message sent.\n");

    }

}
