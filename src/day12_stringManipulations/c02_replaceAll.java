package day12_stringManipulations;

public class c02_replaceAll {
    public static void main(String[] args) {


        String str= "j1a34va12 C87an90d654ir";

        //metinden tüm sayiları temizleyip
        // metni kaydedin.


        // ReplaceAll tüm harfleri ya da rakamları diyebileceğimiz durumlarda kullanilir

        // ornegin bu soruda "tüm sayilari yok etmemiz" lazim

        System.out.println(str = str.replaceAll("\\d", "")); //java Candir , d:digit--> bütün digitleri silip yerine bosluk yazdi



    }
}
