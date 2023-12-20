package day14_forLoop_nestedForLoop;

import java.util.Scanner;

public class c08_NestedForLoop {
    public static void main(String[] args) {


        /* kullanicidan satir ve sutun sayisini alip asagidaki gibi tablo olusturun


           * * * * *
           * * * * *
           * * * * *



         */



        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen satir sayisini giriniz:");
        int satir = scanner.nextInt();
        System.out.println("Her satırda kaç sayısı olacağını giriniz:");
        int sutun= scanner.nextInt();

        for (int i = 1; i <=satir ; i++) { //satir

            for (int j = 1; j <=sutun ; j++) { //satirdaki sütunları

                System.out.print("* ");


            }
            System.out.println("");
        }
















    }
}
