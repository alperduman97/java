package day33_inheritance;

public class C07_Vectra extends C06_Opel{
   C07_Vectra(){  //DEFAULT CONSTRUCTOR
       super();

       System.out.println("Vectra constructor calisti");
   }
    

    String strChild="Vectra class Child";
    String model = "Vectra";

    public static void main(String[] args) {





        /*
        Bir class'dan obje oluşturup, o class'da var olan özellikleri edinebilmek için Mutlaka bir constructor calismalidir

        extends keyword kullanan bir class'da her constructor'ın ilk satirinda
        mutlaka bir constructor call bulunur.

        Eğer görünür bir constructor call yoksa java default olarak super() constructor call koyar
        yani default olarak önce parent'daki parametresiz constructor'ın calismasini ister
         */

        C07_Vectra vectra = new C07_Vectra();
        System.out.println(vectra.strGP);  // Car class grand parents, grandparents'tan- Car class'indan yani
        System.out.println(vectra.strP); // Opel class, parent'tan- opel class'indan ynai
        System.out.println(vectra.strChild);// Vectra class.. Chiild classtan- Vectra classtan yani
        System.out.println(vectra.marka);// opel, parent classtan- Opel class'indna yani
        System.out.println(vectra.model);// Vectra, child class'tan -Vectra class'tan yani
    }

}
