/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package org.spring.bean.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Controller;

/**
 * 事件发布
 *
 * @author zhengweiliang
 * @date 2018/2/13.
 */
@Controller
public class TestPrint implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;
    /**
     * 在print时发送打印事件
     */
    public void print() {
        System.out.println("print event trigger");
        PrintEvent event = new PrintEvent(this);
        publisher.publishEvent(event);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}
