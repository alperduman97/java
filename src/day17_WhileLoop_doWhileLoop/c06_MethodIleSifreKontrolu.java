package day17_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class c06_MethodIleSifreKontrolu {
    public static void main(String[] args) {

        // Kullanicidan sifre isteyin
        // sifreyi bir method'da kontrol edin
        // method'da asagidaki sartlari saglamayan sifrelerde hatalari yazdirip,
        // method'dan sifrenin durumunu true veya false olarak dondurun
        // main method'da kullanici
        // gecerli bir sifre yazincaya kadar bu islemi tekrar edin
        // gecerli sifre yazilinca “sifreniz basari ile kaydedildi” yazdirin
        // sartlar :
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali


        Scanner scanner = new Scanner(System.in);
        String sifre="";


        while (true){
            System.out.println("Lütfen sifrenizi giriniz:");
            sifre=scanner.nextLine();

            boolean sonuc= sifreKontrol(sifre); //--> kaydettik, kaydetmesek hep dönecek bize bir yararı olmayacaktı

            if(sonuc){
                System.out.println("Şifreniz başarılı bir şekilde kayededildi");
                break;
            }


        }


    }

    public static boolean sifreKontrol(String sifre){                        //boolean olma sebebi bize true ya da false döndüreceği için

        int flag = 0;
        flag = 0;


        // - ilk harf kucuk harf olmali
        char ilkHarf = sifre.charAt(0);

        if ( !(ilkHarf>='a' && ilkHarf<='z')){
            System.out.println("ilk harf kucuk harf olmali");
            flag++;
        }


        // - son karakter rakam olmali

        char sonKarakter = sifre.charAt(sifre.length()-1);

        if (!(sonKarakter>='0' && sonKarakter<='9')){
            System.out.println("son karakter rakam olmali");
            flag++;
        }


        // - sifre bosluk icermemeli

        if (sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
            flag++;
        }

        // - uzunlugu en az 10 karakter olmali

        if (sifre.length()<10){
            System.out.println("uzunlugu en az 10 karakter olmali");
            flag++;
        }

        if (flag == 0){
            return true;
        }else{
            return false;
        }

    }



}
