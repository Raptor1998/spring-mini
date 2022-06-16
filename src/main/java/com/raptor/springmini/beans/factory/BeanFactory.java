package com.raptor.springmini.beans.factory;

/**
 * @author 陈文豪(chenwenhao.0401 @ bytedance.com)
 * @version 1.0
 * @date 2022/6/14 10:12
 * @description
 */
public interface BeanFactory {
    /**
     * get bean接口
     * @param beanName
     * @return
     */
    Object getBean(String beanName);
}
