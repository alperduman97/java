package day08_nestedIfElseStatements;

import java.util.Scanner;

public class c08_Ternary {
    public static void main(String[] args) {
        //  Soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin,
        // degilse “Eskenar degil” yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ücgenin 3 acısını giriniz:");
        double sayi1= scanner.nextDouble();
        double sayi2= scanner.nextDouble();
        double sayi3= scanner.nextDouble();

        System.out.println(sayi1==sayi2 && sayi1==sayi3 && sayi1 >0 ? "Eskenar ücgen" : "Eskenar ücgen degil");















    }
}
