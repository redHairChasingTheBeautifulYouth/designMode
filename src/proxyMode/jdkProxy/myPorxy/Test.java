package proxyMode.jdkProxy.myPorxy;
/*
 *一句话描述该类作用:
 *@Author:
 *LB
 *
 */

import proxyMode.jdkProxy.IUserDao;
import proxyMode.jdkProxy.ProxyFactory;
import proxyMode.jdkProxy.userDaoImpl.UserDao;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {

    public static void main(String[] arges) {
        try {
            //生成代理类，加载到jvm中
            IUserDao IuserDao = (IUserDao) new Meipo().getInstance(new UserDao());
            IuserDao.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
