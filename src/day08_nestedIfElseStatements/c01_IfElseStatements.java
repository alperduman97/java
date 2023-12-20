package day08_nestedIfElseStatements;

import java.util.Scanner;

public class c01_IfElseStatements {


    public static void main(String[] args) {

        // Soru 3- Kullanicidan aldigi urun adedi ve normal fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa ve 10 urunden fazla alirsa %20, az alirsa %15 indirim yapin,
        // Musteri karti yoksa ve 10 urunden fazla alirsa %15, az alirsa %10 indirim yapin



        Scanner scan = new Scanner(System.in);
        System.out.println("Satın aldığınız ürünün adedini giriniz:");
        int urunAdedi = scan.nextInt();;

        System.out.println("Lütfen ürünün normal fiyatını giriniz:");
        double urunFiyat = scan.nextDouble();

        System.out.println("Müsteri kartınız var mı?" + " " + "E:Evet , H:Hayır");
        char soru1 = scan.next().toUpperCase().charAt(0);

        double indirim1= (urunFiyat * 20 / 100);
        double indirim2= (urunFiyat * 15 / 100);
        double indirim3= (urunFiyat * 10 / 100);

        if (soru1 == 'E' && urunAdedi > 10){
            System.out.println( (indirim1 )+ "TL'lik indirim yapıldı." +"\n"  + "Ödemeniz gereken tutar:" + (urunFiyat - indirim1));


        } else if (soru1 == 'E' && urunAdedi < 10) {
            System.out.println((indirim2)+ "TL'lik indirim yapıldı." + "\n" + "Ödemeniz gereken tutar:" + (urunFiyat - indirim2));

        }else if (soru1 == 'H' && urunAdedi > 10){
            System.out.println((indirim2)+ "TL'lik indirim yapıldı." + "\n" + "Ödemeniz gereken tutar:" + (urunFiyat - indirim2));
        } else if (soru1 == 'H' && urunAdedi < 10) {
            System.out.println((indirim3) + "TL'lik indirim yapıldı." + "\n" + "ödemeniz gereken tutar:" + (urunFiyat-indirim3));

        }else{
            System.out.println("Hatalı giriş yaptınız!");
        }


    }



}
