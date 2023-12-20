package day10_StringManipulations;

public class c06_startsWith_endsWith {
    public static void main(String[] args) {


        String str = "Java Candir";

        System.out.println(str.startsWith("J")); // str "J" ile başlıyor, doğru mu? doğru
        System.out.println(str.startsWith("Ja")); //Ja, true
        System.out.println(str.startsWith("Java")); // true
        System.out.println(str.startsWith("Java Candir")); //true


        System.out.println(str.endsWith("r")); // true --> "r" ile bitiyor doğru mu ? doğru
        System.out.println(str.endsWith("dir")); //true
        System.out.println(str.endsWith("Candir")); //true





    }
}
