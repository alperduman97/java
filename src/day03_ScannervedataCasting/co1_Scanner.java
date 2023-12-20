package day03_ScannervedataCasting;

import java.util.Scanner;

public class co1_Scanner {

    public static void main(String[] args) {

        // Kullanıcıdan isim, soyism ve yasi alıp aşağıdaki gibi ekrana yazdır.
        // girilen bilgiler: J. Doe, 44


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz");
        char girilenIsim = scanner.nextLine().charAt(0);
        System.out.println("Lütfen soyadınızı giriniz");
        String girilenSoyisim = scanner.nextLine();
        System.out.println("Lütfen yaşınızı giriniz");
        int girilenYas = scanner.nextInt();
        System.out.println("Girilen Bilgiler: " +girilenIsim+ "." +girilenSoyisim+ ", " + girilenYas);



    }
}
