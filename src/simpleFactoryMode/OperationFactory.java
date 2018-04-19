package simpleFactoryMode;
/*
 *一句话描述该类作用:
 *@Author:
 *LB
 *
 */

import simpleFactoryMode.operationImpl.OperationAdd;
import simpleFactoryMode.operationImpl.OperationDiv;

public class OperationFactory {

    public static Operation getOperation(String operate){

        Operation operation = null;

        switch (operate){
            case "+" : operation = new OperationAdd();
            break;
            case "/" : operation = new OperationDiv();
            break;
        }

        return  operation;

    }
}
