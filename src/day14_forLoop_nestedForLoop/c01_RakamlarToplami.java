package day14_forLoop_nestedForLoop;

import java.util.Scanner;

public class c01_RakamlarToplami {

    public static void main(String[] args) {

       // Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayi giriniz:");
        int sayi = scanner.nextInt();

        //once bana basamak sayisi lazim

        int basSayisi = (sayi + "").length(); //int'de .length olmadigi icin ; çift tırnak("") ekleyip string yapip sonuna length ekledik
        int birlerBasamagi  = 0;
        int rakamlarToplami = 0;
        int girilenSayi     = sayi;


        for (int i = 0; i <basSayisi; i++) {

            birlerBasamagi = girilenSayi % 10;
            rakamlarToplami += birlerBasamagi;
            girilenSayi /= 10;
            
        }

        System.out.println("Girilen " + sayi + " sayinin rakamlar toplami: " + rakamlarToplami);



















    }




}
