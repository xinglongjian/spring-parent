/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.xinglongjian.callback;

/**
 * @author zhengweiliang
 * @date 2018/3/1.
 */
public class TestMain {

    public static void main(String[] args) {
        Server server = new Server();
        server.addListener(new StartListener() {
            @Override
            public void start() {
                System.out.println("Started!!!");
            }
        });
        server.start();
    }
}
