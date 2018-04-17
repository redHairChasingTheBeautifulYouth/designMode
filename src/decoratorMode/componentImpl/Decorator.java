package decoratorMode.componentImpl;
/*
 *一句话描述该类作用:装饰抽象类
 *@Author:
 *LB
 *
 */

import decoratorMode.Component;

public abstract class Decorator implements Component{

    protected Component component;

    @Override
    public void operation() {
        if(null != component){
            component.operation();
        }
    }

    public void setComponent(Component component) {
        this.component = component;
    }
}
