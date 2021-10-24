package com.example.rabbit.publish.rabbitService;

import com.example.rabbit.publish.model.Item;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Sandaka Wijesinghe.
 * Date: 10/24/21
 */

@Service
public class RabbitMqService {

    @Autowired
    private AmqpTemplate amqpTemplate;

    private String EXCHANGE = "otp-exchange";

    private String ROUTING_KEY = "items";

    public void sendMessage(Item item) {
        amqpTemplate.convertAndSend(EXCHANGE, ROUTING_KEY, item);
    }
}
