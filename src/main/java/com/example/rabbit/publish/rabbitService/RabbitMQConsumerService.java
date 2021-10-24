package com.example.rabbit.publish.rabbitService;

import com.example.rabbit.publish.model.Item;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * Created by Sandaka Wijesinghe.
 * Date: 10/24/21
 */

@Service
public class RabbitMQConsumerService {

    private static final String QUEUE = "items-queue";

    @RabbitListener(queues = QUEUE)
    public void receiveMessage(Item item) {
        System.out.println("Received Message from Items Queue >>" + item);
    }
}
