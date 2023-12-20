package day16_methodOlusturma_methodOverloading;

public class c05_MethodOverloading {
    public static void main(String[] args) {

        //verilen iki sayiyi toplayip, sonucu yazdiran bir method olusturun
        // bize bir şey yazdıracak yani "vodi" !!


        toplaYazdir(5, 7); //iki int'in toplami::12
        toplaYazdir(7.4,6); // double ve int'in toplami:: 13.4
        toplaYazdir("Ali", 5); //double ve int'in toplami:Ali5

        // toplaYazdir(5,5.4); --> 5 ile 5.4'in yerleri yanlış oldugundan yazdıramadı
        toplaYazdir('4','a'); //a = 97 (ASCII) , '4' = 52; char karsılıngdaki ASCII kodları degerlerini otomatik aldi.
        //İki int'in toplami:149  -- toplaYazdir(char,char) yok ama char ASCII sayesinde
        // int'a donusebildigi icin toplaYazdir(int,int) methodu kullanabiliriz.






        toplaYazdir(3.5f, 5); //3.5f= float (float'ta f yazmak zorundaydık)
        //float double degildir ama auto widening ile double bir degiskene
        // float bir deger atayabiliriz

    }

    public static void toplaYazdir(int sayi1, int sayi2) {
        System.out.println("İki int'in toplami:" + (sayi1 + sayi2));


    }
    //parametle isimlerini değiştirerek aynı methodu 2'kere olusturabilir miyiz?
    //yazdıramayız!
    // Java Parametrelerin adina degil daha turune bakiyor



    /* Java da method ismi ve parametlerin data türleri birlikte dusunuldugunde ortaya cilan
    metne "METHOD SIGNATURE" denir.

   toplayazdir(int,int)

   Java methodlardaki method signature'ina bakar
   ayni method signature'ina sahip birden fazla method olusturmaniza IZIN VERMEZ!
     */


    public static void toplaYazdir(double a, int b) {
        System.out.println("double ve int'in toplami:" + (a + b));
    }


    public static void toplaYazdir(String a, int b) {
        System.out.println("double ve int'in toplami:" + (a + b));

    }
}
