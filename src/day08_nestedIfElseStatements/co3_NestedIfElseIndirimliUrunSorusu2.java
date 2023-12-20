package day08_nestedIfElseStatements;

import java.util.Scanner;

public class co3_NestedIfElseIndirimliUrunSorusu2 {


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

        if( urunAdedi > 10){
            //urun miktarı 10'dan cok olanlar
            if( kartVarMi == 'E'){
                indirimOrani = 20;
            }else if ( kartVarMi == 'H'){
                indirimOrani = 15;
            }else{
                System.out.println("kart bilgisi hatalı");
            }

        } else if (urunAdedi > 0){
            //urun miktari 1-10 arasında olanlar
            if(kartVarMi == 'E'){
                indirimOrani = 15;
            } else if (kartVarMi == 'H') {
                indirimOrani = 10;

            }else {
                System.out.println("kart bilgisi hatali");
            }

        }else{
            //urun miktarı 0 veya negatif olanlar
            System.out.println("urun miktarı hatali");
        }


        System.out.println(indirimOrani+ "indirimli toplam fiyat:"+ urunAdedi * urunFiyat * (100-indirimOrani) / 100);




























    }
}
