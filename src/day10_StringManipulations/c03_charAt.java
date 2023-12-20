package day10_StringManipulations;

public class c03_charAt {


    public static void main(String[] args) {



        String str = "Java candır";

        System.out.println(str.charAt(0)); //ilk harfi yazdıracak. J

        System.out.println(str.charAt(7)); // 7.karakterdeki harfi yazdıracak, yani, n

        //son harfi yazdırmak için

        System.out.println(str.charAt(10)); //r

        //ya da
        System.out.println(str.charAt(11-1)); //r

        //ya da
        System.out.println(str.charAt(str.length()-1)); // --> yazıp karakter sayisini manuel yazmak yerine otomatik aliriz
        //ve böylece bu dinamikle surekli kendini yeniler. uzunluk arttıkca o da otomatik kendini yeniler.

        //örn: sondan 3.harfi yazdırın
        System.out.println(str.charAt(str.length()-3)); //d

        // olmayan bir indeks kullanırsak ne olur?
        //System.out.println(str.charAt(20)); //.StringIndexOutOfBounds yani bu sayı sınırların dışıda diyor

        System.out.println(str.charAt(str.length())); // .StringIndexOutOfBounds, charAt'in icine lenght yazamıyoruz. yine aynı hatayı veriyor






































    }
}
