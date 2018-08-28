package PrototypeMode;
/*
 *
 * @author LiuBing
 * @date 2018/8/27 16:58
 */

public class Test {

    public static void main(String[] args){
        People p = new People();
        p.setSn("ssss");

        User u = new User();
        u.setName("ddd");
        u.setPeople(p);

        try {
            User u1 = (User) u.clone();
            u1.setName("fff");
            System.out.println(u1==u);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
