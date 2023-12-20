package day11_stringManipulations;

public class c02_LastIndextOf {
    public static void main(String[] args) {

        String str= "Bu Java Ogrenilecek";

            //e'nin ilk kullaniminin indexini yazdırın

        System.out.println(str.indexOf("e")); //11

        //e'nin son kullanım indexini yazdirin

        System.out.println(str.lastIndexOf("e")); //17 ,, aramaya sondan başlıyıp e'yi arıyor. Index soldan başlar hep o yüzden 17

        //u'nun ilk ve son kullanım indexini yazdirin

        System.out.println("ilk index:" + str.indexOf("u")); //1
        System.out.println("son index:" + str.lastIndexOf("u")); //1

        // J harfinin bu metinde hiç olmadıgını veya
        // sadece 1 kere kullanildigini yazdirin

        if( str.indexOf('J') == -1 ){
            System.out.println("Metinde J yoktur");
        } else if (str.indexOf("J") == str.lastIndexOf("J")){
            System.out.println("metinde J bir kere kullanılmıştır.");
            
        }



                // Bu Java ogrenilecek

        System.out.println(str.lastIndexOf("e",15)); //15 15'ten baslayip sola dogru gidip e'yi arar
        System.out.println(str.lastIndexOf("e",14)); //11 14'ten baslasayip e-yi arar.





    }
}
