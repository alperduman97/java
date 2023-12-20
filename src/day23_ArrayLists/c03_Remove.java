package day23_ArrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class c03_Remove {

    public static void main(String[] args) {


        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);
        sayilar.add(0);

        System.out.println(sayilar); // [3, 5, 2, 0]


        /* remove 2 şekilde yapılır;
        -remove(index) ve,
        -remove(object)

        sayilar(0) eleman 9 mi yoksa index 0 mi?


        Java'da her şey nettir
        eğer listemiz Integer'lardan oluşuyorsa
        Java parametre olarak yazdigimiz int sayiyi direkt index olarak kabul eder
        eğer element olarak herhangi bir sayisi silmek isterseniz önce bir Objext olarak  o sayiyi
        tanimlamali sonra silmelisiniz.

         */

        System.out.println(sayilar.remove(0));// 3'ü siler... ve delil olarak satıra 3 yazar

        System.out.println(sayilar); //[5, 2, 0] -- 3' ü sildi bunlar kaldı.

        //eleman olarak 5'i silmesini istersek
        // önce bir obje olarak 5'i tanımlamaliyiz

        Object silinecekElement=5;
        sayilar.remove(silinecekElement);
        System.out.println(sayilar); // [2, 0]


        Object silinecekEleman1=8;
        System.out.println(sayilar.remove(silinecekElement)); //false silinecek elemanı yani 8'i bulamadığı için false döner

        silinecekElement=2;
        System.out.println(sayilar.remove(silinecekElement)); //true
        System.out.println(sayilar); //[0]




    }
}
