package day17_WhileLoop_doWhileLoop;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class c01_whileLoop {
    public static void main(String[] args) {

        //kullancıdan baslangıc ve bitis degerlerini alin
        // baslangıc ve bitis dahil olarak
        // bu iki sayi arasindaki tüm sayilari toplayin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen baslangıc ve bitis degerlerini giriniz:");
        int baslangic = scanner.nextInt();
        int bitis = scanner.nextInt();

            //while Loop ile yapalım


        int sayi = baslangic;
        int toplam = 0;


        while (sayi <= bitis){
            toplam += sayi;
            sayi++;

        }
        System.out.println("toplam:" + toplam);


    }






}
