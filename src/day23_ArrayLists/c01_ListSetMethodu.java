package day23_ArrayLists;

import java.util.ArrayList;
import java.util.List;


public class c01_ListSetMethodu {
    public static void main(String[] args) {


        List<String> harfler = new ArrayList<>();
        harfler.add("J");
        harfler.add("a");
        harfler.add("v");
        harfler.add("a");

        System.out.println(harfler); // [J, a, v, a]

        //b ile sonraki a arasina "c" ekleyin!!!!
        harfler.add(4,"c");
        System.out.println(harfler); //J, a, v, a, c]


        //c harfini b olarak update edin(degistirin)!!!
        harfler.set(4,"b");
        System.out.println(harfler); //[J, a, v, a, b]

        harfler.add(3,"k"); //bu ekler

        System.out.println(harfler); // [J, a, v, k, a, b]
        harfler.set(3,"l"); // bu değiştirir

        System.out.println(harfler); // [J, a, v, l, a, b]





    }
}
