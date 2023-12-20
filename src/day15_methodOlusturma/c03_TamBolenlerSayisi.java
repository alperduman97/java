package day15_methodOlusturma;

import java.util.Scanner;

public class c03_TamBolenlerSayisi {
    public static void main(String[] args) {


        // Soru 4- Kullanicidan main method icinde bir tamsayi alin.
        // Girilen sayinin pozitif tam bolenleri sayisini bulup
        // bize donduren bir method olusturun.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz:");
        int sayi = scanner.nextInt();

        System.out.println("Pozitif bölen sayıların toplam adedi:"+ " " +  pozitifTamBolenSayisi(sayi));

    }


    public static int pozitifTamBolenSayisi(int sayi) {
        //int: dönduruyoruz. ya = ile kaydedeceğiz ya da direkt yazdıracağız.
        //Kapıcı ekmeği kapıya getirdi ama biz alamadık. Almak için ya = ile kaydedip ya da yazdıracağız.

        // 20 --> 1,2,4,5,10,20 sayilarına bölünür. 6tane pozitif tam boleni var.

        int sayac = 0;

        for (int i = 1; i <=sayi ; i++) {

            if (sayi % i == 0){
                sayac++;
            }
        }

            return sayac;
    }

}
