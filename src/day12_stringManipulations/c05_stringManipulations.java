package day12_stringManipulations;

public class c05_stringManipulations {
    public static void main(String[] args) {


       // Soru 2 : Kullanicinin belirli bir formatta verdigi
        // String fiyatlari toplayip yazdirin.
        // input1 : “15.35 €” ,
        // input2 : “11.40 €
        // ”output : 26.70 €

       String fiyat1 = "15.35 €";
       String fiyat2 = "11.40 €";

        System.out.println(fiyat1 = fiyat1.replaceAll("\\D", "")); //1535
        System.out.println(fiyat2 = fiyat2.replaceAll("\\D", "")); //1140

        double fyt1= Double.parseDouble(fiyat1);
        double fyt2=Double.parseDouble(fiyat2);

        System.out.println((fyt1+fyt2) /100+ "€"); // 26,75€ --> 100'e bölmeseydik 2675 yaziyordu, 25.75 yazdirmak icin
        // 100'e böldük. 25.75 yazdi.

    }
}
