package day34_inheritanceConstructorCall;

public class C05_Child extends C04_Parent {


    String str= "Java daha güzeldir";
    String t = "Java java java";
    int sayi = 15;
    int b = 25;

    public static void main(String[] args) {

    //statik gıcıklığını gidermek için

        C05_Child obj = new C05_Child();
        obj.method1();  //direkt method çalışacak,,,


    }



    public void method1(){

        String t = "Hava çok güzel";
        int a = 27;
        int b = 37;
        String str = "Her şey güzel olacak";

        // 1.adım - scoop , 2.adım - class , 3.adım parents
        System.out.println(str); // Her şey güzel olacak
        System.out.println(this.str);  // Java daha güzeldir
        System.out.println(super.str); //super oldugundan direkt parent class' gider.  Java güzeldir


        // 1.adım - scoop , 2.adım - class , 3.adım parents
        System.out.println(a); //27- scoop'tan başlar
        System.out.println(this.a);// this'i görünce class'a bakar, ama a yok, bu yüzden extends'e gider oradan alıp gelir. This önce kendi class'ina baktırır
        //o değer orada yoksa parent'a gider.
        System.out.println(super.a);// super olunca direkt parent'a gidiyoruz.



        // 1.adım - scoop , 2.adım - class , 3.adım parents
        System.out.println(b);//scoop'a bakar varsa yazdirir. 37
        System.out.println(this.b); // class'a bakar varsa yazdirir. 25
        //System.out.println(super.b); //direkt parents'a gittik, orada b olmadığından hata verir, kod çalışmaz. CTE(Compile Time Error)


        // 1.adım - scoop , 2.adım - class , 3.adım parents
        System.out.println(t); // Hava çok güzel
        System.out.println(this.t); // Java java java
       // System.out.println(super.t); // t parent'ta yok, hata verir. CTE


        System.out.println(sayi);// scoop'a baktık sayi yok, class'a bakariz. 15;
        System.out.println(this.sayi); //direkt class'tan yazdirir, 15
        System.out.println(super.sayi); // parent'a direkt gider, 20;

        System.out.println(s);// scoop'ta yok, class'ta yok, extends'le parents'a gider oradan alır. Java candir
        System.out.println(this.s); // direkt class'a gider, orada yok, extendsle parents'a gider, Java candir
        System.out.println(super.s); // direkt parents'tan, Java candir
        
    }

}
