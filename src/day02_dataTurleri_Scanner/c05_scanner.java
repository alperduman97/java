package day02_dataTurleri_Scanner;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class c05_scanner {
    public static void main(String[] args) {

        //kullanıcıdan bir double bir de  int sayı alıp bunların toplamını ve carpımını yazdırın.


/*


       Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen tam olmayan bir sayı giriniz:");
        double girilenDoubleSayi = scanner.nextDouble();


        System.out.println("Lütfen tam sayı giriniz:");
        int girilenIntSayi = scanner.nextInt();

        double toplam = girilenDoubleSayi + girilenIntSayi;
        System.out.println("Girilen Sayıların Toplamı:" + toplam );

        double carpım = girilenDoubleSayi * girilenIntSayi;
        System.out.println("Girilen Sayıların Çarpımı:" + carpım);


 */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen tam sayı giriniz:");
        int girilenTamSayi = scanner.nextInt();
        System.out.println("Lütfen ondalıklı bir sayı giriniz");
        double girilenOndalikliSayi = scanner.nextDouble();
        System.out.println("Girilen Sayıların Toplamı =" + (girilenOndalikliSayi+girilenTamSayi));
        System.out.println("Girilen Sayıların Çarpımı =" + girilenOndalikliSayi*girilenTamSayi);













    }
}
