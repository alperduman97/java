package day03_ScannervedataCasting;

import java.util.Scanner;

public class c02_Modules {
    public static void main(String[] args) {


        System.out.println(25 % 8); //1 --> %(kalanı verdirir)
        System.out.println(25/8);  //3

        //3245354423 sayinin 8'e bölümünden kalan kaçtır?

        System.out.println(1245354423 % 8); //7


        //76256513 sayısı 113'e tam bölünür mü?

        System.out.println(76256513 % 113); //45, tam bölünmez.

        //  sayisi 3 e tam bölünür mü?

        System.out.println(56476586 % 3); //2 , tam bölünmedi


        // kullanicidan bir sayi isteyip birler basamğını yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz:");
        int sayi1 = scan.nextInt();

        System.out.println("Girilen sayının birler baasamağı:"+(sayi1%10)); // 567 girdik, 7 yazdırdı.Doğru!

        System.out.println(375 % 10); // birler basamağındaki 5 i verir.
        System.out.println(375/10); //37yi verir yani birler basamağı hariç diğerlerini veriyor.

        System.out.println(37 % 10); //birler basamağındaki 7'yi verir
        System.out.println(37/10);   //3 verir.

        System.out.println(3%10); //3
        System.out.println(3/10); //0







    }
}
