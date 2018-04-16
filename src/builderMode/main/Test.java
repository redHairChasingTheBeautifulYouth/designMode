package builderMode.main;/*
 *一句话描述该类作用:
 *@Author:
 *LB
 *
 */

import builderMode.Builder;
import builderMode.ConcreteBuilder1;
import builderMode.Director;
import builderMode.Product;

public class Test {


    public static void main(String[] args){
        Builder builder1 = new ConcreteBuilder1();
        Director director = new Director();
        director.construct(builder1);
        Product product = builder1.getResult();
    }

}
