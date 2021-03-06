package com.raptor.springmini.beans.factory.support;

import com.raptor.springmini.beans.factory.config.BeanDefinition;
import com.raptor.springmini.beans.factory.exception.BeansException;

import java.lang.reflect.Constructor;

/**
 * @author 陈文豪(chenwenhao.0401 @ bytedance.com)
 * @version 1.0
 * @date 2022/6/16 15:43
 * @description
 * 实例化策略接口
 * 在实例化接口 instantiate 方法中添加必要的入参信息，包括：beanDefinition、 beanName、ctor、args
 * java.lang.reflect 包下的 Constructor 类，里面包含了一些必要的类信息，有这个参数的目的就是为了拿到符合入参信息相对应的构造函数。
 * 而 args 就是一个具体的入参信息了，最终实例化时候会用到。
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
