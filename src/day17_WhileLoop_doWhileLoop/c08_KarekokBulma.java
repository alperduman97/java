package day17_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class c08_KarekokBulma {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan bir pozitif sayi isteyin,
        //        sayının tam kare olup olmadığını bulunuz,
        //        tamkare ise true değilse false yazdırınız.
        //	      Ornek :  input : 16, output: 4


                Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir pozitif tam sayi giriniz:");
        int sayi = scanner.nextInt();
        int flag=10;
        int karekokKontrol = 1;


        for (int i = 1; i <sayi; i++) {

            if (i * i == sayi){
                System.out.println("Girdiğiniz sayı " + i +"'nin tam karesidir:");
                flag++;
                break;

            }

        }

        if (flag==10){
            System.out.println("false");
        }else {
            System.out.println("true");
        }
            //do while ile yapalim

        flag=10;
        karekokKontrol = 1;

        do {
            if(karekokKontrol*karekokKontrol==sayi){
                flag++;
                break;
            }
            karekokKontrol++;
        }while (karekokKontrol*karekokKontrol <= sayi);

        if (flag==10){
            System.out.println("false");
        }else {
            System.out.println("true");
        }
    }
}
