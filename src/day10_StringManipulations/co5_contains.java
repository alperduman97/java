package day10_StringManipulations;

public class co5_contains {

    public static void main(String[] args) {

        String str = "Java Candir";
        //adet gözetmeksizin bir STRiNG'de
        // aranan bir metinde var olup olmadığına bakar
        // metin varsa true, yoksa false döndürür


        System.out.println(str.contains("a")); //true
        System.out.println(str.contains("b")); //false
        System.out.println(str.contains("java")); //false --> Java olarak var ama java yok
        System.out.println(str.contains("a C")); //true


        System.out.println(str.contains(" ")); //true
        System.out.println(str.contains("")); //true --> hiçlik



    }
}
