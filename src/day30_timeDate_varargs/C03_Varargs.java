package day30_timeDate_varargs;

public class C03_Varargs {
    public static void main(String[] args) {


        /*
        Varargs : variety of arguments demektir.
        varargs değişken sayıda argüment kullanmamiza imkan tanıyan
        array altyapisini kullanan bir java objesidir.

        siz argument olarak (4,5) yollarsaniz int[] sayi = {4,5} olur
                            (4,2,7)           int[] sayi = {4,2,7}
                            (4,5,6,7,8,9)     int[] sayi = {4,5,6,7,8,9}


         */


        //verilen sayinin toplamini yazdiran bir method olusturun

        topla(4,5); //9
        topla(4,2,7); //13
        topla(1,2,3,4); //10
        topla(1,2,3,4,5,6,8); //29
        topla(4,5,6,7,8,9); //39



    }

    public static void topla(int... sayi){
        /* burada sayi bir tek sayı degil,
        kaçtane argüment yollarsak hepsini alabilecek bir array'dir.
         */


        int toplam=0;

        for (int each:sayi
             ) {
            toplam += each;
        }
        System.out.println(toplam);  //


    }


}
