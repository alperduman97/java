package day21_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class c04_MultiDimensionalArrays {


    public static void main(String[] args) {


        int[][] arr= {{3,4,5},{9,10},{7},{1,2,3,4,5,6}};
        System.out.println(arr[0]); //[I@1d251891
        System.out.println(Arrays.toString(arr[0])); //[3, 4, 5]
        System.out.println(arr[3][3]); //4   3.arrayin'3.indexindeki elemanı cagırdıgımız icin, direkt sayi yazdirdigi icin
        //direk böyle yazdirabiliyoruz. direk arr'i yazdirmak icin "Arrays.toString kalıbını kullanmamız gerekir

        System.out.println(Arrays.toString(arr[2])); // [7] --> array olarak yazdıgını [] parantez icinde yazmasından anlarız
        System.out.println(arr[2][0]); //7  --> direkt element yazdırdıg ıcın [] parantez yok!


        //10 elementlinin yerine deger olarak 5 atayin
        arr[1][1]=5;
        //arr'nin birinci indexindeki inner array'in birinci indexideki 10'u 5 olarak atakdık.

        //6 elementinin yerine 8 atayin
        arr[3][5]=8;

        //tüm array'i yazdirin

        System.out.println(Arrays.deepToString(arr)); // [[3, 4, 5], [9, 5], [7], [1, 2, 3, 4, 5, 8]]



        //1 index'teki inner array2in 1.indexiteki elementin degerini dinamik olarak 3 arttırın.


        arr[1][1] +=3;

        System.out.println(Arrays.deepToString(arr)); // [[3, 4, 5], [9, 8], [7], [1, 2, 3, 4, 5, 8]]






    }








}
