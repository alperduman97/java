package day18_Scope;

public class C03_Scope_ClassVariableKullanim {

    /*
                --KURAL4--
     Static variable'lar her yere gidebilirler static olmayanlar variable(instance variable)'lar ise
     static olanlara giremezler

                --KURAL5--

      Class level variable'lar deger atamadan olusturabildigi gibi deger atanmadan kullanabilirler
      biz deger atamazasak, Java default deger olarak;
      -non-primitive'lere ==> null
      -sayisal primitive'lere ==> 0
       -boolean variable'lara ==> false
       -char variable'lara ==> hiclik degeri atar

     */

    static String s;
    static int a;
    boolean bl;
    char chr;


    public static void main(String[] args) {

        System.out.println(s); //nul
        System.out.println(a); // 0

        //Eğer static olmayan class üyelerine static olandan ulasmak istersek
        //once class'dan bir obje oluşturulmali
        // sonra o obje üzerinden static olmayan üyeler kullanilmalidir

        C03_Scope_ClassVariableKullanim obj= new C03_Scope_ClassVariableKullanim();
        System.out.println(obj.bl); //false
        System.out.println(obj.chr); // HİÇLİK

    }


    public static void method1(){


    }

    public void method2(){




    }


}
