package org.litespring.beans.factory;

import org.litespring.beans.BeanDefinition;

/**
 * @author caozhibo
 * @version V1.0
 * @description TODO
 * @className BeanFactory
 * @date 2019/7/28 17:35
 */
public interface BeanFactory {

    BeanDefinition getBeanDefiniton(String beanID);

    Object getBean(String beanID);
}
