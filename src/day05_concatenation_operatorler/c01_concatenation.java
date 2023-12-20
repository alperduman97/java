package day05_concatenation_operatorler;

public class c01_concatenation {

    public static void main(String[] args) {

        System.out.println("25" + "34"); //
        System.out.println("Java" + 2 + 7); //Java2 olacak önce sonra 7'yi yanına alacak, Java27 olarak yazacak.
        //işlen önceliği yapıyor.

        System.out.println(2+7+ "Java"); // önce 0 2 ile 7'yi toplar 9 yazdırır sonra yanına Java yadırır. 9Java
        System.out.println("Java" + 2*7); // önce çarpım yapacak sonra Java ile 14'ü toplacak Java14 yazdıracak. İşlem önceliği!

        System.out.println(""+5+3);// "5" + 3 = 53 yazdırır.


    }
}
