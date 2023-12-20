package day12_stringManipulations;

import java.util.Scanner;

public class c03_ReplaceAll {
    public static void main(String[] args) {

        //kullanicidan bir metin isteyin
        // kullanicinin girdigi metinden space disindaki tüm karakterleri
        // ve sayilari girip
        // metni yeni haliyle yazdirin


        // input : J1*a34_va+12 C87an.90d654ir,";    output: Java Candir

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz:");
        String metin = scanner.nextLine();

        //once sayilardan kurtulalim

        System.out.println(metin = metin.replaceAll("\\d", "")); //J*a_va+ Can.dir,, \\d:digit olanları yok et demek

        //space'i koruma altina almak icin herhangi bir rakamla replace yapalim

        System.out.println(metin = metin.replaceAll("\\s", "5")); //J*a_va+5Can.dir, //s: bütün space'leri cevirir

        //ozel karakterlerden kurtulalim

        System.out.println(metin.replaceAll("\\W", "")); //Ja_vaCandir ,, \\W: harf,rakam yada _ olmayan her şeyi yok eder

        //_ çizgiyi yok edelim, sayi koyduğumuz space'i geri getirelim

        System.out.println(metin = metin.replace("_", "").replaceAll("5"," "));
        System.out.println(metin);


    }
}
