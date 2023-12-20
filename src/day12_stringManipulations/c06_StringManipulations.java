package day12_stringManipulations;

import java.util.Scanner;

public class c06_StringManipulations {
    public static void main(String[] args) {

        // Soru 4 : Kullanicidan bir sifre isteyip,
        // asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,

        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        // - ilk harf kucuk harf olmali // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali



        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz:");
        String sifre = scanner.nextLine();

        int flag=10; // flag degerini kafaniza gore verdik, her hata kodunun altina koyacağız. en son da flag=10 olarak
        // kalmışsa hatasız çalıştığını göereceğiz.


        //// ---->  - ilk harf kucuk harf olmali <----

        char  ilkHarf = sifre.charAt(0);

       // if (ilkHarf <'a' || ilkHarf >'z')
                     // ya da
            if(ilkHarf >= 'a' && ilkHarf <= 'z'){
                System.out.println("İlk harf büyük olmalı");
                flag++;
            }


        //// ---->  - son karakter rakam olmali <----
            char sonKarakter = sifre.charAt(sifre.length()-1); //son karakteri verir

            if ( !(sonKarakter >= '0' && sonKarakter <= '9')) {
                System.out.println("Son karakter rakam olmali!");
                flag++;
            }

            //// ---->  sifre bosluk icermemeli <----

            if (sifre.contains(" ")){
                System.out.println("Şifre boşluk içermemeli");
                flag++;
            }

            /// ---->  uzunlugu en az 10 karakter olmali <----

           if(sifre.length() < 10){
               System.out.println("Uzunluk en az 10 karakter olmalı");
               flag++;
           }

                if (flag == 10){
                    System.out.println("Şifreniz başarıyla kaydedildi");
                }

             //if-else yapsaydik tüm hatalara bakmazdı,
             // bağımsız ifler yapıp birbirinden ayrı süzgeçler yaptık

    }
}
