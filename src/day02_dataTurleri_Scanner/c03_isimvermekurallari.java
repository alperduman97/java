package day02_dataTurleri_Scanner;

public class c03_isimvermekurallari {
    public static void main(String[] args) {


        int NOT = 23;
        int not = 54;
        int Not = 45;
        int noT = 65;

        /* variable (değişken)  isimler case sensitive(büyük-küçük harf duyarlıdır). Yukarıdaki her değişken farklı
        oluyor) */

        System.out.println(NOT); //23
        System.out.println(not); //54


        //Camelcase
        int karneNotu = 65;
        String isminIlkHarfi = "A";  // bu da olur

        //String ISMINILKHARFI = "K";  // bu da olur

        /* eğer variable ismi birden fazla kelimeden oluşuyorsa ilk harf küçük, sonraki kelimelerin ilk harfi büyük
        sonraki harfler küçük yazılır. Buna da "Camelcase,, denir.
        Farklı şekilde de yazılırsa Java kabul eder ama tüm yazılımcılar tarafından ortak olarak belirlener
        kullanım kurallarına uymak bizim tecrübemizi gösterir.

         */

        int benimAdımAlper = 26;   //ctrl+alt+L ye basınca satırı otamatik olarak düzeltir.


    }
}
