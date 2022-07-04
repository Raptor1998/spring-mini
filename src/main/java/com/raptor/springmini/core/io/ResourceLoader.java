package com.raptor.springmini.core.io;

/**
 * @author 陈文豪(chenwenhao.0401 @ bytedance.com)
 * @version 1.0
 * @date 2022/7/4 18:32
 * @description
 */
public interface ResourceLoader {
    
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
