package proxyMode.cglibProxy.main;/*
 *一句话描述该类作用:
 *@Author:
 *LB
 *
 */

import proxyMode.cglibProxy.ProxyFactory;
import proxyMode.jdkProxy.userDaoImpl.UserDao;

public class Test {
    /**
     * 通過生成一個被帶離對象的子類，然後重寫弗雷德方法，生成以後的對象可以强制轉換爲被帶離的對象（自己寫的類）
     * @param arges
     */
    public static void main(String[] arges){

        //代理对象
        UserDao proxy = (UserDao)new ProxyFactory().getProxyInstance(UserDao.class);

        //执行代理对象的方法
        proxy.save();

    }
}
