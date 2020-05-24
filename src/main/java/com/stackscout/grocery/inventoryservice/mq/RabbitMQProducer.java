package com.stackscout.grocery.inventoryservice.mq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class RabbitMQProducer
{
    public static void sendMessage( String message, String queue ) throws IOException, TimeoutException
    {
        ConnectionFactory connectionFactory = new ConnectionFactory();

        try( Connection connection = connectionFactory.newConnection() )
        {
            Channel channel = connection.createChannel();
            channel.queueDeclare( queue, false, false, false, null );
            channel.basicPublish( null, queue, false, null, message.getBytes() );
        }
    }
}
