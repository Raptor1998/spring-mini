package com.raptor.springmini.beans.factory.support;

import com.raptor.springmini.beans.factory.config.BeanDefinition;

/**
 * @author 陈文豪(chenwenhao.0401 @ bytedance.com)
 * @version 1.0
 * @date 2022/6/14 10:54
 * @description
 */
public interface BeanDefinitionRegistry {
    /**
     * 原材料注册
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
