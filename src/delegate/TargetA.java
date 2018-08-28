package delegate;
/*
 *
 * @author LiuBing
 * @date 2018/8/28 9:28
 */

public class TargetA implements ITarget{
    public void doing(String command) {
        System.out.println("我是员工A，我现在开始干" + command + "工作");
    }
}
