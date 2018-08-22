package proxyMode.jdkProxy.userDaoImpl;
/*
 *一句话描述该类作用:
 *@Author:
 *LB
 *
 */
import proxyMode.jdkProxy.IUserDao;
public class UserDao implements IUserDao{

    @Override
    public void save() {
        System.out.println("已经保存数据");
    }

    @Override
    public void delete() {
        System.out.println("删除数据");
    }
}
