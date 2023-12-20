package day21_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class c05_MDA_tumElementleriGozdenGecirme {


    public static void main(String[] args) {

        //verilen bir array'de çift sayıların toplamını yazdırın

        int[] arrT = {3, 4, 6, 9, 0, 2, 5, 6, 8, 1};
        int toplam = 0;
        for (int i = 0; i < arrT.length; i++) {

            if (arrT[i] % 2 == 0) {

                toplam += arrT[i];


            }

        }


        System.out.println(toplam); // 26


        //çift katlı olarak yapalım


        int[][] arrIkiKatli = {{3, 4, 6}, {9, 0}, {2, 5, 6, 8, 1}};

        //iki katli bu array'de çift sayilarin toplamini yazdirin

        toplam = 0;

        for (int i = 0; i < arrIkiKatli.length; i++) { //inner arayleri kontrol eder

            for (int j = 0; j < arrIkiKatli[i].length; j++) { //inner array'deki elementleri kontrol eder. 2.köşeli parantezi

                if (arrIkiKatli[i][j] % 2 == 0) {

                    toplam += arrIkiKatli[i][j];


                }
            }




        }
                             System.out.println(toplam); //26
    }
}
