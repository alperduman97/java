package day43_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C05_IstenenOgrencininSoyisminiUpdateEtme {
    public static void main(String[] args) {


        Map<Integer,String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");
        ogrenciMap.put(108,"Azim-Kan-12-L-SOZ");
        ogrenciMap.put(109,"Huseyin-Fan-12-H-MF");
        ogrenciMap.put(110,"Azim-Kayisi-11-K-TM");

        //110 numarali öğrencinin soyismini "mismis" yapın

        ogrenciMap.put(103, "Ali-Han-12-M-MF");
        System.out.println(ogrenciMap.get(103)); // Ali-Han-12-M-MF
        //eğer bir mapte varolan key ile yeni bir element eklerseniz o key'e ait eski value'yi sileri yeni value'yi kabul ederdik.


        //soruyu manuel olarak yapacak olsaydik
        //ogrenciMap.put(110, "Azim-Mismis-11-K-TM"); yapardık


        /*

          update işlemlerini yapabilmek için önce değiştirmek istediğimiz bilgiye ulaşmaliyiz, bunu önceki sorularda yaptiğimiz gibi
          önce value'ye ulaşip, value'yi split edip istediğimiz bilgiye ulaşabiliriz.


         */

        //1- istenen öğrencinin value'sine ulaşın ve kaydedin

        String value110 = ogrenciMap.get(110); // [Azim-Kayisi-11-K-TM]

        //2- value110'da istediğimiz bilgiye ulaşabilmek için split yapip kaydedin

        String[] value110Arr = value110.split("-"); // [Azim, Kayisi , 11, K , TM]

        //3- şimdi istenen değişikliliği array'de yapın

        value110Arr[1] = "Mismis"; // [Azim, Mismis , 11, K , TM]

        //istenen değişikliliği array'de yaptiktan sonra, map'i güncelleyebilmek için
        //array'i yeniden String value formuna dönüştürmeliyiz
        //Azim-Mismis-11-K-TM

        //4- değişen array'i yeniden value formatina getir

        String yeniValue = value110Arr[0] + "-" + value110Arr[1]+"-"+value110Arr[2]+"-"+value110Arr[3]+"-"+value110Arr[4];
        System.out.println(yeniValue); //Azim-Mismis-11-K-TM


        //5-Mapi güncelle

        ogrenciMap.put(110,yeniValue);
        System.out.println(ogrenciMap); // 110=Azim-Mismis-11-K-TM}




    }
}
