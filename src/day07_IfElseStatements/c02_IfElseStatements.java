package day07_IfElseStatements;

import java.util.Scanner;

public class c02_IfElseStatements {

    public static void main(String[] args) {


        // 5- Kullanicidan bir harf isteyin,
       // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen karakteri girildigi gibi yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz:");
        char harf = scan.next().charAt(0);


        // 1.yöntem
        if(Character.isLowerCase(harf)){
            System.out.println(Character.toUpperCase(harf));

        }else{
            System.out.println(harf);
        }


          //2.yöntem

        if (harf >= 'a' && harf <= 'z'){
            System.out.println( (char)harf-32);  //char olarak yazdırmak ıcın böyyle yaptık
            // -32 ise; mesela büyük A=65'tir küçük a=97 , küçük d=100 büyük D=68'dir. Yani küçükle büyük harfler
            // arasında hep 32 fark var. Bu yüzden 32 yazdık. Girilen harften 32'yi çıkarıyor, ona göre işleme alıyor.
            // Mesela küçük a yazarsak 97-32 yapacak= 65 olacak onu da char'a dönüştürüp yazdırıyoruz.
            //  Böylece 65'in karşılığı olan büyük A'yı yazdırıyor.

        }else{
            System.out.println(harf);
        }



    }
}
