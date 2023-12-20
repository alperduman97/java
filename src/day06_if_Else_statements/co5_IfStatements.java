package day06_if_Else_statements;

import java.util.Scanner;

public class co5_IfStatements {



    public static void main(String[] args) {

        // Kullanıcıdan bir harf alın
        // harf ile başlayan bir ay varsa yazdırın
        // Eğer girilen harfle başlayan bir ay yoksa ay yok yazdirin
        // NOT: Buyuk harf, kücük harf hassasiyeti olmasın
        // Kullanici  o veya O yazdıginde output Ocak olsun.


        Scanner scanner = new Scanner(System.in);

        System.out.println("LÜtfen bir harf giriniz:");
        char harf = scanner.next().charAt(0);  // .nextchar olmadığındna böyle yapıyoruz. 0 yazınca ilk harfini alacak.

        int flag = 44; //rastgele 44 verdik.

        if (harf == 'O' || harf == 'o' ) {
            System.out.println("Ocak");
            flag++;                            // ekrana Ocak yazdırılırsa flag 1 artacak 45 olacak
        }

        if (harf == 'S' || harf == 's' ) {
            System.out.println("Subat");

            flag++;  // Subat yazdırılırsa flag 1 artacak 46 olacak

        }

        if (harf == 'M' || harf == 'm') {
            System.out.println("Mart ve Mayıs");
            flag++;
        }


        if (harf == 'N' || harf == 'n'){
            System.out.println("Nisan");
            flag++;
        }

        if (harf == 'H' || harf == 'h'){
            System.out.println("Haziran");
            flag++;


        }


        if (harf == 'T' || harf == 't'){
            System.out.println("Temmuz");
            flag++;
        }


        if (harf == 'A' || harf == 'a'){
            System.out.println("Ağustos veya Aralık");

            flag++;
        }


        if (harf == 'E' || harf == 'e'){
            System.out.println("Eylül veya Ekim");
            flag++;
        }

        if (harf == 'K' || harf == 'k'){
            System.out.println("Kasım");
            flag++;
        }

        if (flag == 44) {
            System.out.println("Girdiğiniz harf ile başlayan ay yok");
            // flag 44'te kaldıysa eğer hiç bir harf ile ay yazılmamış demektir.
        }
    }
}
