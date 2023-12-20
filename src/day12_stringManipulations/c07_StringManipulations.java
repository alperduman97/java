package day12_stringManipulations;

import java.util.Scanner;

public class c07_StringManipulations {

    public static void main(String[] args) {



        // Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
        // ismi daha uzun ise,
        // isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
        // soyisim daha uzun ise
        // ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.



        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz:");
        String isim = scanner.nextLine();
        System.out.println("Lütfen soyisminizi giriniz:");
        String soyisim = scanner.nextLine();



        if(isim.length() > soyisim.length()){
            System.out.println(
                    isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase() + " "+
                    soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).toLowerCase());
        }


        if (isim.length() < soyisim.length()){
            System.out.println(
                    isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase() + " "+
                            soyisim.toUpperCase()
            );
        }






















    }
}
