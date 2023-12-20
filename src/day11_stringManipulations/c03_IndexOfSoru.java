package day11_stringManipulations;

import java.util.Scanner;

public class c03_IndexOfSoru {
    public static void main(String[] args) {


        //kullanicidan bir cümle ve cümle'de aranacak metin isteyin
        //cumle ve metni karsilastirip
        //asagidaki 3  durumdan birini yazdirin;
        //1-verilen metin cumlede kullanilmamis
        //2-verilen metin cumlede sadece bir kere kullanilmis
        //3-verilen metin cumlede birden fazla kullanilmis


        Scanner scanner =  new Scanner(System.in);
        System.out.println("Lütfen cümleyi giriinz:");
        String cumle= scanner.nextLine();
        System.out.println("Lütfen aranacak kelimeyi giriniz:");
        String kelime= scanner.nextLine();


        if(!cumle.contains(kelime)){
            System.out.println("Cümlede bu kelime kullanilmamis");
        } else if (cumle.indexOf(kelime) == cumle.lastIndexOf(kelime)) {
            System.out.println("Cümle kelimede bir kez kullanilmistir");
        } else if (! (cumle.indexOf(kelime) == cumle.lastIndexOf(kelime))) {
            System.out.println("Cümle metinde birden fazla kullanilmistir.");
        }else  {
            System.out.println("girilen kelime ile metin uyuşmamaktadır.");
        }


    }
}
