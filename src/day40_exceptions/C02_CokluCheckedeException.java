package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_CokluCheckedeException {
    public static void main(String[] args)  {


        /*
        kodumuzda birden fazla exception olusma ihtimali varsa tek try, birden fazla catch blogu kullanabiliriz.
        Cath bloklari siralanirken, exception türleri dikkat alınmalıdır.


        Eğer oluşabilecek exception'lar arasında parent child ilişkisi yoksa, istediğimiz sıralamada yazabiliriz

        Eğer oluşabilecek exception'lar parent-child ilişkisine sahip iseler
        bu durumda child olanı üste; parent olanı alta yazmalıyız. Aksi takdirde parent üsttte olunca tüm excepitonları
        yakalar ve child exceptionı yazmak anlamsiz olur.

         */








        String dosyaYolu = "src/day40_exceptions/yazi.txt";

        try {

            FileInputStream fis = new FileInputStream(dosyaYolu); //dosyaya ulaşma

            int k=0;
            while((k= fis.read() ) != (-1)) { //dosyayi okuyup, bize getirme
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Yazilan dosya yolunda sorun var");
        }catch (IOException e){
            System.out.println("Dosya okunurken hata oluştu");
        }catch (Exception e){
            System.out.println("Öngörülemeyen bir hata oluştu");
        }

    }
}
