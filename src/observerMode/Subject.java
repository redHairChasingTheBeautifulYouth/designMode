package observerMode;
/*
 *一句话描述该类作用: 抽象通知者
 *@Author:
 *LB
 *
 */

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    //抽象观察者依赖抽象通知者
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObsever(Observer observer){
        observers.remove(observer);
    }

    public void notifyObserver(){
        for(Observer observer : observers){
            observer.update();
        }
    }

}
