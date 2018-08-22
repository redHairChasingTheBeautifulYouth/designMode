package proxyMode.jdkProxy.myPorxy;
/*
 *一句话描述该类作用:【】
 *@Author:LB
 *
 */

import java.lang.reflect.Method;

public class Meipo implements MyInvocationHandler{

    private Object target;


    public Object getInstance(Object obj) throws Exception {
        this.target = obj;
        Class cla = target.getClass();
        return MyProxy.newProxyInstance( new MyClassLoad() ,cla.getInterfaces() ,this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始事务");
        method.invoke(this.target ,args);
        System.out.println("提交事务");
        return null;
    }
}
