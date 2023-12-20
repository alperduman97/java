package day06_if_Else_statements;

import java.util.Scanner;

public class c04_IfStatements {
    public static void main(String[] args) {

        // Kullanıcıdan bir harf alın
        // harf ile başlayan bir ay varsa yazdırın
        // NOT: Buyuk harf, kücük harf hassasiyeti olmasın
        // Kullanici  o veya O yazdıginde output Ocak olsun.


        Scanner scanner = new Scanner(System.in);

        System.out.println("LÜtfen bir harf giriniz:");
        char harf = scanner.next().charAt(0);  // .nextchar olmadığındna böyle yapıyoruz. 0 yazınca ilk harfini alacak.

        if (harf == 'O' || harf == 'o' ) {
            System.out.println("Ocak");

        }

        if (harf == 'S' || harf == 's' ) {


        }

        if (harf == 'M' || harf == 'm'){
            System.out.println("Mart ve Mayıs");

        }


        if (harf == 'N' || harf == 'n'){
            System.out.println("Nisan");

        }

        if (harf == 'H' || harf == 'h'){
            System.out.println("Haziran");



        }


        if (harf == 'T' || harf == 'T'){
            System.out.println("Temmuz");

        }


        if (harf == 'A' || harf == 'a'){
            System.out.println("Ağustos veya Aralık");

        }


        if (harf == 'E' || harf == 'e'){
            System.out.println("Eylül veya Ekim");

        }

        if (harf == 'K' || harf == 'k'){
            System.out.println("Kasım");

        }
    }



}
