package proxyMode.jdkProxy;
/*
 *一句话描述该类作用:创建动态代理对象
 * 动态代理不需要实现接口,但是需要指定接口类型
 *
 * 原理：
 * 1.拿到被代理对象的引用，然后获取它的接口
 * 2.JDK代理重新生成一个类，同时实现我们给的代理对象所实现的接口
 * 3.把被代理的对象的引用也拿到了
 * 4.重新动态生成一个class字节码
 * 5.然后编译
 *
 *@Author:
 *LB
 *
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开始事务");
                        //执行目标对象方法
                        Object returnValue = method.invoke(target, args);
                        System.out.println("提交事务");
                        return returnValue;

                    }
                });
    }
}
