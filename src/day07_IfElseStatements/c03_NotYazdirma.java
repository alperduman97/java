package day07_IfElseStatements;

import java.util.Scanner;

public class c03_NotYazdirma {


    public static void main(String[] args) {


        //kullanıcıdan 100 üzerinden notunu alın
        //negatif veya yüzden büyük deger girerse "geçersiz not"
        //85 ile 100 arasında ise AA
        // 65'den büyük 85'ten kücükse BB
        // 50'den büyük 65'ten kücükse CC
        // 50'den kücükse DD kaldın yazdırın



        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir not giriniz:");
        double not= scanner.nextDouble();

        if (not < 0 || not > 100) {
            System.out.println("Geçersiz Not");
        }else if (not >= 85 ) {
            System.out.println("Notunuz: AA");
        }else if ( not >= 65){
            System.out.println("Notunuz : BB");
        }else if (not >= 50){
            System.out.println("Notunuz : CC");
        }else
        {
            System.out.println("Notunuz : DD"+ " " + "Kaldınız!!");

        }




    }
}
