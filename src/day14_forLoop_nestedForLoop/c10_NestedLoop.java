package day14_forLoop_nestedForLoop;

import java.util.Scanner;

public class c10_NestedLoop {

    public static void main(String[] args) {


        // kullanicidan satir sayisini alıp aşağıdaki sekli cizdirin




        /* *
        * *
        * * *
        * * * *
        * * * * *

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen satir sayisini giriniz:");
        int satir = scanner.nextInt();

        for (int i = 0; i <=satir ; i++) { //satırları kontrol eder

            for (int j = 0; j <=i  ; j++) { //satırdaki yıldız sayısını kontrol eder. // j<=i --> üccgen olursa i
                                                                                        // diktörtgen olursa j<=sutun olur.

                System.out.print("* ");

            }
            System.out.println("");
        }










    }
}
