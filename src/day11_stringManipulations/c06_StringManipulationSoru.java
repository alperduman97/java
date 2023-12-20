package day11_stringManipulations;

import java.util.Scanner;

public class c06_StringManipulationSoru {

    public static void main(String[] args) {


        //kullanicidan bir cümle alın
        // cümlede ev geçiyorsa "home home sweet home"
        // cümlede iş geçiyorsa "calismak güzeldir"
        // ikisi de geçiyorsa "Hem ev lazim hem is"
        // hic birini icermiyorsa "cok calisman lazim" yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir cümle girin:");
        String cumle = scanner.nextLine();

        if (cumle.contains("ev") && cumle.contains("is")  ){
            System.out.println("Hem ev lazim hem is");
        } else if (cumle.contains("ev")) {
            System.out.println("home home sweet home");
        } else if (cumle.contains("is")) {
            System.out.println("calismak guzeldir");
        }else {
            System.out.println("cok calisman lazim");
        }


    }
}
