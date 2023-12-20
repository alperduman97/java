package day24_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class c02_istenenHarfinOlduguisimleriListeleme {
    public static void main(String[] args) {


        //verilen bir String array'de
        // istenen harfi içere isimleri
        //bir liste olarak yazdırın

        String[] isimler = {"Derya","Ismail","Sedat","Tugba","Murat","Sahil","Mehmet"};
        String istenenHarf = "e";

        List<String> uygunIsimlerListesi = new ArrayList<>();

        for (int i = 0; i <isimler.length ; i++) {
            if (isimler[i].contains(istenenHarf)){

                uygunIsimlerListesi.add(isimler[i]);
            }

        }

        System.out.println(uygunIsimlerListesi);





    }
}
