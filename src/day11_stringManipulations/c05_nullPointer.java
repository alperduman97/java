package day11_stringManipulations;

public class c05_nullPointer {
    public static void main(String[] args) {

        String str;

        // System.out.println(str); --> bir valiable'ı deger atamadan oluşturabilirsiniz ama kullanmazsiniz.

        String str2= "";

        System.out.println("str2'nin degeri :" + str2 + "====");
        System.out.println("str2'nin uzunlug:" + str2.length()); //0

        //str'ye hiçlik atayabiliriz
        // ama bu durumda Java bu variable'a bir deger atandigini kabul eder,
        // deger atanmamis elementleri say dediğimizde
        // "" degeri atananlari dolu kabul eder
        // baska data türlerinde hiçlik atama sansi da olmaz


        //null pointerlar Java tarafindan ozel bir gorev icin olusturulmustur
        // bir variable'in deger atanmamis oldugunu isaretler
        // null bir deger degil isaretcidir.


        String str3=null; // int, double vs. için kullanamayız, sadece Non-primitve'ler için

        System.out.println(str3);   //null --> str3'e deger atanmamis null olarak kalmis diyor. null'ı deger olarak atamıyoruz!

        //null sadece non-primitive'lere yazilir

        System.out.println(str3+ "Java"); //nullJava
        //null olarak işaretlenen variable'lar sadece yazdırılabilinir



        // deger atamadan baska islem yapmak isterseniz
        //NullPointerException hatasi verir
        System.out.println(str3.length()); //NullPointerException


















































    }
}
