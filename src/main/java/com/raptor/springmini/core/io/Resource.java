package com.raptor.springmini.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 陈文豪(chenwenhao.0401 @ bytedance.com)
 * @version 1.0
 * @date 2022/7/4 18:32
 * @description
 */
public interface Resource {
    InputStream getInputStream() throws IOException;
}
