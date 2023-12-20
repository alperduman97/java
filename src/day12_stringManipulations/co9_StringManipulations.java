package day12_stringManipulations;

import java.util.Scanner;

public class co9_StringManipulations {
    public static void main(String[] args) {


        //// kullanicidan isim, soyisim ve kredi karti numarasini alin
        // gorunurIsim olarak A****** N****** seklinde
        // sadece ilk harfler buyuk harf olarak gorunsun, diger harfler * olsun
        // gorunur kart no : **** **** **** 1234 olsun

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen İsminizi Giriniz:");
        String isim=scanner.nextLine();
        System.out.println("Lütfen Soyisminizi Giriniz:");
        String soyisim = scanner.nextLine();
        System.out.println("Lütfen Kredi Kart numaranızı bosluksuz 16 karakter olarak giriniz:");
        String kkNo = scanner.nextLine();

        String gorunurIsim = isim.substring(0,1).toUpperCase() +
                             isim.substring(1).replaceAll("\\w","*") + " " +
                             soyisim.substring(0,1).toUpperCase() +
                             soyisim.substring(1).replaceAll("\\S","*");

        // --> \\w; harf,sayı ve _ 'yi degiştirir
        // -->  \\S; space olmayan her şeyi değiştirir.

        String gorunurKartNo = "++++ ++++ ++++"+kkNo.substring(kkNo.length()-4);
        System.out.println(gorunurIsim);
        System.out.println(gorunurKartNo);


























    }
}
