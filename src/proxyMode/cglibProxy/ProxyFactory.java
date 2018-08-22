package proxyMode.cglibProxy;/*
 *一句话描述该类作用:
 *@Author:
 *LB
 *
 */

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {



    //给目标对象创建一个代理对象
    //
    public Object getProxyInstance(Class c){
        //1.工具类
        Enhancer en = new Enhancer();
        //2.设置父类
        en.setSuperclass(c);
        //3.设置回调函数
        en.setCallback(this);
        //4.创建子类(代理对象)
        return en.create();

    }

    /**
     * 实现字节码重组，
     * @param o 引用是由cjlib自己new出來的，即被帶離對象的子類
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始事务...");

        //执行目标对象的方法
        Object returnValue = methodProxy.invokeSuper(o, objects);

        System.out.println("提交事务...");

        return returnValue;

    }
}
