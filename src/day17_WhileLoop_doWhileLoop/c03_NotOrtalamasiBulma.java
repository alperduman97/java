package day17_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class c03_NotOrtalamasiBulma {
    public static void main(String[] args) {

        //Bir öğretmenden not ortalaması bulmak için notları alın,
        // öğretmen işlemi bitirmek iiçin negatif bir sayi girmelidir
        // öğretmen negatif sayi girdiginde
        // toplam kaç not girdiğini
        // ve en yüksek notu yazdirin


            //--> tekra sayisi belli degilse whileLoop iyidir..

        Scanner scanner = new Scanner(System.in);
        double not=0;
        double toplam = 0;
        int sayac = 0;
        double enYuksenNot = 0;

        while (not >= 0){
            System.out.println("Ortalama için notları giriniz,\n islemi bitirmek için negatif bir sayi giriniz:");
            not=scanner.nextDouble();


            if(not >0){
                toplam += not;
                sayac++;


            //en yüksek not için her girilen notu
            // o andaki not ile karşılaştıralım
            // ve girilen not, en yüksek nottan büyükse
            // onu en yuksek not olarak atayalim

            if (not > enYuksenNot) enYuksenNot =not;


            }

            System.out.println("Not girilen ogrenci sayisi:"+sayac+
                    "\n Girilen notlarin ortalamasi:" + toplam/sayac+
                    "\n Girilen en yüksek not:" +enYuksenNot );


        }









    }
}
