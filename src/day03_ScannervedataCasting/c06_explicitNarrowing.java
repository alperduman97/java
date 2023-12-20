package day03_ScannervedataCasting;

public class c06_explicitNarrowing {
    public static void main(String[] args) {

        double dbl = 34.5;
        int sayi= (int) dbl;
        System.out.println(sayi); //34 ten sonrasını yani virgülden sonrasını atar

        int sayi1 = 23;
        byte byt = (byte) sayi1;
        System.out.println("23ün byte değeri"+ byt); //23

        int sayi2 = 130;
        byt = (byte) sayi2;
        System.out.println("130'un byte değeri;"+byt); // -126

        //byte 127e kadar max gidiyor. Ondan sonra -ye dönüp kalan 4'ü tamamlıyor. -128'den başlıyor byte.
        // 127'den sonra 128=-128 , 129=-127 , 130=-126

        int sayi5=2100000000;
         sayi5= sayi5+500000000;
        System.out.println(sayi5); // -1694967296   , toplama yaparak sınırları aştık. Byttetaki gibi başa döndü.

        


    }
}
