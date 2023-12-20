package day14_forLoop_nestedForLoop;

import java.util.Scanner;

public class c03_StringiTerstenYazdirma {

    public static void main(String[] args) {

        //Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz:");
        String metin = scanner.nextLine();

        for (int i = metin.length()-1; i >= 0 ; i--) {  //sondan 0"a gelen kadar her harfi charla aldirdik

            System.out.print(metin.charAt(i)); //namud repla

        }












    }
}
