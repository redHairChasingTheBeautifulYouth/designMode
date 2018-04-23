package proxyMode.cglibProxy.main;/*
 *一句话描述该类作用:
 *@Author:
 *LB
 *
 */

import proxyMode.cglibProxy.ProxyFactory;
import proxyMode.jdkProxy.userDaoImpl.UserDao;

public class Test {
    public static void main(String[] arges){
        //目标对象
        UserDao target = new UserDao();

        //代理对象
        UserDao proxy = (UserDao)new ProxyFactory(target).getProxyInstance();

        //执行代理对象的方法
        proxy.save();

    }
}
