package day43_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C01_MapOlusturmaElementEkleme {
    public static void main(String[] args) {

        /*
        Bir öğrenciyi MAP'e eklemek için "put"(key,value) kullanırız

        Bir öğrencinin value'sine ulaşmak isterseniz;
        - ogrenciMap.get(ogrenciNo) ile String olarak tüm value'yi kaydederiz
        - value, pek çok bilgi barındırdığından, her bir bilgiye ulaşmak için
            value.split("-") ile value'yu "array"e çeviririz.
        - array'deki tüm bilgilerin index'lerine sahip olduğumuzdan istenen bilgileri array'den alıp yazdirabilir veya kullanabiliriz.


         */

        Map<Integer, String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101, "Ali-Can-10-K-MF");
        //bu öğrenci için key : 101
        // value : "Ali-Can-10-K-MF"
        //value String olmak zorunda değil; list, array, Integer, Map, Queue da olabilir.

        String value101 = ogrenciMap.get(101);
        System.out.println(ogrenciMap.get(101));




        //101 numaralı öğrencisinin soy ismini yazdırın ?

        String[] ogrenci101BiglierArr = value101.split("-");
        System.out.println(Arrays.toString(ogrenci101BiglierArr));

        System.out.println("101 numarali öğrenci soyismi : " + ogrenci101BiglierArr[1]);

        //101 numaralı öğrencinin bölümünü yazdırın
        System.out.println("101 numaralı öğrencinin bölümü : "+ ogrenci101BiglierArr[4]);

        //101 numaralı öğrencinin isim ve soyismini yazdırın
        System.out.println("101 numaralı öğrencinin isim ve soyismi : " +ogrenci101BiglierArr[0] +" "+ogrenci101BiglierArr[1]);

        //101 numarali öğrencinin isim ve soyisim yazdirin, soyisim büyük harf olarak yazdirilsin
        System.out.println("101 numaralı öğrencinin isim ve soyismi : " +ogrenci101BiglierArr[0] +" "+ogrenci101BiglierArr[1].toUpperCase());
    }
}
