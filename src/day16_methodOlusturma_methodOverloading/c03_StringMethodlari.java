package day16_methodOlusturma_methodOverloading;

public class c03_StringMethodlari {
    public static void main(String[] args) {

        String str = "Java cok kolay, yeter ki anlayalım";
        str.toLowerCase(); // metni kucuk harfe cevirir ama yazdirmadigimiz ya da atama yapmadığımız için boşa çalışır...


        c02_returnTypelleMethodOlusturma.ismiIstenenFormataCevir("Alper" , "Duman");

        //bize bir sey döndüren methodları ya uygun bir variable'a atamalıyız
        // ya da direkt yazdırmalıyız
        // aksi takdire metod calisir, bize sonucu döndürür (getirir)
        // ama kullanmadiginiz icin havara ucar...


        c01_voidMethodOlusturma.kisiBilgileriYazdir("Alper","Duman","12345874878");



    }
}
