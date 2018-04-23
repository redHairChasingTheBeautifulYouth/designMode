package proxyMode.staticProxy.subjectImpl;/*
 *一句话描述该类作用:
 *@Author:
 *LB
 *
 */

import proxyMode.staticProxy.Subject;

public class RealSubject extends Subject {
    @Override
    public void request() {
        System.out.println("真实的请求");
    }
}
