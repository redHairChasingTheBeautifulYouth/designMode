package observerMode.subjectImpl;
/*
 *一句话描述该类作用:具体通知者
 *@Author:
 *LB
 *
 */

import observerMode.Subject;

public class ConcreteSubject extends Subject {

    //具体观察者状态
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
