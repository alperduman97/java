package day23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class c02_Remove_java {
    public static void main(String[] args) {



      String[] harfler=  {"J", "a", "v", "l", "b", "b", "a"};

      //liste çevirelim

        List<String> harfListesi = new ArrayList<>();
        for (int i = 0; i <harfler.length; i++) {

            harfListesi.add(harfler[i]);
            
        }

        System.out.println(harfListesi); //[J, a, v, l, b, b, a]

        //harfleri silebilir miyiz?
        System.out.println(harfListesi.remove("a")); //ilk gördüğü a'yı sildi, bütün ayı silmedi
        System.out.println(harfListesi); // false(delil olarak), [J, v, l, b, b, a]


        System.out.println(harfListesi.remove("x"));
        System.out.println(harfListesi); // false(delil olarak), [J, v, l, b, b, a]

        /* eğer parametre olarak bir obje yazarsak gidip o objeye uyan elementlerden ilk bulduğunu siler.
        Delil olarakta silip silmediğini anlamamız için true/false döndürür.
         */


        System.out.println(harfListesi.remove(2));
        System.out.println(harfListesi); // [J, v, b, b, a] , 2.indekstekini sildi, delil olarakta "l" yi ekranda yaziyor

        harfListesi.remove("b");
        System.out.println(harfListesi); // [J, v, b, a]



        harfListesi.set(1,"");
        System.out.println(harfListesi); // [J, , b, a] //set yazıp yerine bosluk yazdi.
        harfListesi.remove(1);

        System.out.println(harfListesi);// [J, b, a] //boslugu sildik.



        List<String> silinenharfler = new ArrayList<>();
        System.out.println(silinenharfler.add(harfListesi.remove(1)));
        //add yaptığının delili olarak "true" yazdırdı.

        //1- silinen harflere yeni bir element ekledi ve true döndürdü
        //2- harfListesi.remove(1) harf listesindne 1.index'deki b'yi sildi ve bize getirdi
        //3- getirdiği b elementi silinen harflere eklendi
        System.out.println(silinenharfler);   // true,              [b]
        System.out.println(harfListesi); // [J, a]




        String silinenharf = harfListesi.remove(0); //burada 0.indexi harflistesinden sildik,
        silinenharfler.add(silinenharf); //burada da silinenler listesine ekledik



    }

    }
