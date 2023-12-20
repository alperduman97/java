package day10_StringManipulations;

public class c02_equals {

    public static void main(String[] args) {


        String str1 = "Ahmet";
        String str2 = "AHMET";
        String str3 = "ahmet";
        String str4 = "AhMet";
        String str5 = "Ahmet";
        String str6 = new String ("Ahmet");
        String str7 = "Ah";
        String str8 = "met";
        String str9 = str7+str8; //Ahmet

        // 1-String case sensitive'dir (yani büyük/küçük harf duyarlıdır),
        // str1/2/3/4'ün değerleri birbirinden farklıdır.
        // str1, str5, str6 ve str9'un değerleri aynıdır.




        // String'de karsilastirma icin == kullanirsanız
        // metni ayni olan stringlerde bile false donebilir
        System.out.println(str1==str5); //Ahmet == Ahmet -- true
        System.out.println(str1==str6); //Ahmet == Ahmet -- false
        System.out.println(str1== "Ahmet"); //Ahmet == Ahmet -- true
        System.out.println(str1==str9); //Ahmet == Ahmet -- false

        //bunun sebebi, == hem metin degerine hem de referansa baktığı için metni aynı olan farklı stringler icin
        // farklı sonuclar verebilir...


        //ŞİMDİLİK stringlerde eşitlik kontrolü için; == yerine equals()'i kullancağız.
        //equals metodu aynı metinler için "true" döner
        System.out.println(str1.equals(str5));    //Ahmet == Ahmet -- true
        System.out.println(str1.equals(str6));    //Ahmet == Ahmet -- true
        System.out.println(str1.equals("Ahmet")); //Ahmet == Ahmet -- true
        System.out.println(str1.equals(str9));    //Ahmet == Ahmet -- true


        //equal metodunu farklı metinler için "false" olarak döner
        System.out.println(str1.equals(str2)); //Ahmet == AHMET -- false
        System.out.println(str1.equals(str3)); //Ahmet == ahmet -- false
        System.out.println(str1.equals(str4)); //Ahmet == AhMet -- false


        //Eger büyük-kücük harfleri de eşit kabul edelim derseniz.
        System.out.println(str1.equalsIgnoreCase(str2)); //Ahmet == AHMET -- true
        System.out.println(str1.equalsIgnoreCase(str3)); //Ahmet == ahmet -- true
        System.out.println(str1.equalsIgnoreCase(str4)); //Ahmet == AhMet -- true
























    }
}
