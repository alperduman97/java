package day24_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class c07_ArrayiDuzenleme {
    public static void main(String[] args) {


// Soru 3- Verilen String bir List’deki her bir elementi kontrol edip,
// - Kelimenin uzunlugu cift sayi ise ilk yarisini
// Kelimenin uzunlugu tek sayi ise
// ortadaki harf dahil ikinci yarisini yeni bir listeye ekleyip yazdirin.


        List<String> isimler = new ArrayList<>();
        isimler.add("Kaan");
        isimler.add("Sedat");
        isimler.add("Asli");
        isimler.add("Yakup");
        isimler.add("Saido");
        isimler.add("Sabri");



        List<String>yeniList = new ArrayList<>();

        for (String each: isimler
             ) {
            if (each.length() % 2 == 0){ //kelimenin uzunluğu çift ise

                yeniList.add(each.substring(0,each.length()/2));


            }else { //kelimenin uzunluğu tek ise

                yeniList.add(each.substring(each.length()/2));


            }
        }


        System.out.println(yeniList); // [Ka, dat, As, kup, ido, bri]






    }
}
