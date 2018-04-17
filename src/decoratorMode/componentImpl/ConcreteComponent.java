package decoratorMode.componentImpl;
/*
 *一句话描述该类作用:具体的装饰对象
 *@Author:
 *LB
 *
 */

import decoratorMode.Component;

public class ConcreteComponent implements Component{
    @Override
    public void operation() {
        System.out.println("原来对象中的功能");
    }
}
