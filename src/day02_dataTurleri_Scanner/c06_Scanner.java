package day02_dataTurleri_Scanner;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class c06_Scanner {

    public static void main(String[] args) {
        /* Kullanıcının ismini, soyismini, yaşını alıp aşağıdaki formatta yazdırın.

        Adınız:
        Soyadınız:
        Yaşınız:
        Kaydınız Başarıyla Tamamlanmıştır.
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Adınız Giriniz:");
        String girilenIsim = scanner.nextLine();

        System.out.println("Lütfen Soyadınızı Giriniz:");
        String girilenSoyIsim = scanner.nextLine();

        System.out.println("Lütfen Yaşınızı Giriniz:");
        int girilenYas = scanner.nextInt();

        System.out.println("Adınız:"+girilenIsim);
        System.out.println("Soyadınız:"+girilenSoyIsim);
        System.out.println("Yaşınız:" +girilenYas);
        System.out.println("Kaydınız Başarılı Bir Şekilde Oluşturuldu.");





    }
}
