package builderMode.builderImpl;

/*
 *一句话描述该类作用:具体建造者2
 *@Author:
 *LB
 *
 */

import builderMode.Builder;
import builderMode.Product;

public class ConcreteBuilder1 extends Builder {

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件A");
    }

    @Override
    public void buildPartB() {
        product.add("部件B");
    }

    @Override
    public Product getResult() {

        return product;
    }
}
