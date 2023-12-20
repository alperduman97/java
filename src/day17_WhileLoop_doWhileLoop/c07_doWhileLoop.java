package day17_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class c07_doWhileLoop {
    public static void main(String[] args) {
        /*
        While Loop'da parantez içinde kontrol edilen değişkene biz loop'dan önce değer atıyoruz.
        eğer bu değişkene uygun olmayan bir değer ataması yaparsak loop hiç çalışmaz.
        Java bu durumun önüne geçmek için yani kontrolü kullanicidan değer aldıktan sonra yapabilmemiz için
        do-while-loop oluşturmuştur.


        do-while-loop kullanıldığında loop body'sinin çalışmama ihtimali yoktur.Loop body'si en az bir kere çalışır.


         */


        // Bir ogretmenden not ortalamasi bulmak icin notlari alin
        // ogretmen islemi bitirmek icin negatif bir sayi girmelidir
        // Ogretmen negatif sayi girdiginde
        // toplam kac not girdigini,
        // not ortalamasinin kac oldugunu yazdirin

        Scanner scanner = new Scanner(System.in);
        double not = -5;
        double toplam = 0;
        int sayac = 0;

        /*
        while (not >= 0){

            System.out.println("ortalama hesaplamak icin notlari giriniz\nbitirmek icin negatif sayi girmelisiniz");

            not = scanner.nextDouble();

            if (not>=0){
                toplam += not;
                sayac++;
            }
        }

         */


        do {
            System.out.println("ortalama hesaplamak icin notlari giriniz\nbitirmek icin negatif sayi girmelisiniz");

            not = scanner.nextDouble();

            if (not >= 0) {
                toplam += not;
                sayac++;
            }
        } while (not >= 0);

        System.out.println("toplam girilen not sayisi : " + sayac +
                "\ngirilen notlarin ortalamasi : " + toplam / sayac);
    }
}