package day06_if_Else_statements;

import java.util.Scanner;

public class co8_IfelseSusluParantezKullanimi {

    public static void main(String[] args) {

        //kullanıcıdan 2 tam sayi alın
        //eğer sayi1 sayi2'den büyükse sayi1'i bir azaltıp sayi2'yi bir arttırın.
        //sayi1 sayi2'den büyük değilse o zaman sayi1'i 3 ile çarpın sayi2'yi 2 ile çarpın
        //sayi1 ve sayi2'nin son değerlerini yazdırın.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen iki tam sayi giriniz:");
        int sayi1 = scanner.nextInt();
        int sayi2= scanner.nextInt();

        if ( sayi1 > sayi2) {
            sayi1--;
            sayi2++;
        }else{
            sayi1 *=3;
            sayi2 *=2;

        }
        System.out.println("Sayi 1:"+ sayi1 + ", Sayi 2: "+ sayi2);





    }
}
