package day14_forLoop_nestedForLoop;

import java.util.Scanner;

public class c09_NestedForLoop {
    public static void main(String[] args) {



        /*

        Kullanicidan satir sayisi alip asagidaki sekli cizdirin
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5

         */

    Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen satir sayisini giriniZ:");
        int satir = scanner.nextInt();

        for (int i = 1; i<=satir ; i++) { //satir sayisini kontrol eder

            for (int j = 1; j <=i ; j++) {

                System.out.print(j + " ");
            }
            System.out.println("");
            
        }






















    }
}
