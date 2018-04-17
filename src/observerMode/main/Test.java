package observerMode.main;/*
 *一句话描述该类作用:测试
 * 当一个类的改变需要其他类一起改变的时候，接触耦合，让双方都依赖于抽象，而不依赖与具体，使各自的变化都不影响双方
 *@Author:
 *LB
 *
 */

import observerMode.observerImpl.ConcreteObserver;
import observerMode.subjectImpl.ConcreteSubject;

public class Test {

    public static void main(String[] arges){

        ConcreteSubject subject = new ConcreteSubject();
        subject.addObserver(new ConcreteObserver("X",subject));
        subject.addObserver(new ConcreteObserver("Y",subject));
        subject.setSubjectState("ABC");
        subject.notifyObserver();

    }
}
