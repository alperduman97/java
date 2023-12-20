package day11_stringManipulations;

public class c01_IndexOf {

    public static void main(String[] args) {

        String str = "Java cok guzel bir proglamlama dili.";
        System.out.println(str.contains("a")); //true
        System.out.println(str.indexOf("a"));  // 1 --> a'nın bulunduğu indexi yazdırıyor
        System.out.println(str.indexOf('c')); //5 c'nin bulundugu satir yani indexi yazdırıyor
        System.out.println(str.charAt(5));    //5
        System.out.println(str.indexOf("a ")); //3  --> a ve boşluğun başladığı indexi yazıyor
        System.out.println("guzel"); // 9
        System.out.println(str.indexOf(" ")); //4
        System.out.println(str.indexOf(" ", 10)); //14 10'u indexten sonraki boşluk indexine bakıp onu yazdırır.

            //2.space'in indexini yazdırın


        System.out.println(str.indexOf(" ", 4 + 1)); //4'te hemen space i buldugu için +1 yapıp sonraki space'i arattik


        //ikinci i'nin index'ini yazdirin

        System.out.println(str.indexOf("i")); //16 // 16'yi bildiğimiz için yazdik ama bu dinamik olmadi

        System.out.println(str.indexOf("i", str.indexOf("i"))); //dinamik olarak ikinci i'nin indexini arayacak
        System.out.println(str.indexOf("i", str.indexOf("i") + 1)); //ilk i'den sonrası için aratıyoruz "32" YAZDIRIR.


        //ikinci a'nın indexini bulun


        System.out.println(str.indexOf("a", str.indexOf("a") + 1)); //3 --> ilk indexinden itibaren ayi arar.


        //olmayan bir harfin indexin istersek ne olur?
        System.out.println(str.indexOf("x"));  //-1 olarak döner hep. Olmayan bir harf, kelime vs... olunca hep -1 döner

        // ikinci c olup olmadigini yazdirin


        int ilkCIndex = str.indexOf("c");
        
        if(ilkCIndex == -1){
            System.out.println("Metinde c yok");
        } else if (str.indexOf("c" , ilkCIndex+1) == -1) {
            System.out.println("İkinci c yok");
        }else{
            System.out.println("İkinci c var");
        }


    }
}
