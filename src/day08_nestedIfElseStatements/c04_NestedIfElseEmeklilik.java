package day08_nestedIfElseStatements;

import java.util.Scanner;

public class c04_NestedIfElseEmeklilik {

    public static void main(String[] args) {

        // Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir
        //Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” .
        // veya “Emekli olmak icin yil daha calisman gerekir” yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz E:Erkek , K:Kadin");
        char cinsiyet = scanner.next().toUpperCase().charAt(0); // her türlü büyüğe çevirip ilk harfi almayı kesinleştirdik.
        System.out.println("Lütfen yaşınızı giriniz");
        int yas = scanner.nextInt();

        if( cinsiyet == 'E'){
            if( yas <= 15 || yas >= 80){
                System.out.println("Bu yaş için emeklilik hesaplayamıyoruz...");
            } else if (yas >= 65) {
                System.out.println("Erkek, emekli olabilir!");

            } else {
                System.out.println("Erkek, emekli olmak için"+ " "+ (65-yas)+ " "+ "sene daha beklemeli!");

            }

        }else if (cinsiyet == 'K'){
            if ( yas <= 15 || yas>= 75){
                System.out.println("Bu yaş için emeklilik hesaplayamıyoruz!");

            } else if (yas >= 60) {
                System.out.println("Kadın, emekli olabilir");

            }else {
                System.out.println("Kadın, emekli olmak için" + " " + (60-yas)+ " "+ "yıl daha beklemeli!");
            }

        }else{
            System.out.println("Yanlış girdiğiniz. E ya da K olarak giriş yapınız!!!");
        }


















    }
}
