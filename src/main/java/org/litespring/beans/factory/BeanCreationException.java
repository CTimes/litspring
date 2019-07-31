package org.litespring.beans.factory;

import org.litespring.beans.BeansException;

/**
 * @author caozhibo
 * @version V1.0
 * @description TODO
 * @className BeanCreationException
 * @date 2019/7/28 18:36
 */
public class BeanCreationException extends BeansException {
    private String beanName;


    public BeanCreationException(String message) {
        super(message);
    }

    public BeanCreationException(String message, Throwable cause) {
        super(message, cause);
    }

    public BeanCreationException(String beanName, String msg) {
        super("Error creating bean with name '" + beanName + "': " + msg);
        this.beanName = beanName;
    }

    public BeanCreationException(String beanName, String msg, Throwable cause) {
        this(beanName, msg);
        initCause(cause);
    }
    public String getBeanName(){
        return this.beanName;
    }
}
