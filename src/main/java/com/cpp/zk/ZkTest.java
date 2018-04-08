package com.cpp.zk;

import org.I0Itec.zkclient.ZkClient;

import java.util.List;

/**
 * Created by cpp on 2018/3/30.
 */
public class ZkTest {
    public static void main(String[] args) {
        try {
            ZkClient zkClient = new ZkClient("192.168.1.54:2181",2000);
            zkClient.createEphemeral("/master");
            List<String> children = zkClient.getChildren("/");
            System.out.println(children);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
