package day30_timeDate_varargs;

public class C06_Varargs {
    public static void main(String[] args) {
        islemYap ("Ali", "Veli", "Sahil", "Saido"); //6 -- kelimenin uzunlugu Ali'den 3+(t'den sonraki kelime sayısı)+3=6
        islemYap("Meltem"); //6- kelime uzunlugundan


    }


    public static void islemYap(String s, String... t){
        System.out.println(s.length() + t.length);
    }

}
