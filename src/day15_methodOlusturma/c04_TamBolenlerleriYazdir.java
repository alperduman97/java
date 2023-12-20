package day15_methodOlusturma;

import java.util.Scanner;

public class c04_TamBolenlerleriYazdir {
    public static void main(String[] args) {


        // /Soru 4- Kullanicidan main method icinde bir tamsayi alin.
        // Girilen sayinin pozitif tam bolenlerini yanyana yazdiran
        // bir method olusturun.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayi giriniz:");
        int sayi = scanner.nextInt();

           pozitifBolenleriYazdir(sayi);  // 1 2 4 7 8 14 28 56

            pozitifBolenleriYazdir(640);

            // pozitifBolenleriYazdir("Sanane");  // int bekliyorum sen string yaziyorsun diyor kabul etmiyor
            // pozitifBolenleriYazdir(true);  // boolean'ı da kabul etmiyor
              pozitifBolenleriYazdir('z'); // ASCII tablosunun karsılıgındaki z yi alip deger yazdirdi.
        
    }

    public static void pozitifBolenleriYazdir (int sayi){


        for (int i = 1; i <=sayi; i++) {
            if (sayi % i == 0){
                System.out.print(i+ " ");

            }


        }

        System.out.println(" ");


    }
}
