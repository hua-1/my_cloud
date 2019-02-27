package com.hua.mq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Producer {
    private static final String QUEUE_NAME ="queue.test";

    public static void main(String[] args) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("127.0.0.1");
        factory.setPort(15672);
        factory.setUsername("root");
        factory.setPassword("root");
//        factory.setVirtualHost("vhostOne");

        Connection connection =  factory.newConnection();

        Channel channel = connection.createChannel();
        String queueName = "queueOne";
        String exchangeName = "exchangerOne";
        String routingKey = "queueOne";
        channel.exchangeDeclare(exchangeName,"direct");
        channel.queueDeclare(queueName,false,false,false,null);
        channel.queueBind(queueName,exchangeName,routingKey);

        int msgCnt =15000;
        while(msgCnt-->0){
            String msg = "msg"+Math.random()*100;
            channel.basicPublish(exchangeName,routingKey,null,msg.getBytes());  //发送消息
            System.out.println("produce msg :"+msg);
            TimeUnit.MILLISECONDS.sleep((long) (Math.random()*500));
        }
        channel.close();
        connection.close();
    }

}
