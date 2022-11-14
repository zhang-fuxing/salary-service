package com.zhangfx.salary.exception;

/**
 * @author 张福兴
 * @version 1.0
 * @date 2022/11/14
 * @email zhangfuxing1010@163.com
 */
public class ParamException extends RuntimeException {
    public ParamException() {
    }

    public ParamException(String message) {
        super(message);
    }
}
