package day02_dataTurleri_Scanner;

import java.sql.SQLOutput;

public class c01dataturleri {


    public static void main(String[] args) {


        int sayi = 23; //hafiyada 32'bitlik yer kaplar
        byte sayi1 = 23; //hafiyada 8'bitlik yer kaplar
        short sayi2 = 23; //hafizada 32'bitlik yer kaplar
        long sayi3 = 23; //hafizada 64'bitlik yer kaplar

        char ch = '4';
        char ch1 = ' '; //space(bosluk) da  bir karakter olarak tanimlanabilinir.
        // char ch2 = '4 '; <>>>>>4"un yaninda bosluk var bu yuzden hata veriyor. Boslukta bir karakterdir.


        String str1 = "Java Candir"; //Metinsel ifadeleri yazariz.
        String str2 = "5301340097" ;  // telefon numarasini bilgi icin kaydederken string kullanabiliriz, sayisal deger de olsa.
        //  int tel = 5301340097; ınt degelerını astıgı ıcın yazamıyoruz.


        System.out.println("str1");  // str1 ı tırnak ıcınde yazarsak tırnak ıcınde ne varsa onu alıyor.
        System.out.println(str1);   //str1 ı tırnak ıcınde yazmayınca Strıngdekını alıyor.

            int x=23;
            int y=13;
            // iki sayının toplamını yazdırın.

        System.out.println("verilen iki sayının toplamı:"+ (x+y));  // verılen ıkı sayının toplamı = 36


        x=15;  //x 23tu burada deger atadık x artık yenı degerını alıp 15 oldu.

        System.out.println("x = " + x); // x = 15

        x= 3 * x + 1 ;
        System.out.println("x'in yeni değeri = " +x ); //x'ın yeni degeri = 46

        float fl1 = 20f;
        float fl2 = 6f;

        System.out.println( fl1/fl2); // 3.3333333 ---> virgülden sonra maximum 7 basamak verir.

        double dbl1 = 20;
        double dbl2 = 6;
        System.out.println( dbl1/dbl2); // 33.33333333333335 ---> virgülden sonra 16 basamak verir

        








    }
}
