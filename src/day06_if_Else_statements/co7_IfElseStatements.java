package day06_if_Else_statements;

import java.util.Scanner;

public class co7_IfElseStatements {

    public static void main(String[] args) {

        /* Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
                ucgen eskenar ise “Eskenar ucgen” yazdirin,
                degilse “Eskenar degil” yazdirin.
              */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ücgenin kenar uzunluklarını giriniz:");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1 == kenar2 && kenar1==kenar3 && kenar1 > 0){
            System.out.println("Eşkenar üçgendir.");
        }else{                                                  // else değilse anlamı katıyor.
            System.out.println("Eşkenar üçgen değildir");
        }
    }
}
