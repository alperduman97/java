package day15_methodOlusturma;

import java.util.Scanner;

public class c02_asalsayimethodu {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin
        // Girilen sayinin asal sayi olup olmadigini kontrol edip, sonuc olarak “asal sayi”
        // veya “asal sayi degil” sonuclarini yazdiran bir method olusturun

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayi giriniz:");
        int sayi = scanner.nextInt();

        asalsayiMi(sayi);   //girilen tam sayiyi parantez icinde yazdik ki girdiğimiz sayiyi alsin

    }

         public static void asalsayiMi(int sayi)   {    //void: bir şeyi yazdıracağımız için void seçtik

        int flag = 20; //20 10 5 ne oldugu önemli degil, rastgele değer verdik.

        for (int i = 2; i <sayi; i++) {



            if ( sayi % i == 0){

                flag++;
                break;

            }

        }

                if(flag == 20){
                    System.out.println("Sayi asaldir");
                }else {
                    System.out.println("Sayi asal degildir.");
                }

    }

}
