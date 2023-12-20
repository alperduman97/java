package day24_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class c04_ForEachLoopIleListedekiSayilariToplama {
    public static void main(String[] args) {


        /*
        For-Each-Loop; birden cok element barindiran yapilar icin kullanilir.

        For-each-Loop'un görevi; verdigimiz cok eleman barındıran yapıdaki tüm elementleri bize getirir.

         Bu işlem icin for-each-loop'a 3 bilgi gereklidir.
         1-Bize getireceği elementlerin data türü
         2- Loop icinde bu elementlere vereceğimiz isim (bizim oglanin adi)
         3-Bu elementleri nereden alıp bize getireceği


         for-each-loop index kullanmadığı için  elementleri sıralı getirme mecburiyeti yoktur.
         Bu yüzden her zaman sıralı getirir  diyemeyiz ama genelde sıralı getirir.

         */

        Integer[] arr = {3, 5, 1, 2, 6, 4, 5, 1, 7, 8, 4, 2, 5, 6};
        List<Integer> sayilar = new ArrayList<>();

        // Index kullanmadan arr'deki tüm elementleri
        // sayilar listesine kopyalayin

        for (Integer each : arr
        ) {
            sayilar.add(each);
        }


        System.out.println(sayilar); // [3, 5, 1, 2, 6, 4, 5, 1, 7, 8, 4, 2, 5, 6]


        // index kullanmadan sayilar listesindeki  //index kullanmadan diyorsa tek bir alterrnatif var oda foreachloop
        // tüm elementlerin toplamini yazdirin

        int toplam = 0;
        for (Integer each: sayilar
             ) {
            toplam += each;
        }


        System.out.println(toplam);  // 59




    }








    }

