package day07_IfElseStatements;

import java.util.Scanner;

public class co6_VucutKitleEndeksi {

    public static void main(String[] args) {


        // soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin
        // (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse obez, 25-30 arasi ise kilolu,
        // 20-25 arasi ise normal, 20’den kucukse zayif yazdirin.


            Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen kilonuz (kg) giriniz:");
        double kilo = scanner.nextDouble();
        System.out.println("Lütfen boyunuzu (cm) giriniz:");
        double boy = scanner.nextDouble();

        double kitlehesabi = (kilo * 10000 / (boy * boy));

        System.out.println("Vucut kitle endeksiniz:" + kitlehesabi);


        if ( kitlehesabi >= 30) {
            System.out.println(" Obezsiniz!! ");
        }else if( kitlehesabi >= 25 ){
            System.out.println("Kilolusunuz!!!");
        }else if(kitlehesabi >=20){
            System.out.println("Normal");

        }else {
            System.out.println("Zayıfsınız");
        }









    }
}
