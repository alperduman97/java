package day06_if_Else_statements;

import java.util.Scanner;

public class c02_IfStatements {

    public static void main(String[] args) {

        //kullanicidan 2 sayi alin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen iki sayi giriniz");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();

        // ilk sayi 2.den büyükse büyüksün sayı 1 yazalım
        boolean sonuc = sayi1 > sayi2;
        if (sonuc ) {
            System.out.println("Büyüksün sayi 1");
        }

        // ikinci sayi 0'den büyükse, büyüksün sayi2 yazdıralım
         sonuc = sayi2 > 0;
        if (sonuc) {
            System.out.println("Büyüksün sayi2");
        }

        // iki sayının toplamı 100'den büyükse ikinizde büyüksünüz yazdırın.
        sonuc = sayi1 + sayi2 > 100;
        if ( sonuc) {
            System.out.println("İkiniz de büyüksünüz");
        }



    }
}
