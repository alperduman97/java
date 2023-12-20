package day06_if_Else_statements;

import java.util.Scanner;

public class c01_IfStatements {

    public static void main(String[] args) {

           /* bagimsiz if cümleleri kodun geri kalanıyla ilgilenmez. Sadece if parantezindeki boolean
           şartına odaklanır. boolean şarta odaklanır. Boolean şart true ise if body'si çalışır.
           Boolean şart false ise if body'si çalışmaz.
            */





          //kullanıcıdan 2 değer alın


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki tam sayi giriniz:");
        int girilenSayi1 = scan.nextInt();
        int  girilenSayi2 = scan.nextInt();


        //1.sayı ıkıncı sayıdan büyükse aferin yazdırın

        if (girilenSayi1 > girilenSayi2){
            System.out.println("Aferin");
        }

        // 1.sayı çift ise çift sayıları severim yazdırın

        if (girilenSayi1 % 2 == 0) {
            System.out.println("Çift sayıları severim");
        }

        // 2.sayı 50'den büyükse büyük sayılarla işim olmaz yazdırın

        if (girilenSayi2 > 50) {
            System.out.println("Büyük sayılarla isim olmaz");
        }

        // toplamları yüzden küçükse ufak sayılarla işim olmaz yazdırın.
        if (girilenSayi1 + girilenSayi2 < 100)
        {
            System.out.println(" Ufak sayılarla isim olmaz");
        }

    }
}
