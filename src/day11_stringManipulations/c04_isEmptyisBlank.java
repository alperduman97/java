package day11_stringManipulations;

public class c04_isEmptyisBlank {

    public static void main(String[] args) {


        String str1 = "";
        String str2= "       ";
        String str3= "a b";

        System.out.println(str1.isEmpty()); //true    ,, hiçliğe de boş diyor
        System.out.println(str2.isEmpty()); //false   ,, space'e boş demiyor.
        System.out.println(str3.isEmpty()); //false

        System.out.println(str1.isBlank()); //true -->space ve hiçliği boş olarak görüyor.İki tirnak arasi boş sonuçta.
        System.out.println(str2.isBlank()); //true --> str2 boşluk mu? evet boşluk ,yani sadece space'ler var
        System.out.println(str3.isBlank()); //false


    }
}
