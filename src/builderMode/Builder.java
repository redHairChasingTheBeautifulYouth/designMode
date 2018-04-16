package builderMode;

/*
* 抽象建造者类
*
* */

public abstract  class Builder {

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract Product getResult();

}
