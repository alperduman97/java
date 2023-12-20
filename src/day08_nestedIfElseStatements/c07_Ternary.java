package day08_nestedIfElseStatements;

import java.util.Scanner;

public class c07_Ternary {

    public static void main(String[] args) {


        // Soru 1- Kullanicidan bir sayi isteyin,
        // sayiyi kontrol edip 5 ile bolunebiliyorsa “Sayi 5’in tam kati”
        // veya “Sayi 5’in kati degil” yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz");
        int sayi = scanner.nextInt();
        System.out.println( sayi % 5 == 0 ? "Sayı 5'in katı" : "sayi 5'in kati değil");



    }
}
