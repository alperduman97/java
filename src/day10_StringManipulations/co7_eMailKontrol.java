package day10_StringManipulations;

import java.util.Scanner;

public class co7_eMailKontrol {
    public static void main(String[] args) {


        //kullanicidan e-mail isteyin
        // eğer @ işareti içermiyorsa "Yanlış giriş"
        // eğer @gmail.com içermiyorsa "girilen mail gmail olmalı"
        // email @gmail.com ile bitmiyorsa "geçersiz mail"
        // email boşluk içeriyorsa "yazım hatası"
        // eğer hata yoksa "mailiniz kaydedildi" yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sifrenizi giriniz:");
        String email= scanner.nextLine();

        if( ! email.contains("@")) {
            System.out.println("yanlış giriş");

        } else if (! email.contains("@gmail.com")) {
            System.out.println("girilen mail @gmail olmalı");
        } else if (!email.endsWith("gmail.com")) {
            System.out.println("geçersiz mail");
        } else if (email.contains(" ")) {
            System.out.println("yazım hatası");
        }else {
            System.out.println("mailiniz kaydedildi");
        }


    }
}
