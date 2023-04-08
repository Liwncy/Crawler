package com.codefishing.crawler.websocket;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.lang.NonNull;

import javax.websocket.server.ServerEndpointConfig;

/**
 * @description 通信节点配置类
 */
public class MyEndpointConfigure extends ServerEndpointConfig.Configurator implements ApplicationContextAware {
    private static volatile BeanFactory content;

    @Override
    public <T> T getEndpointInstance(Class<T> clazz) {
        return content.getBean(clazz);
    }

    @Override
    public void setApplicationContext(@NonNull ApplicationContext applicationContext) throws BeansException {
        MyEndpointConfigure.content = applicationContext;
    }
}
