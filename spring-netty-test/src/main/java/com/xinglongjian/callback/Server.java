/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.xinglongjian.callback;

/**
 * @author zhengweiliang
 * @date 2018/3/1.
 */
public class Server {

    private StartListener startListener;
    public void addListener(StartListener startListener) {
        this.startListener = startListener;
    }

    public void start() {
        startListener.start();
    }
}
