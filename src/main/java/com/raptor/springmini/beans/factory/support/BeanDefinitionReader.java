package com.raptor.springmini.beans.factory.support;

import com.raptor.springmini.beans.factory.exception.BeansException;
import com.raptor.springmini.core.io.Resource;
import com.raptor.springmini.core.io.ResourceLoader;

/**
 * @author 陈文豪(chenwenhao.0401 @ bytedance.com)
 * @version 1.0
 * @date 2022/7/4 20:04
 * @description
 */
public interface BeanDefinitionReader {
    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

}
