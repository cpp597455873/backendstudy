package com.cpp.rabbitmq;


import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * Created by cpp on 2018/3/29.
 */
public class ConnectUtils {
    public static Connection getConnection() throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("192.168.1.54");
        factory.setPort(5672);
        factory.setPassword("password");
        factory.setUsername("user");
        factory.setVirtualHost("/vhost_mq");
        return factory.newConnection();
    }
}
