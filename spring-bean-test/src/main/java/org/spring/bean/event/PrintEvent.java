/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package org.spring.bean.event;

import org.springframework.context.ApplicationEvent;

/**
 * 事件类
 * @author zhengweiliang
 * @date 2018/2/13.
 */
public class PrintEvent extends ApplicationEvent {
    public PrintEvent(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "print event occur!" + source;
    }
}
