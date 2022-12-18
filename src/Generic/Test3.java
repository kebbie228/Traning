package Generic;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<?> list = new ArrayList<String>();
        // list.add("Helo");

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.13);
        list1.add(3.16);
        showListinfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Hello");
        list2.add("Byue");
        list2.add("Zaur");
        showListinfo(list2);

        //   List<? extends Number> list30=new ArrayList<>();
        ArrayList<Double> al2 = new ArrayList<>();
        al2.add(3.14);
        al2.add(3.70);
        al2.add(3.16);
        System.out.println(sum( al2));
        ArrayList<Double>  al3 = new ArrayList<>();
        al3.add(3.14);
        al3.add(3.70);
        al3.add(3.16);
        System.out.println(sum(al3));
    }



    static void showListinfo(List<?> list) {
        System.out.println("List include next elements: " + list);
    }

    public static double sum(ArrayList<? extends Number> al) {
        double sum = 0;
        for (Number n : al) sum += n.doubleValue();
        return sum;
    }
}

