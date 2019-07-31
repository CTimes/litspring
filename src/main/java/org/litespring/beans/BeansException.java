package org.litespring.beans;

/**
 * @author caozhibo
 * @version V1.0
 * @description TODO
 * @className BeansException
 * @date 2019/7/28 18:35
 */
public class BeansException extends RuntimeException{
    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}
