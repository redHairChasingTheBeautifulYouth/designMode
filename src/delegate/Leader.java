package delegate;
/*
 *
 * @author LiuBing
 * @date 2018/8/28 9:28
 */

import java.util.HashMap;
import java.util.Map;

public class Leader implements ITarget{
    private Map<String,ITarget> targets = new HashMap<String,ITarget>();

    //在这里根据策略委派任务
    public Leader() {
        targets.put("加密",new TargetA());
        targets.put("登录",new TargetB());
    }
    //项目经理自己不干活
    public void doing(String command){
        targets.get(command).doing(command);
    }
}
