package builderMode.main;
/*
 *一句话描述该类作用: 生成器模式为生成复杂不同对象时使用，且这些对象拥有相同的特征只是特征不同
 *@Author:
 *LB
 *
 */

import builderMode.Builder;
import builderMode.builderImpl.ConcreteBuilder1;
import builderMode.Director;
import builderMode.Product;

public class Test {


    public static void main(String[] args){
        Builder builder1 = new ConcreteBuilder1();
        Director director = new Director();
        director.construct(builder1);
        Product product = builder1.getResult();
        product.show();
    }

}
