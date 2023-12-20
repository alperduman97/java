package day03_ScannervedataCasting;

import java.util.Scanner;

public class c03_rakamlarToplaminiBulma {
    public static void main(String[] args) {


        //kullanıcıdan 3 basamakli bir tam sayi alıp sayının rakamlar toplamını yazdırın.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 basamakli bir tam sayi giriniz:");
        int sayi= scan.nextInt();

        // diyelim ki kullanıcı 375 sayısını girdi.
        // bize birler basamağını ve rakamlar toplamını kaydedeceğimiz 2 variable lazım.

            int birlerBasamagi;
            int rakamlarToplami;

            birlerBasamagi=0;
            rakamlarToplami=0;


            birlerBasamagi=sayi % 10;

            rakamlarToplami=rakamlarToplami+birlerBasamagi;

            //5'i rakamlar toplamina ekledik  şimdi 5'ten kurtulalım

            sayi=sayi/10;   //37

        birlerBasamagi=sayi % 10;

        rakamlarToplami=rakamlarToplami+birlerBasamagi;

        sayi=sayi / 10;
        rakamlarToplami=rakamlarToplami+sayi;

        System.out.println("Girilen sayının rakamlar toplamı:"+ rakamlarToplami);


















    }

}
