package day05_concatenation_operatorler;

public class c02_KarsilastirmaOperatorleri {

    public static void main(String[] args) {

        int a = 20;
        int b = 25;

        b = a;   //a'nın değeribi b'ye atar.

        a= 2 * a + 5; //önce çarpma 2*20=40 + 5 = 45 yazdırır. // Önce eşitliğin sağı sonra işlem önceliği.

        System.out.println(a == b); // "==" olursa --> a b'ye eşit mi diye soruyor. false yazdırır.

        System.out.println(b= b + 3); // tek eşittir var yani atama. b ile 3 ü toplar sonra b'ye atar. ve 23 yazdırır.

        System.out.println(b+27 == a+5); // true yazdırır. İki tarafta birbirine eşittir.

        System.out.println(a != b); // != --> a ile b eşit değil midir? diye soruyor.. /true yazdırır.

        System.out.println(!false); //true  "!" işareti her şeyi tersine çevirir sora. false değil midir?, true yazdırır.

        System.out.println(4 > 7); //false

        System.out.println(5 > 3 == 6 > 7); // false yazdırır

        System.out.println( ! (4 > 5)); // 4 5'ten büyük değil midir? diye sorar. //4 5'ten büyük değildir doğru ama
        // tersi (!) olduğu için //true yazdırır.




    }
}
