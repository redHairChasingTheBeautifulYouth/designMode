package decoratorMode.main;
/*
 *一句话描述该类作用:装饰模式在系统新增功能，向旧的类中添加新的代码，但这些逻辑只有在特定情况下才会执行的特殊行为，当需要执行特殊行为时有选择的使用装饰功能
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
