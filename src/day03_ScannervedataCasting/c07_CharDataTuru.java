package day03_ScannervedataCasting;

import java.util.Scanner;

public class c07_CharDataTuru {

    public static void main(String[] args) {


        //char özel bir karakter türüdür
        // '4' , 'h', 'K' gibi içine tek karakter alır.
        /* char data türündeki variable'lar ve değerler matematiksel işlemlerde kullanılırsa
        bu durumda ASCII tabledaki decimal karşılıklarıyla  işleme girerler.
         */


        System.out.println('a' + 'b'); // 97 + 98
        System.out.println('0' + '1'); // 48 + 49
        int sayi = 'c';
        System.out.println(sayi); //99

        char chr  = 101;
        System.out.println(chr);  //e --> matematiksle olarak 101'ün karşılığı küçük e

        //Kullanıcıdan bir karakter isteyin. Kullanıcının girdiği karakterden sonraki 3 karatkeri yazdırın.
        // Örn: L girilsin m,n,o yu yazdır.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen herhangi bir karakter giriniz:");
        char girilenKarakter = scanner.next().charAt(0);  // 0'ı ilk değeri alsın diye yazıyoruz.

        System.out.println("Girdğiniz karakter:" + girilenKarakter);
        System.out.println("Girilen karakterden sonraki karakter:" + (char)(girilenKarakter+1)); // (char)'ı eklemezsek sayı olarak yazar.
        System.out.println("Girilen karakterden sonraki karakter:"+ (char)(girilenKarakter+2));
        System.out.println("Girilen karkaterden sonraki karakter:"+ (char)(girilenKarakter+3));









    }
}
