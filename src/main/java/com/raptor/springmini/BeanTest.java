package com.raptor.springmini;

import com.raptor.springmini.beans.factory.config.BeanDefinition;
import com.raptor.springmini.beans.factory.support.DefaultListableBeanFactory;
import com.raptor.springmini.demobean.UserService;

/**
 * @author 陈文豪(chenwenhao.0401 @ bytedance.com)
 * @version 1.0
 * @date 2022/6/16 14:36
 * @description
 */
public class BeanTest {
    public static void main(String[] args) {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.第一次获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.sayHello();

        // 4.第二次获取 bean from Singleton
        UserService userService_singleton = (UserService) beanFactory.getSingleton("userService");
        userService_singleton.sayHello();
    }
}
