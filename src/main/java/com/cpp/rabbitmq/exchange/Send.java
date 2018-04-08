package com.cpp.rabbitmq.exchange;

import com.cpp.rabbitmq.ConnectUtils;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

/**
 * 公平队列，能者多劳，等消息得到回执之后再下发下一个消息
 */
public class Send {

    private static final String EXCHANGE_NAME = "logs";

    public static void main(String[] argv) throws Exception {
        Connection connection = ConnectUtils.getConnection();
        Channel channel = connection.createChannel();
        channel.exchangeDeclare(EXCHANGE_NAME, "fanout");
        channel.basicPublish(EXCHANGE_NAME, "", null, "这个是一个发布订阅模式的消息".getBytes("UTF-8"));
        channel.close();
        connection.close();
    }
}