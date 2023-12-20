package day09_switchStatements;

import java.util.Scanner;

public class c04_ikiBasamakliSayiYazdirma {

    public static void main(String[] args) {

        // Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin.
        // örn: 34 ->>otuzdört,, birler basamagi ayri , 10lar basamagi ayri yazilmali



        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 2 Basamakli bir sayi giriniz:");
        int girilenSayi = scanner.nextInt();

        int birlerBasamagi = girilenSayi % 10; //örn: 34 % 10 = kalan 4, birler basamagini verir ya da
        // 56 % 10 = kalanı verir yani birler basamagi olan 6'yı
        int onlarBasamagi =  girilenSayi / 10; // örnek 34/10 = kaç kere var? 3 kere. Onlar basamagını verdi.
        // ya da 56 / 10 = 5 yani onlar basamagini verdi.

        switch (onlarBasamagi) { //otuz dört yazarken önce onlar basamagini yazdırdığımız için onlardan başladık!
            case 1:
                System.out.print("on"); //ln'i sildik çünkü alt satıra geçmeyip yan yana yazsın istedik.
                break;
            case 2:
                System.out.print("yirmi");
                break;
            case 3:
                System.out.print("otuz");
                break;
            case 4:
                System.out.print("kırk");
                break;
            case 5:
                System.out.print("elli");
                break;
            case 6:
                System.out.print("altmış");
                break;
            case 7:
                System.out.print("yetmiş");
                break;
            case 8:
                System.out.print("seksen");
                break;
            case 9:
                System.out.print("doksan");
                break;

        }

            switch (birlerBasamagi){

                case 0:

            case 1:
            System.out.print("bir");  //ln i alta geçmesin satır diye sildik.
            break;
            case 2:
                System.out.print("iki");
                break;
            case 3:
                System.out.print("üç");
                break;
            case 4:
                System.out.print("dört");
                break;
            case 5:
                System.out.print("beş");
                break;
            case 6:
                System.out.print("altı");
                break;
            case 7:
                System.out.print("yedi");
                break;
            case 8:
                System.out.print("sekiz");
                break;
               case 9:
                System.out.print("dokuz");
                break;



            }


        }















    }
