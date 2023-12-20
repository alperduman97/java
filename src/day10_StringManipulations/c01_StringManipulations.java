package day10_StringManipulations;

import java.util.Locale;

public class c01_StringManipulations {
    public static void main(String[] args) {

        String str = "Java Candır";
        System.out.println(str.toUpperCase()); // JAVA CANDIR
        System.out.println(str.toLowerCase()); // java candır

        //String methodları kullandıgımız orijinallik degismez

        //degisikliği kalici olarak yapmak istersek atama yapmalıyız.
        str = str.toUpperCase();
        System.out.println(str); // yeni str artık bu oldu. = işaretiyle atama yaptık

        //stri kucuk harfe cevirin

        // ancak I harfi kucuk harfe çevrildiğinde ingilizcede dolayı "i" olarak çevirir. Bilgisayar hangi dildeyse ona otamatik çeviriyor
        System.out.println(str.toLowerCase()); //java candir

        // eğer I yi türkçedeki gibi "ı" yapmak istersek.
        // toLowerCase(Locale..) lar kullanılabilinir.
        System.out.println(str.toLowerCase(Locale.forLanguageTag("TR")));

    }


}
