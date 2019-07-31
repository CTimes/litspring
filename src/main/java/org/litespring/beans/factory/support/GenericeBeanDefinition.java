package org.litespring.beans.factory.support;

import org.litespring.beans.BeanDefinition;

/**
 * @author caozhibo
 * @version V1.0
 * @description TODO
 * @className GenericeBeanDefinition
 * @date 2019/7/28 18:06
 */
public class GenericeBeanDefinition implements BeanDefinition {
    private String id;
    private String beanClassName;
//    private boolean singleton = true;
//    private boolean prototype = false;
//    private String scope = SCOPE_DEFAULTT;

    public GenericeBeanDefinition(String id, String beanClassName) {
        this.id = id;
        this.beanClassName = beanClassName;
    }

    public String getBeanClassName() {
        return this.beanClassName;
    }
}
