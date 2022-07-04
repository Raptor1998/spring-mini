package com.raptor.springmini.beans;


import com.raptor.springmini.beans.factory.config.AutowireCapableBeanFactory;
import com.raptor.springmini.beans.factory.config.BeanDefinition;
import com.raptor.springmini.beans.factory.config.ConfigurableBeanFactory;
import com.raptor.springmini.beans.factory.exception.BeansException;


public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

}
