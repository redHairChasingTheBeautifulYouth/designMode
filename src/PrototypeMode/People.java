package PrototypeMode;
/*
 *
 * @author LiuBing
 * @date 2018/8/27 16:55
 */

public class People implements Cloneable{

    private String sn;

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public String toString() {
        return "People{" +
                "sn='" + sn + '\'' +
                '}';
    }
}
