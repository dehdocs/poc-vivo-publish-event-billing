package com.accenture.PocVivoPublishEventBilling.service;

import com.accenture.PocVivoPublishEventBilling.model.FinancialAccountCreateEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TopicProducer {
    @Value("${topic.name.producer}")
    private String topicName;

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void send(FinancialAccountCreateEvent message){

        log.info("Payload enviado: {}",  message.toString());
        kafkaTemplate.send(topicName, message.toString());
    }
}
