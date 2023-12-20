package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_CheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException {
String dosyaYolu ="src/day40_exceptions/yazi.txt";

//Java'da bilgisayarimizda varolan bir dosyaya ulaşmak için
        //FileInputStream class'i kullanilir


        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
        } catch (FileNotFoundException e) {

        }

        /*  Java, bir dosyaya ulaşmasini istediğimiz de , o dosyaya ulaşabileceğinden emin olmak ister
        ve bizi bu konuda bir eylem yapmaya zorlamak için kodun altini kirmizi çizer

        kodun altini kirmizi çizmesi
        bugüne kadar hep kodda hata var düzeltmemiz lazdim diye yorumlamıştık

        Ancak checked exception'larda java riski görür ve önlem almamiz için altini kirmizi çizer.

        Java'da dosyadan bilgi alma veya dosyaya bilgi yazdirma ile ilgili exception'lar checked exception'lardir.
        Yani daha compile aninda Java bu riskleri farkeder ve bizden bir çözüm ister.
         */



        /*
        Checked Exception'lar için Java bize 2 alternatif sunar;
        1- su ana kadar yaptiğimiz gibi try-catch ile sarmayalıp, sorun oluşşsa bile calışmaya devam etmesini sağlayabiliriz.

        2-Eğer exception'i kontrol altına alıp çalismaya devam etmesini istemiyorsaniz
        Sadece kirmizi çizgiyi yok etmek
        kodlarimizi çalışır hale getirmek ve exception oluşursa kodlarımızın çalışmayı durdurmasını istersek
        method deklarasyonuna, riskin farkinda olduğumuzu beyan eden
        throws keyword yazmamiz yeterlidir

        "throws FileNotFoundException" : method deklarasyonuna eklediğimiz bu bölüm riskin farkinda olduğumuzu söyler
        Ama exception'ı kontrol altina almaz.
         */


        FileInputStream fileInputStream = new   FileInputStream(dosyaYolu);
    }
}
