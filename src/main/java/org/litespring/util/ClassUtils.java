package org.litespring.util;

/**
 * @author caozhibo
 * @version V1.0
 * @description TODO
 * @className ClassUtils
 * @date 2019/7/28 18:11
 */
public class ClassUtils {

    public static ClassLoader getDefaultClassLoader() {
        ClassLoader cl = null;
        try {
            cl = Thread.currentThread().getContextClassLoader();
        }catch (Throwable ex){

        }

        if(cl==null){
            cl = ClassLoader.class.getClassLoader();
            if(cl == null){
                try {
                    cl = ClassLoader.getSystemClassLoader();
                }catch (Throwable ex){

                }

            }
        }
        return cl;
    }
}
