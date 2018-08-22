package proxyMode.jdkProxy.myPorxy;
/*
 *一句话描述该类作用:【】
 *@Author:LB
 *
 */

import java.lang.reflect.Method;

public interface MyInvocationHandler {

    Object invoke(Object proxy, Method method, Object[] args) throws Throwable;

}
