package day06_if_Else_statements;

import java.util.Scanner;

public class c03_IfStatements {
    public static void main(String[] args) {

        //kullanıcıdan bir sayi isteyin
        // sayi 5 ile bolunebiliniyorsa , sayi 5'in katıdır yazdırın.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayi giriniz;");
        double sayi1=scanner.nextDouble();

        boolean sonuc = sayi1 % 5 == 0;
        if (sonuc){

            System.out.println("Sayı 5'in katıdır");
        }









    }





}
