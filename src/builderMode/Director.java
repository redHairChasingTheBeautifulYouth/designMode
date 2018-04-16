package builderMode;

/**
 * 指挥者
 */
public class Director {

    public void onstruct(Builder builder){

        builder.buildPartA();
        builder.buildPartB();

    }

}
