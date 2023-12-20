package day13_ForLoop;

import java.util.Scanner;

public class c06_ForLoop {
    public static void main(String[] args) {


        // Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucuk olsa da program calissin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pozitif olan bir baslangic degeri girin:");
        int baslangicDegeri = scanner.nextInt();
        System.out.println("Pozitif olan bir bitis degeri girin:");
        int bitisDegeri = scanner.nextInt();

        int toplam = 0;


        if(baslangicDegeri < bitisDegeri){

            for (int i = baslangicDegeri; i <= bitisDegeri ; i++) {
                toplam += i;
            }
        }else { //bitis < baslangic

            for (int i = bitisDegeri; i <=baslangicDegeri ; i++) {
                toplam+=i;
            }






        }


























    }
}
