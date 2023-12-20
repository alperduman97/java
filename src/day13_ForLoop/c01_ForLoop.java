package day13_ForLoop;

public class c01_ForLoop {
    public static void main(String[] args) {


        /*
                Başlangıç ve bitiş değerleri bilinen veya tekrar sayisi belli olan işlemleri yapmak için
                ForLoop kullanilir

         */


        // ---> for (int i =                        0; i <10 ;                                        i++) {
             //baslangic degeri          // loop bitirme şartı                                // i'nin artiş biçimi
                                      // loop bitirme şartı true oldugu müddetçe
                                        // loop çalışmaya devam edecek



        //10'dan başlayarcak, 30'dan kücük olan sayilari yazdirin

        for (int i = 10; i < 30; i++) {
            System.out.print(i + " ");

        }
        System.out.println(""); //amaç alt satıra geçirmek


            // 2 basamakli tek sayilari yan yana yazdirin

        //bu soruyu 2 türlü düşenebiliriz;


        // 1.yöntem
        //eğer biliyorsaniz ilk ve son yazdirilacak sayilari belirler,
        // tek sayilar dediği için 2'şer 2'şer arttırırz.

        for (int i = 11; i <=99 ; i +=2) {
            System.out.print(i + " ");

        }

        //2.yöntem olarak;
        //başlangıc ve bitiş sayılarını bilmeyebiliriz
        //2 basamakli dediği için 2 basamakli tüm sayilari
        // elden geçiririz
        System.out.println(" ");

        for (int i = 10; i <100; i++) {

            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }

                    // 752 ve 1326 dahil olmak üzere 19'ile bölünebilen sayilari yazdirin


        for (int i = 752; i <= 1326; i++) {


            if (i % 19 ==0 ){
                System.out.print(i + " ");
            }

        }
            
            
            
            
        }



















    }


