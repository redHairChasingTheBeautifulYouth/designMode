package simpleFactoryMode.main;
/*
 *一句话描述该类作用:
 *@Author:
 *LB
 *
 */

import simpleFactoryMode.Operation;
import simpleFactoryMode.OperationFactory;

public class Test {

    public static void main(String[] arges){
        Operation operation = OperationFactory.getOperation("+");
        operation.setNum1(4);
        operation.setNum2(6);
        System.out.println(operation.operation());

    }
}
