package day21_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class c01_StringsSplitMethodu {
    public static void main(String[] args) {



       String str = "Java gun gectikce guzellesiyor";
       //e harflerinden parçalara ayırın
        System.out.println(Arrays.toString(str.split("e"))); //  [Java gun g, ctikc,  guz, ll, siyor]

        //cümleyi kelimelere ayır

        System.out.println(Arrays.toString(str.split(" "))); // [Java, gun, gectikce, guzellesiyor]

        //metni "gec" ten ayır
        System.out.println(Arrays.toString(str.split("gec"))); // Java gun , tikce guzellesiyor]



        //verilen bir arama sonucunda
        // arama sonucunun 1000'den fazla olduğunu test edin


        String aramaSonucu = "1-48 of over 5,000 results for java";
        String[] kelimeler = aramaSonucu.split(" ");
        System.out.println(Arrays.toString(kelimeler)); // 1-48, of, over, 5,000, results, for, java]

        String aramaSonucSayisiStr= kelimeler[3]; // 5,000
        aramaSonucSayisiStr=aramaSonucSayisiStr.replaceAll("\\D", ""); //5000
        int aramaSonucSayisi = Integer.parseInt(aramaSonucSayisiStr); // int 5000
        if (aramaSonucSayisi > 1000){
            System.out.println("Arama sonuc sayısı testi PASSED");
        }else{
            System.out.println("Arama sonuc sayisi testi FAILED");
        }













    }
}
