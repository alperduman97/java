package day07_IfElseStatements;

import java.util.Scanner;

public class co5_BirimCevirme {


    public static void main(String[] args) {


        //Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi sorun,
        //istedigi birim metre veya santimetre ise cevirip yazdirin,
        // yoksa “istediginiz birim sisteme kayitli degil” yazdir


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen mesafeyi kilometre olarak giriniz:");
        double mesafe = scanner.nextDouble();

        System.out.println("Lütfen Çevirmek istediğiniz birimi yazınız.");
        String girilen = scanner.next();

        if (girilen.equalsIgnoreCase("metre")) {
            //Metre,METre,metre mi değil mi diye sorgulamadan direkt yazının
            // kendisi metre mi diye bakıyor.
            System.out.println("Girilen mesafenin metre cinsinden değeri:" + mesafe * 1000);


        } else if (girilen.equalsIgnoreCase("santimetre")) {
            System.out.println("Girilen mesafenin santimetre cinsinden değeri " + mesafe * 10000);

        }else{
            System.out.println("Sadece metre ve santimetreye çevirebilirim \n İstediğiniz birim sisteme kayıtlı değil");
            // \n ---> alt satıra geçtirir.
        }
    }
}
