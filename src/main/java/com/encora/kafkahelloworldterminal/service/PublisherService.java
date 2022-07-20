package com.encora.kafkahelloworldterminal.service;

import com.encora.kafkahelloworldterminal.configuration.ProducerConfiguration;
import com.encora.kafkahelloworldterminal.model.Message;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class PublisherService {

    private KafkaTemplate<String, String> template;
    private ProducerConfiguration configuration;

    public PublisherService(KafkaTemplate<String, String> template, ProducerConfiguration configuration) {
        this.template = template;
        this.configuration = configuration;
    }

    public void publish(Message message) {
        template.send(configuration.getTopicName(), message.getText());
    }
}
