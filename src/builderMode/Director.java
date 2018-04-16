package builderMode;

/**
 * 指挥者
 */
public class Director {

    public void construct(Builder builder){

        builder.buildPartA();
        builder.buildPartB();

    }

}
