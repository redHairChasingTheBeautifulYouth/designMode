package decoratorMode.main;
/*
 *一句话描述该类作用:
 *@Author:
 *LB
 *
 */

import decoratorMode.componentImpl.ConcreteComponent;
import decoratorMode.componentImpl.decoratorImpl.ConcreteDecorator_A;
import decoratorMode.componentImpl.decoratorImpl.ConcreteDecorator_B;

public class Test {

    public static void main(String[] arges){
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecorator_A concreteDecorator_a = new ConcreteDecorator_A();
        ConcreteDecorator_B concreteDecorator_b = new ConcreteDecorator_B();
       /* concreteDecorator_a.setComponent(concreteComponent);
        concreteDecorator_b.setComponent(concreteComponent);
        concreteDecorator_b.operation();*/
        concreteDecorator_a.setComponent(concreteDecorator_b);
        concreteDecorator_b.setComponent(concreteComponent);
        concreteDecorator_a.operation();
    }
}
