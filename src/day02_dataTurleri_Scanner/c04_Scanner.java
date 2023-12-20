package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class c04_Scanner {
    public static void main(String[] args) {

        //kullanıcıdan ismini alıp büyük harf olarak yazdıralım


        //1.adım Scanner objesi oluşturmak

        Scanner scanner = new Scanner(System.in);

        // 2.adım kullanıcıdan istediğiniz bilgiyi kullanıcıya bilgi olarak yazdırın.

        System.out.println("Lütfen isminizi giriniz:");

        // 3.adım istediğiniz bilgiye uygun bir variable oluşturun
        // sonra scanner objesi ve uygun next() objesi ile bilgiyi kullanıcıdan alıp
        // oluşturduğunuz variable'ı atayın.

        // metin olduğu için string yaptık

        String girilenIsim=scanner.nextLine();   //birdne fazla kelime girilir

        //scanner.next sadece bir kelime girmek için

        System.out.println(girilenIsim.toUpperCase()); //büyük yazdırır
        System.out.println(girilenIsim.toLowerCase()); //küçük yazdırır

    }
}
