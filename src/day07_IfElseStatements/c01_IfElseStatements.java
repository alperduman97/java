package day07_IfElseStatements;

import java.util.Scanner;

public class c01_IfElseStatements {

    public static void main(String[] args) {



        //  Soru 4- Kullanicidan bir karakter girmesini isteyin,
        //  girilen karakterin buyuk harf olup olmadigini yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz:");
        char karakter = scanner.next().charAt(0);
        if( karakter >= 'A' && karakter <= 'Z') {   //ascii kodlarından büyük a ile z yi kullanıp denetledik.
            //Ascii kodlarındna A ile Z arasındaki büyük harfleri skala yaptık, arasında olup olmamasını denetliyor.
            System.out.println("Girilen Karakter Büyük Harf");
        }else{
            System.out.println("Girilen karakter büyük harf değil");
        }











    }
}
