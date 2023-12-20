package day39_exceptions;

import java.util.Scanner;

public class C05_CatchBlogundaki_e {
    public static void main(String[] args) {


        //kullanicidan bir cümle ve bir sayi isteyin
        //kullanicinin verdiği sayiyi index olarak kabul edip
        //cümlede o index'deki karakteri yazdirin


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir cümle giriniz: ");

        String cumle = scanner.nextLine();

        System.out.println("Lütfen bir tam sayi giriniz: ");
        int index = scanner.nextInt();

        try{
            System.out.println(cumle.charAt(index));

        }catch (StringIndexOutOfBoundsException e){
            //System.out.println(e);//java.lang.StringIndexOutOfBoundsException: String index out of range: 10
            //System.out.println(e.getCause()); //null
            //System.out.println(e.getMessage()); //String index out of range: 10
            e.printStackTrace(); // exception oluştuğunda yazdirilan tüm satırları yazdırır ama exeception kontrol altına alondıgı ıcın
                                // kod NORMAL olarak biter
            System.out.println("Girilen index cumlenin sınırları dışında");
        }





    }
}
