package day12_stringManipulations;

import java.util.Scanner;

public class c08_StringManipulations {

    public static void main(String[] args) {


        // Soru 6 : Kullanicidan alinan bir String alin,
        // String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
        // String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz:");
        String metin = scanner.nextLine();

        if (metin.length() % 2 == 0){
            System.out.println(metin = metin.substring(0, metin.length() / 2) + ":)" + metin.substring(metin.length() / 2));


        } else {
            metin = metin.substring(0, metin.length() / 2) + ":("+
                    metin.substring((metin.length() + 1) / 2);
        }
                     System.out.println(metin);
        }
    }
