package day07_IfElseStatements;

import java.util.Scanner;

public class co7_Emeklilik {

    public static void main(String[] args) {

       // Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir
        //Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” .
        // veya “Emekli olmak icin yil daha calisman gerekir” yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz E:Erkek , K:Kadin");
        char cinsiyet = scanner.next().toUpperCase().charAt(0); // her türlü büyüğe çevirip ilk harfi almayı kesineleştirdik.
        System.out.println("Lütfen yaşınız giriniz");
        int yas = scanner.nextInt();

        if( cinsiyet == 'E' && yas >= 65){
            System.out.println("Erkek, emekli olabilir.");
        } else if (cinsiyet == 'E' && yas <= 65){
            System.out.println("Emekli olmak için:"+ (65-yas) + " "+ "yıl daha çalışman lazım...");
        } else if (cinsiyet == 'K' && yas >= 65)
        {
            System.out.println("Kadın, emekli olabilir");
        } else if (cinsiyet == 'K' && yas >= 60)
        {
            System.out.println("Emekli olmak için" + (60-yas) + " "+ "yıl daha çalışman lazım");

        } else {
            System.out.println("bilgileri yanlış girdiniz");
        }


    }
}
