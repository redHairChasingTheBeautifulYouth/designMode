package decoratorMode.componentImpl.decoratorImpl;/*
 *一句话描述该类作用:
 *@Author:
 *LB
 *
 */

import decoratorMode.componentImpl.Decorator;

public class ConcreteDecorator_B extends Decorator{

    private String concreteDecorator_B_doSomething;

    @Override
    public void operation() {
        super.operation();
        concreteDecorator_B_doSomething = "做事B";
        System.out.println("新添装饰对象B的功能");
    }

    public void only_B_have(){

    }
}
