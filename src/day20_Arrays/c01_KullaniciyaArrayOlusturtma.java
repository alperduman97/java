package day20_Arrays;

import day19_Arrays.C02_ArrayinElemanlariniArtirma;

import java.util.Arrays;
import java.util.Scanner;

public class c01_KullaniciyaArrayOlusturtma {
    public static void main(String[] args) {


            // Soru 5- Kullanicidan array’in boyutunu ve tamsayi elementlerini alip
           //        array’i olusturan ve bize donduren bir method olusturun.

        System.out.println(Arrays.toString(arrayOlustur()));



        int [] benimArray = arrayOlustur();
        System.out.println(Arrays.toString(benimArray));

        // benim array'imdeki tum sayilari 4 artirin

        benimArray = C02_ArrayinElemanlariniArtirma.elemanlariArtir(benimArray,4);


    }


    public static int[] arrayOlustur(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen arayin boyutunu giriniz:");
        int elemanSayisi=scanner.nextInt();

        int[] arr = new int[elemanSayisi];


        for (int i = 0; i < arr.length; i++) {
            System.out.println("Array'e eklemek için bir tam sayi giriniz:");
            arr[i]=scanner.nextInt();
        }

            return arr;


    }


}
