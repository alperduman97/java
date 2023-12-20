package day04_wrapperClasses_Increment;

import com.sun.jdi.IntegerValue;

public class c01_WrappClass {

    public static void main(String[] args) {


        int sayi = 10;

        String str= "Java Candur";

        //Java primitive data türler için de
        //istediğimizde method kullanbileceğimize imkan vermek
        // amacyıla Wrapper class'ları oluşturmuştur.
        // Boolean, Charachter, Byte, Short, Integer, Long, Float ve Double

        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(Double.MAX_VALUE); // 1.7976931348623157E308  , E308; sonda 308tane 0 var demek

        String sayi1 = "103";
        String sayi2 = "204";

        //sayi1 ile sayi2'yi toplayın
       System.out.println(sayi1+sayi2); // 103204 --> iki metni yan yana getirdi. Toplama işlemi yapmadı.

        //Matematiksel olarak String ile yaptırmak için;

        int sayi1inDegeri= Integer.parseInt(sayi1);
        int sayi2inDegeri= Integer.valueOf(sayi2); // yada Integer.parsenInt(sayi2) yaparız. Valueof - ParseInt'ın kardeşi gibi

        System.out.println(sayi1inDegeri+sayi2inDegeri); //307

        System.out.println(Integer.max(34, 45)); //45 --> a ile b arasındaki en büyük sayıyı yazdırır.

        char chr1 = '7';
        char chr2 = 'r';
        char chr3 = '#';

        System.out.println(Character.isLetter((chr1))); //false ---> chr1'deki karakter Letter(harf) olmadığı için false yazdırır.
        System.out.println(Character.isLetter((chr2))); //true
        System.out.println(Character.isAlphabetic((chr3))); //false


        //chr2'nin değeri olan ryi büyük R yapın.

        System.out.println(Character.toUpperCase(chr2));  //R

        

    }
}
