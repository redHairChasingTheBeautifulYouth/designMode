package builderMode;
/*
 *
 * 产品类
 */

import java.util.ArrayList;
import java.util.List;

public class Product {

    private List<String> parts = new ArrayList<String>();

    public void add(String part){
        parts.add(part);
    }
    public void show(){
        for(String part : parts){

            System.out.print(part);

        }
    }

}
