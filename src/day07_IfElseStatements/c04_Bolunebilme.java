package day07_IfElseStatements;

import java.util.Scanner;

public class c04_Bolunebilme {

    public static void main(String[] args) {


        // kullanicidan pozitif bir tam sayi alın
        // 3 ile tam bölünebiliniyorsa 3'ün kati
        //5 ile bölünebiliyorsa 5'in kati
        // hem 3 hem de 5 ile bolunebiliyorsa super sayi yazdırın.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayi giriniz:");
        int sayi = scanner.nextInt();

        if (sayi % 3 == 0 && sayi % 5 == 0){
            System.out.println("Sayi süper sayidir.");
        }

        else if (sayi % 3 == 0) {
            System.out.println("SAyi 3'ün katidir.");


        } else if (sayi % 5 == 0)
        {
            System.out.println("Sayi 5'in katidir");

     /*  ---->>> }else if( sayi % 3 == 0 && sayi % 5 == 0){    //bu satir burada olursa ilk baştaki satiri işleme alırsa
            // bu satıra gelmez ve 15 ya da 30 girdiğimiz de "süper sayi" yazdırmaz. En seçici olanı en başa yazmalıyız.
            System.out.println("Sayi Süper Sayidir."); */
        }
    }
}
