package day38_interfaces;

public interface I01_Interface {


/*

Interface'ler class değildir

Kural 1: Interface'ler full abstraction sağlar

Kural 2: bir interface içinde oluşturulan methodlar için public veya abstract keyword'lerini yazmak redundant'dir.
yani yazsak da yazmasak da bu özellikleri taşıyacağından yazmak gereksiz olur.

Kural 3: bir interfaace içinde oluşturulan variable'lar için public, static vey afinal keyword'lerini yazmak redundant'dir

Kural 4: bir class birden fazla class'i inherit edemez ama birden fazla interface'i implement edebilir. Hatta bir class
bir class'a extends edip, bunun yanında birden fazla interface'e de implement edebilir.

Kural 5: class ==> class , inherit için; extend
         class ==> interface , inherit için; implement
         interface ==> interface, inherit için extends
         interface ==> class'a inherit OLAMAZ!

Kural 6: Bir class birden fazla interface'i inherit ettiğinde
           -parent interface'ler de ayni ismde variable varsa
           *seçim yapmamizi ister, interfaceIsmi.VariableIsmi şeklinde kullandirir.

           -parent interface'lerde ayni ismde METHOD varsa
           *eğer return type'lari ayni ise hangisinden aldigi önemli olmaz
           o method'u override ederiz.

           -eğer return type'lari farkli ise;
           *overidding method hangi return type'i secse diğer interface itiraz eder
           bu drumda 2 interface'den birine implement edebilir, otekini birakiriz.


 */



    public abstract void method1();


    //Modifier 'abstract' is redundant for interface methods
    //Modifier 'public' is redundant for interface members


    public void method2();
    abstract void method3();

    void method4();
    public static final int SAYI =20;

    //Modifier 'static' is redundant for interface methods
    //Modifier 'public' is redundant for interface members
    //Modifier 'final' is redundant for interface methods

    public String STR ="Java";
    char ILK_HARF= 'H';
    final boolean GUZEL_MI=true;


}
