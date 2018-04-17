package decoratorMode.componentImpl.decoratorImpl;/*
 *一句话描述该类作用:
 *@Author:
 *LB
 *
 */

import decoratorMode.componentImpl.Decorator;

public class ConcreteDecorator_A extends Decorator{

    private String concreteDecorator_A_doSomething;

    @Override
    public void operation() {
        super.operation();
        concreteDecorator_A_doSomething = "做事A";
        System.out.println("新添装饰对象A的功能");
    }
}
