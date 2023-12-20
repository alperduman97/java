package day08_nestedIfElseStatements;

import java.util.Scanner;

public class c02_NestedIfElseIndirimliUrun {

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
        char kartVarMi = scan.next().toUpperCase().charAt(0);

        int indirimOrani = 0;


        /*
        if else ile soru çözerken değişken sayısı birden fazla ise iç içe   if-else cümleleri kullanabiliriz.
        Once degiskenlerden birini asıl değişken seçip yapıyı ona göre kuralım.

            bu class'ta musterı kartı asil degisken olsun.
            Kart bilgisine göre 3 ihtimali yazdıktan sonra her ihtimalin içine bu defa ürün miktarına göre if/else
            yazalim
         */

        if(kartVarMi == 'E'){

            //buraya gelen müşterinin kartı var

            if(urunAdedi > 10){

                indirimOrani=20;

            } else if (urunAdedi > 0) {
                indirimOrani = 15;
            } else {
                System.out.println("ürün miktarı hatalı "); //burayada ürün adedi sıfırdan kücükler kaldı
            }

        } else if (kartVarMi == 'H') {

            //buraya gelen müşterinin kartı yok

            if(urunAdedi > 10){
                indirimOrani=15;

            } else if (urunAdedi > 0) {
                indirimOrani = 10;
            } else {
                System.out.println("ürün miktarı hatalı"); //burayada ürün adedi sıfırdan kücükler kaldı
            }
            } else {
                System.out.println("Kart bilgisi hatali");
            }

                if(indirimOrani > 0){
                    System.out.println(indirimOrani + "indirimli toplam fiyat:" +
                                                        urunFiyat * urunAdedi * (100-indirimOrani) / 100  );
                }
        }




    }

