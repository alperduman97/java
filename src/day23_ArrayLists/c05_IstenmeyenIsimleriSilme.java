package day23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class c05_IstenmeyenIsimleriSilme {
    public static void main(String[] args) {

        //Soru 3- Verilen String bir listede
//        istenmeyen harf iceren elementleri silip,
//        kalan kismini list olarak bize donduren bir method olusturun


        List<String> isimler = new ArrayList<>();
        isimler.add("Meltem");
        isimler.add("Ramazan");
        isimler.add("Saido");
        isimler.add("Kaan");
        isimler.add("Kamil");
        isimler.add("Eren");


        String istenmeyenHarf = "e";
        System.out.println(isimler); //[Meltem, Ramazan, Saido, Kaan, Kamil, Eren]

        List<String> silinmeyecekIsimler=new ArrayList<>();

        for (int i = 0; i < isimler.size(); i++) {

            if (!isimler.get(i).contains(istenmeyenHarf)){  //array'de isimler[i] idi, list'lerde get(i)

                silinmeyecekIsimler.add(isimler.get(i));


            }


        }

                    isimler=silinmeyecekIsimler;
        System.out.println(isimler);  // [Ramazan, Saido, Kaan, Kamil]


        //başka bir listeye  atamadan da
        //direkt silme yapabilir miyiz?

        istenmeyenHarf = "a";

        for (int i = 0; i <isimler.size() ; i++) {
           if ( isimler.get(i).contains(istenmeyenHarf)){
               isimler.remove(isimler.get(i));
               i--; // isim silindiği için bi öncekinden kontrol etmesini sağlıyoruz.
           }
        }

        System.out.println(isimler); // [];










    }



}
