package day05_concatenation_operatorler;

import java.util.Scanner;

public class c03_And_Or {

    public static void main(String[] args) {


        //kullanıcıdan not isteyin. Girilne not 0-100 arasında ise true değilse false yazdırın. 0 ve 100 dahil

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz:");
        int not=scanner.nextInt();

        System.out.println(not >=0 && not<=100);


    }
}
