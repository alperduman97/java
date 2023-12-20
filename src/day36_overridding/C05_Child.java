package day36_overridding;

import java.util.Objects;

public class C05_Child extends C04_Parent{

    public void method1(int sayi) {
        //child class'da parent class'tan bir methodu
        // override(en güncel halini yazdirma, solumum:solurlar, solunum:akciğer solunum) etmek istersek
        // signature'i parent class'daki method ile ayni olan
        // bir method oluşturmaliyiz.
        // eğer signature farkli olursa
        //ismi ayni olmasi overridding için yeterli değildir.

    }


    public void method2(){

    }

    @Override
    public void method3() {
        //bir overriding method oluşturmak için
        // @Override notasyonu kullanmak zorunlu değildir
        //ama override methodu Intellik'e oluşturtursak
        //intellij otomatik olarak notasyonu koyar
        //@override notasyonu parent class'daki
        //overrideden method'u takip eder
        //silinir veya signautre'i degiştirilirse
        // CTE verir
        //Notasyon kullanilmayan method'larda
        //parent class'daki method kontrol edilmez
        //silinmesi veya degistirilmesi durumunda
        //overridding ozelligi biter ama kod calismaya devam eder

    }

    public static void method4(){

        //static olarak işaretlenen method'lar override edilemez
        //child class'da ayni signature sahip method oluşturabilirsiniz
        //ama bu ikisi override ilişkisi oluşturmaz
        //bagimsiz iki method olurlar

        //parent class'da static olarak işaretlenen bir methodun
        //child class2Da ayni signature ile static keyword
        // kullanmadan oluşturamazsınız.

    }

    /*public final String method5(){
        //bir method'u final olarak işaretlerseniz
        //o method override EDILEMEZ.
        return null;
    }

     */

private void method6(){
    //private bir method'u override edemezsiniz
    //aynı signature'a sahio olsa bile

}

protected void method7(){
    //her ne kadar signature'a dahil olmasa da
    //overridding'de access modifier da onemlidir
    //parent class'daki method7'nin
    //access modifier'i default olduğundan
    //chil class'taki method7
    //default, protective veya public olabilir
    //ama private olamaz

}

protected void method8(){
    //parent class'daki method8'in
    //access modifier'i protected oldugundan
    //child class'daki method8
    //protected ve public olur
    //private olamaz

}

    public void method9(){
    //overridden method'un return type'i
        //void veya primitive ise
        // overridding method'un return type'i da ayni olmalıdır

    }

    public String method10(){
    //eğer overridden method'un return type'ı
        //non-primitive ise
        //overridding method'un return type'i
        //ya aynısı olacak
        //ya da parent class'in return type'ı ile
        //IS-A relationship olan bir data türü olacak
        return null;
    }


    @Override
    public void method11() {
        super.method11();
        //overridding yapildiginda
        //overridden method veya overridding method'dan
        //SADECE biri calisir


        //eğer ikisinide de calismasini isterseniz
        //super.methodIsmi yazarak
        //parenttaki methodun da çalışmasını sağlayabiliriz
    }
}

