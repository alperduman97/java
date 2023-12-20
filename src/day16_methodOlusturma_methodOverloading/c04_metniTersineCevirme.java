package day16_methodOlusturma_methodOverloading;

import java.util.Scanner;

public class c04_metniTersineCevirme {
    public static void main(String[] args) {


        //verilen bir metni tersine cevirip
        // bize donduren bir method olusturun


//"Java ile kod yaz" cümlesini Tersten yazdirin

        System.out.println(metniTerseCevir("Java ile kod yaz "));


        // kullanicidan bir kelime isteyip,
        // palindrome olup olmadigini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String str = scanner.nextLine();

        if (str.equalsIgnoreCase(metniTerseCevir(str))){
            System.out.println("Verilen metin palindrome");
        }else{
            System.out.println("Verilen metin palindrome degil");
        }


    }

    public static String metniTerseCevir(String metin){

        String tersMetin = "";

        for (int i = metin.length()-1; i >=0 ; i--) {

            tersMetin += metin.substring(i,i+1);
        }

        return tersMetin;



    }



}
