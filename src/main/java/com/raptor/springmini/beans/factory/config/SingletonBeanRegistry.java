package com.raptor.springmini.beans.factory.config;

/**
 * @author 陈文豪(chenwenhao.0401 @ bytedance.com)
 * @version 1.0
 * @date 2022/6/14 10:16
 * @description
 */
public interface SingletonBeanRegistry {
    /**
     * 单例bean获取
     * @param beanName
     * @return
     */
    Object getSingleton(String beanName);
}
