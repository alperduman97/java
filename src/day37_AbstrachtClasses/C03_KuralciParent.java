package day37_AbstrachtClasses;

public abstract class C03_KuralciParent {

    //abstrachtlara bir method olarak değil,
    //resmi gazetede yazan bir standart olarak düşünün.


    public abstract void method1();

            public abstract String method2();







    /*

    Eğer bir class'in child class'lar kural koyucu olmasini istiyorsaniz
    Java iki alternatif sunar
    1- abstracht classes
    2- interfaces


    Bir class'i abstract class yapmak için class deklarasyonuna abstract yazmaniz yeterlidir.

    Abstract class kismi abstraction sağlar
    Yani içinde child class'larin
    -MUTLAKA override etmesi gereken methodlar olacağı gibi
    (abstract method olarak oluşturmaliyiz)
    -override etmenin mecbur olmadığı, child class'in insiyatifine birakildiği method'lar da olabilir

     */
}
