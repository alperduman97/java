package day23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class c06_PozitifTamBolenlerListesi {

    public static void main(String[] args) {

     // Verilen pozitif bir tamsayiyi,
        //     tam bolebilen tum pozitif tamsayilari
        //   bir liste olarak bize donduren bir method olusturun


        int sayi=20; // [1,2,4,5,10,20] -->yirmiyi tam bölen sayılar

        List<Integer> tambolensayilar = new ArrayList<>();

        for (int i = 1; i <=sayi ; i++) {
            if (sayi % i  == 0){

                tambolensayilar.add(i);
            }

        }

        System.out.println("tam bölenler listesi_" + tambolensayilar); // tam bölenler listesi_[1, 2, 4, 5, 10, 20]












    }
}
