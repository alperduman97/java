package day24_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class c05_CiftSayilariSecme {
    public static void main(String[] args) {


        // verilen bir int arrray'den
        // çift sayilari alio
        // ayri bir array olarak kayededin

        int[] arr = {3,5,1,7,9,0,4,2,6,7,8,1,5,8,7,6};


        /* istenen elementleri bir array olarak istediği için
           iki şekilde yapabiliriz;

           1-önce kaç tane çift sayi oldugunu bulur sayiya göre bir array olusturup
           cifft sayilari olusturulan yeni array'e kopyalariz


           2- array'deki tüm elementleri gözden geçirip
           cift olanlari bir listeye atariz
           listenin uzunluguna göre yeni array olusturup listedeki elementleri yeni array'e kopyalariz

         */


                    //array'deki tüm elementleri gözden geçirip
        // çift olanlari bir listeye atariz


        List<Integer>ciftSayilarListesi = new ArrayList<>();

        for (Integer each:arr
             ) {
            if (each % 2 == 0){
                ciftSayilarListesi.add(each);
            }
        }


        System.out.println(ciftSayilarListesi);  // [0, 4, 2, 6, 8, 8, 6]  --çift sayilari aldik


        int[] ciftSayilarArrayi = new int[ciftSayilarListesi.size()]; //uzunlugu çiftsayilarlistesi kadar olan yeni bir array olusturduk
        for (int i = 0; i <ciftSayilarArrayi.length; i++) {

            ciftSayilarArrayi[i] = ciftSayilarListesi.get(i);
        }


        System.out.println("çift sayılar arrayi :" + Arrays.toString(ciftSayilarArrayi));  //çift sayılar arrayi :[0, 4, 2, 6, 8, 8, 6]







    }
}
