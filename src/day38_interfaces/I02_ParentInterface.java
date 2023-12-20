package day38_interfaces;

public interface I02_ParentInterface {

    void method1();
    void method2();

    public abstract String method3();

public default void methdo20(){

}
}


/* Java8 ile birlikte, developer'lardan gelen talepler doğrultusunda
Java Interface'ler için bir istisna oluşturmuş


Talep: Interface'e sonradan method eklememiz gerekirse
önceden bu interface'i inherit eden
tüm class'lar kizariyor
sonradan eklediğimiz bu method'u MECBURİ OLMAKTAN kurtar.


Interface'lerde sonradan eklenen method'lari IMPLEMETN etmenin mecbur olmamasi için
bu methodlarin body'si OLMALIDIR.
Interfac'de body'si olan method oluşturabilmemiz için
Java bildiğimiz 2 keyword'u ozel kullanim için yetkilendirmiş.
Bu iki kelime:
-default
-static




 */