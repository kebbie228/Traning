package Generic;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al1= new ArrayList<>();
        al1.add(10);
        al1.add(1);
        al1.add(33 );
        System.out.println(GenMethod.getSecondElement(al1));

        ArrayList<String> al2= new ArrayList<>();
        al2.add("Ada");
        al2.add("V");
        al2.add("oda");
        System.out.println(GenMethod.getSecondElement(al2 ));


    }
}

class GenMethod{
    public static <T> T getSecondElement(ArrayList<T> al1){
        return al1.get(1);
    }

}