package com.cpp.zk;

import org.I0Itec.zkclient.ZkClient;

/**
 * 用zk来做统一命名服务
 * Created by cpp on 2018/3/30.
 */
public class ZkIdMaker {
    static ZkClient zkClient = new ZkClient("192.168.1.54:2181", 2000);
    static String path = "/id-sequential/";

    public static void main(String[] args) {
        try {
            zkClient.createPersistent(path);
        } catch (RuntimeException e) {
        }
        System.out.println(getId(false));
    }

    public static int getId(boolean deleteInCurrentThread) {
        String persistentSequential = zkClient.createPersistentSequential(path, "");
        if (deleteInCurrentThread) {
            boolean delete = zkClient.delete(persistentSequential);
            System.out.println(delete);
        } else {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    boolean delete = zkClient.delete(persistentSequential);
                    System.out.println(delete);
                }
            });
        }

        return Integer.parseInt(persistentSequential.replace(path, ""));
    }


}
