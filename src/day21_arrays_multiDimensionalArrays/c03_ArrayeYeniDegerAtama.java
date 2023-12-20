package day21_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class c03_ArrayeYeniDegerAtama {
    public static void main(String[] args) {


        //var olan bir Array'e yeni bir deger atanabilinir mi?

        int [] arr1= {3,5,6};

        // arr1= {4,2,6,}  --> böyle atama olmuyor


        //once istedigimiz array'i ayri bir array olarak olusturur
        // sonra da bizim array'imize atama yapariz


        int [] geciciArr = {4,2,6};
        arr1=geciciArr;

        //eger yeni atadigimiz array default degerlerden olusan bir array olacaksa
        // new kayword kullanarak direk atama yapabiliriz.

        arr1= new int[5];
        System.out.println(Arrays.toString(arr1)); //  [0, 0, 0, 0, 0]


        //olusturulmus bir array'e uzunlugunu degistirecek sekilde bir element eklemek
        // veya element silmek mümkün müdür?

        int[] sayilar = {4,2,1,3,9};

        //4.element olarak 3 ekleyin
        sayilar[3]= 3;  // ArrayIndexOutOfBoundsException --> sınırların dısında hatası verıyor cunku 0,1,ve 2 var 3.satır yok


        // day20'den kod cagırdık bende yoktum yapmadım..




        //array2in ilk elementi olan 4'u array'den silin
        //aray'i 4 elementli hale getirin



        //var olan bir array'e uzunlugu degistirecek sekilde yeni element ekleyemeyiz
        //veya element silemeyiz
        //Bunun yerine istenen elementlere sahip yeni bir array olusturup
        //sonra yeni array'i seski array'e deger olarak atayabiliriz



        //once uzunlugu eski array'den 1 eksik olan yeni bir array olusturalim
        int[] yeniSayilar=new int[sayilar.length-1];
        // eski array'deki silinecek element dısındaki elementleri
        //yeni array'e koplayalım

        for (int i = 0; i <yeniSayilar.length ; i++) {
            yeniSayilar[i] = sayilar[i+1];


        }

        sayilar = yeniSayilar;
        System.out.println(Arrays.toString(sayilar));



        


















    }
}
