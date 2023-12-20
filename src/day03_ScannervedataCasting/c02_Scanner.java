package day03_ScannervedataCasting;

import java.util.Scanner;

public class c02_Scanner {
    public static void main(String[] args) {

        // Kullanıcıdan bir cemberin yarıcapını alıp çevresini ve alanını yazdırın.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yarıcapı giriniz:");
        double yaricap = scanner.nextDouble();
        System.out.println("Çemberin çevresi:"+ 2 * 3.14*yaricap);
        System.out.println("Çemberin alanı :"+ 3.14 *yaricap*yaricap);

    }
}
