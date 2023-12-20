package day37_AbstrachtClasses;

public class C00_Kurallar {
     /*

    Kural 1-
    Bir abstracht class'i parent edinen abstracht olmayan(concrete) bir child class parent class'da
    abstracht olarak oluşturulan tüm method'lari kendine implement etmek zorundadır


    Kural 2-
    Bir abstract class, abstract ve/veya concret method'lar barındırabilir
    Bir concret class ise abstract method barındaramaz.


    Kural 3-
    Abstract bir class'i parent edinen
    abstract bir class, kendisi de abstract olduğundan
    parent class'daki abstract method'lari implement etmek zorunda değildir.

    Abstract parent - abstract child arasindaki ilişki,
    concrete parent - child


    Kural 4-
    Abstract bir silsileden sonra gelen ilk Concrete class
    Parent abstract class(lar)daki
    concrete'leştirilmemiş tüm abstract method'lari implement etmek zorundadır


    Kural 5-
    Abstract class'lar class olduklari için
    constructor'a sahiptirler
    Amma abstracht class'lardan obje oluşturulamaz

    Çünkü abstract class'dan obje oluşturursaniz o class'daki method'lari

     */
}
