package day15_methodOlusturma;

import java.util.Scanner;

public class c01_KendiSubstringMethodumuz {

    public static void main(String[] args) {



/* verilen bir string ve baslangic ve bitis indexleri icin asagidaki gorevi tamamlayin


1- baslangi indexi bitis indexinden büyükse hata yazdir
2- baslangic veya bitis indexi verilen stringin disinda ise hata yazdirin
3- indexler sinirlar icerisinde ise baslangic indexi dahil bitis indexi haric olacak sekilde
iki index arasında harfleri yazdirin
 */


            Scanner scanner = new Scanner(System.in);
            System.out.println("Lütfen  bir metin giriniz:");
            String metin = scanner.nextLine();

            System.out.println("Lütfen baslangic degeri giriniz:");
            int baslangic = scanner.nextInt();
            System.out.println("Lütfen bitiş degeri giriniz:");
            int bitis = scanner.nextInt();

            if(baslangic > bitis){
                System.out.println("HaTAAAA!");
            } else if (baslangic >= metin.length() || bitis >= metin.length() ) {
                System.out.println("HATTAA!");
                
            }else {


    }


    }











}
