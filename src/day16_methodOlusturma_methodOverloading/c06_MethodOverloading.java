package day16_methodOlusturma_methodOverloading;

public class c06_MethodOverloading {
    public static void main(String[] args) {

        /* Java bir class'ta ayni isimden birden fazla method olmasına ızın verir ama signature'lari farklı olmalı.
        signature: method ismi + parametre data türleri
         */

        //OVERLADING : İSİMLERİ AYNI AMA METHODLARI DEGISTIRIYORUZ

        /*Eger ayni isimde birden fazla method varsa
                1- Java öncelikle argüment ve parametlere arasında %100 uyum olan  var
                 mi diye bakar kontrol eder.
                 2- Eger %100 uyum yoksa casting ile kullanılabilecek var mi diye tümünü kontrol eder.
                 Birden fazla method casting ile calışabilir durumda olursa en az casting olanı kabul eder.
         */

        topla(6); //1.method
        topla(3,5); //2.method
        topla(6.3,5); // 3.method
        topla(2.4,5); //4.method
        topla(2.3,3.4); // 5.method
        topla('a',5); //topla char int ==> int-int 102 2.methodu  calistirdi, data casting yapti.
        topla(2.3f,3.5f); // topla float float ==> 5.method calisti, data casting yapti.
        topla(4,5.2); // topla int double ==> 5.methodu casting yapıp calistirdi.









    }

    public static void topla(int sayi)   // imza: topla int
    {
        System.out.println("Tek integer:" + (sayi + sayi));
    }
    //public static void topla(int a){  //burada imza: topla int yani yukarıdakiyle aynı o yüzden aşağıdaki gibi yapıyoruz.
    public static void topla(int a, int b) { // imza ; topla int int

        System.out.println("int int:" + (a + b));

    } //signature int int
    public static void topla(double a, int b) { // imza ; topla double int

        System.out.println("double int:" + (a + b));

    } //signature ; double,int
    public static void topla(float a, int b) { // imza ; topla float int

        System.out.println("float int:" + (a + b));

    } //signature ; float,double

    public static void topla(double a, double b) { // imza ; topla double double

        System.out.println("double double:" + (a + b));

    }  //signature ; double,double
}


