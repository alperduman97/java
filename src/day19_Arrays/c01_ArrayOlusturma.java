package day19_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class c01_ArrayOlusturma {
    public static void main(String[] args) {

       int arr1= 20;
       arr1=30;
       int[] arr2={3,4,5}; //data turu; int, uzunluk:3
        // array'de herhangi bir elemana ulasmak veya deger atamak istersek
        // index kullanırız

        System.out.println(arr2[2]);  //5   3' sıfırında index, 4'birinci index, 5'ikinci index oluyor.
        System.out.println(arr2[1]); //4

        //arr2'nin içindeki 4'ü 8'yapin

        arr2[1]=8;

        //bu array 3 elemanli olarak olusturuldu
        //4.eleman olarak 3.indexi atama yapmak istersek
        // java syntax olarka işlem doğru oldugundan altını cizmez

       // arr2[3] = 20;  // ArrayIndexOutOfBoundsException , 4.eleman olarak deger atıyamıyoruz.

        //array'deki tüm elementleri yazdirin
        System.out.println(arr2[0] +  " " +arr2[1]+ " " + arr2[2] );
        int[]arr3={2,3,4,3,4,5,6,7,4,35343,2453,5};

        //arr3'ün tüm elemanlarını yazdırın desek?

        for (int i = 0; i <arr3.length ; i++) { // i=>0,1,2,3,4,5.....

            System.out.print(arr3[i]+ " ");


        }
        System.out.println(" ");



            // arr3 array'ini yazdirin

        System.out.println("tüm array:" + arr3); // tüm array:[I@47f6473
        //array non-primitive bir java objesidir
        // non-primitve'lerin bazilari direk olarak yazdirilabilir
        // anca Array'ler direk yazdırılamaz
        // eğer array'in tamamini yazdirmak isterseniz
        // Java'daki arrays class'indan yardım almanız gerekir


        System.out.println(Arrays.toString(arr3)); // [2, 3, 4, 3, 4, 5, 6, 7, 4, 35343, 2453, 5]
            //Array.toString(istenenArr) ==> java tüm elementleri arasinda ", " olacak şekilde
           // köşeli bir parantez içinde yazdırır


        int[]arr4=new int[5];

        //Java icine 5tane int alabilen bir array olusturur
        // bu durumda değer atanmadığı için bir değer atıncaya kadar
        // java elementlere default değeri atar.
        System.out.println(Arrays.toString(arr4));  //[0, 0, 0, 0, 0]

        arr4[0]=6;
        arr4[3]=9;
        arr4[1]=2;
        System.out.println(Arrays.toString(arr4));  // [6, 2, 0, 9, 0] --> değer atadıklarımız dışındakiler 0 olarak kaldı..











    }
}
