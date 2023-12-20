package day16_methodOlusturma_methodOverloading;

public class c02_returnTypelleMethodOlusturma {
    public static void main(String[] args) {


        //verilen isim ve soyismini
        // istenen formata cevirip bize döndüren bir method olusturun --> donduren dedi mi return yapıyoruz.. "return yazıyoruz asagiya"
        // ornek ouput : A***** B********


       ismiIstenenFormataCevir("Alper", "Duman");
    }


          public static String ismiIstenenFormataCevir(String isim, String soyisim)
          {

                String donusmusIsim = "isim : " + isim.substring(0,1).toUpperCase() +
                                        isim.substring(1).replaceAll("\\w" , "*") +
                                            " "+
                                        "soyisim : " + isim.substring(0,1).toUpperCase() +
                                        isim.substring(1).replaceAll("\\w" , "*");

                return donusmusIsim;


          }



}



