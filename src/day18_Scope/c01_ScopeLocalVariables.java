package day18_Scope;

public class c01_ScopeLocalVariables {
    public static void main(String[] args) {

                         // --KURAL1--//
        //bir method icerisinde olusturulan variable'lara
        // local variable denir
        // local variable'lar sadece olusturuldukları method'da kullanılabilinir
        // diğer methodlarda KULLANILAMAZ!


        String str = "Java Candir";
        // System.out.println(sayi); --> Cannot resolve symbol 'sayi'





                            // --KURAL2--//
        // Local variable'lar değer atanmadan olusturulabilir ama değer atamadan kullanılamazlar!

        int  a;
        boolean bl;    // değer atamadan böyle yazarsak kabul etmez
        char c;
        // System.out.println(a); --> Variable 'a' might not have been initialized (a'ya değer atanmamış olabilir)
        bl=true;
        c='a';

                            // -- KURAL3--//
        // Her ne kadar bir methodun içind olsada Loop'lar da ayri bir local alandır.
        // Lop içerisinde olusturulan variabl'lar loop dışında kullanılamaz.

        for (int i = 0; i <10 ; i++) {
            System.out.println(i); //0123456789
            String s = "Java";
        }
       // System.out.println(i);  --> Canot resolve symbol 's'
       // System.out.println(s);   --> Cannot resolve symbol 's'

    }


        public static void method1(){

            // System.out.println(str); --> Cannot resolve symbol 'str'
            int sayi = 10;


        }


}

