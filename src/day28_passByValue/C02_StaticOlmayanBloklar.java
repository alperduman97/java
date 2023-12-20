package day28_passByValue;

public class C02_StaticOlmayanBloklar {

    C02_StaticOlmayanBloklar(){
        System.out.println("Constructor calıstı");
    }


    public static void main(String[] args) {
        System.out.println("Main method calisti");
        C02_StaticOlmayanBloklar obj1 = new C02_StaticOlmayanBloklar();

    }


    {      //static olmayan blok

        //statik olmayan bloklar obje olusturulacagi zaman
        //constructor'dan hemen once calisir

        //bir obje olusturulmadan once
        //yapilmasi gereken on ayar varsa kullanilir

        System.out.println("Statik olmayan blok çalıştı");

    }
}
