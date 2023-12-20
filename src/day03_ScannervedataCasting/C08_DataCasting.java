package day03_ScannervedataCasting;

import java.util.Scanner;

public class C08_DataCasting {

    public static void main(String[] args) {


        int sayi1= 20;
        int sayi2 = 3;
        System.out.println(sayi1 / sayi2); // 6.666 normalde böyle ama int olduğu için 6'yı alır.

        double sayi3= 3;
        System.out.println(sayi1 / sayi3); // 6.666666666666667 double olduğundna



        //kullanıcıdan iki tam sayı alıp 1.sayıyı 2.sayıya bölün. Sonucu ondalıklı olarak yazdırın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("2 Tam sayi degerini giriniz;");
        sayi1=scanner.nextInt(); //40
        sayi2=scanner.nextInt(); // 7
        double sonuc = (double) sayi1 /sayi2;
        System.out.println(sonuc); // 5.714285714285714







    }
}
