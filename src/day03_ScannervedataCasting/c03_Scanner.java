package day03_ScannervedataCasting;

import java.util.Scanner;

public class c03_Scanner {
    public static void main(String[] args) {


        //Kullanıcıdan iki sayi alip ikisinin  degerlerini degistirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("İlk tam sayıyı giriniz");
        int ilkSayi = scanner.nextInt();
        System.out.println("İkinci tam sayiyi giriniz");
        int ikinciSayi = scanner.nextInt();

        int temp = 0;

        temp=ikinciSayi;
        ikinciSayi=ilkSayi;
        ilkSayi=temp;

        System.out.println("Girilen sayıları değiştirdim:");
        System.out.println("Birinci sayı:" + ilkSayi);
        System.out.println("İkinci sayı:" +ikinciSayi);





    }
}
