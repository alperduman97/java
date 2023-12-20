package day13_ForLoop;

import java.util.Scanner;

public class c05_ForLoop {
    public static void main(String[] args) {



        // Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse,
        // uyari yazdirip islemi sonlandirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Pozitif olan bir baslangic degeri girin:");
        int baslangicDegeri = scanner.nextInt();
        System.out.println("Pozitif olan bir bitis degeri girin:");
        int bitisDegeri = scanner.nextInt();

        int toplam = 0;

        if( bitisDegeri < baslangicDegeri) System.out.println("UYARI!!");

        else {
            for (int i = baslangicDegeri; i <= bitisDegeri ; i++) {
                toplam += i;

            }
            System.out.println("Toplam değer:" + toplam);
        }





















    }
}
