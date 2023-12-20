package day23_ArrayLists;

import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c07_OrtalamaUstundekiOgrenciler {
    public static void main(String[] args) {

        //bir öğretmenden öğrenci ismini ve notunu isteyin
        // öğretmen Q'ya bastiginda islemi bitirip
        // ortalama üzerinde not alan ogrencilerin isimlerini list olarak yazdirinn

        //ipucu: isimleri ve notlari ayri 2 lise olarak tutun

        Scanner scanner = new Scanner(System.in);
        List<String>IsimlerListesi=new ArrayList<>();
        List<Double>notlarListesi=new ArrayList<>();
        double girilenNot=0;
        int notToplami=0;
        String girilenIsim="";

        while(!girilenIsim.toUpperCase().equalsIgnoreCase("Q")){

            System.out.println("Lütfen öğrenci ismini giriniz:");
            girilenIsim=scanner.nextLine();
            scanner.nextLine();
            if(!girilenIsim.toUpperCase().equalsIgnoreCase("Q")){

                IsimlerListesi.add(girilenIsim);
                System.out.println("Lütfen öğrencinin notunu giriniz:");
                girilenNot=scanner.nextDouble();
                 girilenIsim= scanner.nextLine();


            }

        }

                double ortalama = notToplami / notlarListesi.size();


        //elimizde notlarListesi ve IsimlerListesi var
        //ayni indexteki isim ve not ilintili olsun
        //notlar listesindeki notlari gözden geçirip
        //ortalamanın üstünde  olanlarin
        //önce ismini, yanına notunu yazdirin


        for (int i = 0; i <IsimlerListesi.size() ; i++) {

            if (notlarListesi.get(i) >= ortalama){

                System.out.println(
                        IsimlerListesi.get(i)
                        + " " + notlarListesi.get(i)


                );


            }



        }









    }
}
