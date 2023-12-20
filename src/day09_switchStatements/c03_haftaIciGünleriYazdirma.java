package day09_switchStatements;

import java.util.Scanner;

public class c03_haftaIciGünleriYazdirma {

    public static void main(String[] args) {



        //kullanicidan gün ismini isteyin.
        // girilen günlerin hafta içi ya da hafta sonu olduğunu yazdırın.


         Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen günü giriniz");
        String gun=scanner.next().toLowerCase();

        switch (gun){
            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe":
            case "cuma":
                System.out.println("hafta içi");
                break;

            case "cumartesi":
            case "pazar":
                System.out.println("haftasonu");
                break;
            default:{
                System.out.println("Lütfen istenilen bilgileri giriniz!!!");
            }
        }






















    }

}
