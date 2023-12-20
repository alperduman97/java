package day24_arrayLists_forEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class c06_HarfKullanimSayisiniBulma {

    public static void main(String[] args) {

        //  Kullanicidan bir cumle ve bir harf alin,
        // case sensitive olmadan
        // harf cumlede kullanilmişsa kaç kere kullanildigini yazdirin
        // kullanilmadiysa "harf cumlede kullanilmamis" yazdirin



        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz:");
        String cumle = scanner.nextLine();

        System.out.println("Aranacak harfi giriniz:");
        String harf=scanner.next().substring(0,1);

        //cümledeki her bir harfa 2 türlü ulaşabiliriz.

        //1- For-Loop ve substring ile
        //2- split ile array'e çevirip, for-each loop ile


        String[] cumleHarfArrayi = cumle.split("");
        System.out.println(Arrays.toString(cumleHarfArrayi)); // [A, l, i,  , t, o, p, u,  , t, u, t, ,,  , t, u, t,  , a, l, i,  , t, u, t]

        int sayac=0;


        for (String each: cumleHarfArrayi
             ) {
            if (each.equalsIgnoreCase(harf)){

                sayac++;
            }
        }

        if (sayac==0){
            System.out.println("Harf cümlede kullanılmamış");
        }else{
            System.out.println("Verilen harf cümlede: " + sayac + " defa kullanılmış");
        }










    }
}
