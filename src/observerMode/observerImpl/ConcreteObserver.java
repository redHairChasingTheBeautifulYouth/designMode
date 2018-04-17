package observerMode.observerImpl;
/*
 *一句话描述该类作用:具体观察者
 *@Author:
 *LB
 *
 */

import observerMode.Observer;
import observerMode.subjectImpl.ConcreteSubject;

public class ConcreteObserver implements Observer {

    private String observerName;
    private String observerState;
    private ConcreteSubject subject;

    public ConcreteObserver(String observerName, ConcreteSubject subject) {
        this.observerName = observerName;
        this.subject = subject;
    }

    @Override
    public void update() {
        observerState = subject.getSubjectState();
        System.out.println("观察者"+observerName+"的新状态为"+observerState);
    }

    public ConcreteSubject getSubject() {
        return subject;
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }
}
