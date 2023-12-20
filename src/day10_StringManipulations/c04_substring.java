package day10_StringManipulations;

public class c04_substring {

    public static void main(String[] args) {


        String str = "Java Candir";

        // String'de iki farklı yöntemle substing elde edebilriz
        // tek parametre yazarsak

        System.out.println(str.substring(3)); //beginindex: başlangıc indexi. 3 yazdığımız için 3 olarak alacak
        // ve a Candir yazacak
        System.out.println(str.substring(0)); // Java Candir diye baştan sonra yazdı
        System.out.println(str.substring(9)); // ir

        //son 3 karakteri yazdirin ama dinamik olarak yapmamız gerekir

        System.out.println(str.substring(str.length()-3)); //dir yazar. length'le dinamik yazdirdik

       // System.out.println(str.substring(20)); // StringIndexOutOfBoundsException hatası verir

        System.out.println(str.substring(str.length())); //dir yazdirir, boş bir satırı döndürür.
        System.out.println("-");


        // 2 parametre yazarsak
        // ilk parametreye eşit olan indeksten başlar
        // ikinci parametereye kadar yazar
        //ilk indeks dahil  ikinci indeks dahil degildir
        System.out.println(str.substring(1, 6)); //ava C yazdirir.
        System.out.println(str.substring(0,7));  //Java Ca
        System.out.println(str.substring(1,2)); //a

        //7.index'deki elemanı yazdirin
        System.out.println(str.charAt(7)); //n
        System.out.println(str.substring(7,8)); //n
                // ikisinin farkı ne?

        //str.charAt(7). char oldugu için noktadan sonra metod kullanamıyoruz
        //str.substring(7,8). String oldugu icin method kullanabiliriz
        System.out.println(str.substring(2,2)); //hiclik olur
        System.out.println("======");


        System.out.println(str.substring(6,4)); //StringIndexOutOfBoundsException  - 6'den sonra 4.indeks olmadıgından hata veriyor

        // ilk 7 karakteri yazdırın
        System.out.println(str.substring(0,7)); // Java Ca









    }
}
