package proxyMode.jdkProxy.main;
/*
 *一句话描述该类作用:
 *@Author:
 *LB
 *
 */

import proxyMode.jdkProxy.IUserDao;
import proxyMode.jdkProxy.ProxyFactory;
import proxyMode.jdkProxy.userDaoImpl.UserDao;

public class Test {

    public static void main(String[] arges){
        // 目标对象
        IUserDao target = new UserDao();
        // 【原始的类型 】
        System.out.println(target.getClass());

        // 给目标对象，创建代理对象
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        // class $Proxy0   内存中动态生成的代理对象
        System.out.println(proxy.getClass());

        // 执行方法   【代理对象】
        proxy.save();

    }
}
