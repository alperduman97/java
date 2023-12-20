package day12_stringManipulations;

public class c01_replace {

    public static void main(String[] args) {


        String str= "Hava Candir.";


        System.out.println(str.replace("H", "J")); //H yerine J'yi yazdirdik. Java Candir

        System.out.println(str); //Hava candir , atama yapmadiğimiz icin üstteki satir kalici olmadi

        System.out.println(str = str.replace("H", "J").replace(".", "")); // Java Candir

        System.out.println(str); // Java candir olarak üst satirda atama yaptik


        System.out.println(str.replaceFirst("a", "A")); //buldugu ilk a yi degistirip "A" yazdi.
        System.out.println(str.replace("a", "A")); //bütün "a" ları "A" yaptı. JAvA CAndir


        // boslugu yok etmek icin;
        System.out.println(str.replace(" ", "")); // JavaCandir


        str= "Ali uzunkavaklaraltindayataruyumazoglu";

        System.out.println(str.replace('u', 'U')); // char yani tek tırnak(') ile ya da String yani çift(") ile de olur.

        System.out.println(str.replace("l", "XYZ")); // AXYZi uzunkavakXYZaraXYZtindayataruyumazogXYZu


    }
}
