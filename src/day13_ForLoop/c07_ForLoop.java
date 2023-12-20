package day13_ForLoop;

import java.util.Scanner;

public class c07_ForLoop {


    public static void main(String[] args) {


        // Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        // bu sayinin faktoryel degerini hesaplayin.
        //  input 5 ise , output=120 olur (5! = 5*4*3*2*1)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 20'den küçük bir tam sayi yazin");
        int sayi = scanner.nextInt();


        long faktoriyel = 1; //çarpacağımız için 1'den başlattık


        for (int i = 1; i < sayi ; i++) {

            faktoriyel *= i;

            System.out.println(faktoriyel); //çarpım adımlarını da gösterir. Döngü içerisine yazdığımız için
            // her adımda kendini tekrar eder ve yazdırır.

        }

      //   System.out.println(faktoriyel); // ekranda sadece çarpımı gösterir, adımları göstermez
















    }
}
