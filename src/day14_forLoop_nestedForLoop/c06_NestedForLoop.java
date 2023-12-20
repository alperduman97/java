package day14_forLoop_nestedForLoop;

public class c06_NestedForLoop {
    public static void main(String[] args) {



        // loop ile 1 2 3 4 yazdirin


        for (int i = 1; i <=4 ; i++) {
            System.out.print(i+ " " );
        }
        System.out.println(" ");


        // loop ile 2,4,6,8 yazdirin

        for (int i = 1; i <=4 ; i++) {
            System.out.print(i*2+ " " );
        }

        System.out.println(" ");

        // 3 6 9 12 yazdirin

        for (int i = 1; i <=4 ; i++) {
            System.out.print(i*3+ " " );
        }
        System.out.println(" ");
        System.out.println("========================== ");
        /* for loop kullanarak
        1 2 3 4
        2 4 6 8
        3 6 9 12
           yazdırın

        /*  Eğer yazdirmamiz istenen şekil dikdörtgen biçiminde ise ice ice 2 loop oluştururuz,
        dışarıdaki Loop satırları kontrol eder ( bu soruda 3 satır var)
        içerideki Loop ise har satırdaki sütunları kontrol eder. (bu soruda her satirda 4 sütun var)
         */

        for (int i = 1; i <=3 ; i++) { //satırları kontrol edecek


            for (int j = 1; j <=4 ; j++) { //satırdaki sütunları kontrol edecek

                System.out.print(i*j + " ");
            }

            System.out.println("");

        }
















    }
}
