package day06_if_Else_statements;

import java.util.Scanner;
import java.util.SortedMap;

public class c06_IfStatements {
    public static void main(String[] args) {


        //kullanıcıdan bir ücgenın 3 kenar uzunlugunu alın
        // üçgen eskenr ise  "Eşkener Üçgen" yazdırın


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ücgenin kenar uzunluklarını giriniz:");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1 == kenar2 && kenar1 == kenar3 && kenar1 < 0) {
            // javA'da maximum 2 eşittir kullanabilir
            // bu yüzden kenar1 == kenar2 == kenar3 yazamadık.
            System.out.println("girilen kenarlar eşkenar üçgen oluşturur:");

        }


    }
}

