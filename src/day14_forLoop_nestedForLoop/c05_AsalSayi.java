package day14_forLoop_nestedForLoop;

import java.util.Scanner;

public class c05_AsalSayi {

    public static void main(String[] args) {


        //Soru 11- Kullanicidan pozitif bir tamsayi isteyip,
        // sayinin asal sayi olup olmadigini kontrol edin
        // ve sonucu yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayi giriniz:");
        int sayi = scanner.nextInt();
        int flag = 10;
        for (int i = 2; i < sayi ; i++) {

            if( sayi % i == 0){

                flag++;

                break;    //12343536785 sayısında mesela sonda 5 var yani bu sayi asal degil. Bunun gibi sayılarda
                // sonuna kadar gitmemesi için break; yazıyoruz, ilk asal olmayan sayıyı bulduğunda işlemi durduruyor.

        }


        }

       if(flag == 10){
           System.out.println("girilen sayi asaldir");
       }else {
           System.out.println("girilen sayi asal degildir");
       }










    }
}
