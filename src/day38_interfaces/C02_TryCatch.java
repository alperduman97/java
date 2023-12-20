package day38_interfaces;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_TryCatch {

    public static void main(String[] args) {


        //kullanicidan 2 tamsayi isteyin
        //birinci sayi ikinci sayiya bölüp
        //sonucun tamsayi kismini yazdırın


        Scanner scanner = new Scanner(System.in);

        /*

        iyi bir Coder yazdiği kodun neresinde, ne tür sorunlar oluşabileceğini öngörüp
        sorun oluşabilecek durumlar için
        Java'ya yapmasi gerekenleri tembihler.

        Eğer öngörülen risk birden fazla ise bu riski tasiyan kodlar ayri ayri try-catch bloklari ile
        kontrol altına alınabilinir
        Ama bu durumda ikisi ayri ayri oldugundan senkronize çalışmayabilir
         */

        int sayi1 =0;
        int sayi2 = 1;

        try {
            System.out.println("Lütfen bölünecek sayiyi girin: ");
            sayi1=scanner.nextInt();
            System.out.println("Lütfen bölünecek tam sayiyi girin: ");
             sayi2= scanner.nextInt();
        } catch (InputMismatchException e) {

            System.out.println("Tamsayi dedik TAMSAYI");

        }

        try {
            System.out.println("ilk sayi/ikinci sayi= " +sayi1/sayi2);
        } catch (InputMismatchException e) {
            System.out.println("0 girme dostum!");
        }


    }
}
