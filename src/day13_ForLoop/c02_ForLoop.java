package day13_ForLoop;

public class c02_ForLoop {
    public static void main(String[] args) {


        // 60 ve 23 dahil olmak üzere
        // 7 ile bölünebilen sayilar
        //60'tan geriye dogru yazdirin


        for (int i = 60; i >=23; i--) {

           if (i % 7 == 0){
               System.out.print(i+ " ");
           }




        }

        System.out.println("");

        // 3 basamakli pozitif tüm tam sayilari toplayip sonucu yazdirin
        int toplam = 0;

        for (int i = 100; i < 1000; i++) {

            toplam += i;

        }
        System.out.println("Sayıların toplamı:" + toplam);








            // -1000 ile +1000 arasındaki tüm tam sayilari toplayin

         int toplam1 = 0;

        for (int i = -1000 ; i <= 1000 ; i++) {

            toplam1 += i;

        }
        System.out.println("-1000 ile +1000 arasındaki tüm tam sayilarin toplami:" + toplam1);








    }
}
