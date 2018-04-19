package simpleFactoryMode.operationImpl;/*
 *一句话描述该类作用:
 *@Author:
 *LB
 *
 */

import simpleFactoryMode.Operation;

public class OperationDiv extends Operation{

    @Override
    public double operation() {
        return getNum1()/getNum2();
    }
}
