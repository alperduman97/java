package day24_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class c03_ArrayiListHalineDonusturme {
    public static void main(String[] args) {


        Integer[] sayilarArray= {1,2,3,6,7,4,3,5};

        /*

        Bir array'i list haline getirmek için en guvenilir yöntem
        bir llop ile tüm elementleri liste'e kopyalamaktır.

        Aslında daha kısa bir yol vardır ama iki büyük yan etkisi oldugundan bunlara dikkat etmek gerekir.

        1-Oluşturduğumuz Liste Array's class'i ile oluşturduğumuz ekleme/cikarma gibi listenin uzunlugunun degistirecek
        islemlere izin vermez.

        2-Array ve bu array'den olusturulan List birbiri ile bagimli kalir
        birinde sonra yapilan degisiklikler otomatik olarak digerine de islenir.



         */

        List<Integer> sayilarListesi = Arrays.asList(sayilarArray);
        System.out.println(sayilarListesi);  // [1, 2, 3, 6, 7, 4, 3, 5]


        //  sayilar listesine 9 ekleyelim


        //sayilarListesi.add(9); // UnsupportedOperationException

        //Listeden 7'yi silin

        Object silinecekElement = 7;
       // sayilarListesi.remove(silinecekElement); // UnsupportedOperationException


        System.out.println("Sayılar listesi : " + sayilarListesi); //Sayılar listesi : [1, 2, 3, 6, 7, 4, 3, 5]

        System.out.println("SAyilar array'i : " +Arrays.toString(sayilarArray));  // SAyilar array'i : [1, 2, 3, 6, 7, 4, 3, 5]



        // array'in 2.indeksindeki sayiyi 10 yapin

        sayilarArray[2] = 10;

        //update sonrası son durum

        System.out.println("Sayılar listesi : " + sayilarListesi); //Sayılar listesi : [1, 2, 10, 6, 7, 4, 3, 5]
        System.out.println("SAyilar array'i : " +Arrays.toString(sayilarArray)); //SAyilar array'i : [1, 2, 10, 6, 7, 4, 3, 5]




        List<Integer> fiyatList = new ArrayList<>();
        fiyatList.add(10);
        fiyatList.add(20);
        fiyatList.add(30);

        Integer[] kontrolArrayi = {10,20,30};

        //fiyat listesinin, kontrol listesi olarak verilen array ile ayni oldugunu test edin.


        List<Integer> kontrolListesi = Arrays.asList(kontrolArrayi);
        if (fiyatList.equals(kontrolListesi)){

            System.out.println("test PASSED");
        }else {
            System.out.println("test fAILED");
        }





    }
}
