/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package org.spring.bean.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * spring事件监听器
 *
 * @author zhengweiliang
 * @date 2018/2/13.
 */
@Component
public class PrintEventLinstener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println(applicationEvent.toString());
    }
}
