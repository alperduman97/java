package day12_stringManipulations;

public class c04_Trim {
    public static void main(String[] args) {



        String str=   "Ali     topa     vur.      ";


        //metindeki fazla spacleri temizleyin


        str=str.trim();
        System.out.println(str); //Ali     topa     vur. --> baştaki ve sondaki space'leri temizledik


        System.out.println(str = str.replaceAll("\\s+", " ")); //Ali topa vur. , --> \\s+ birden fazla space varsa temizliyor





    }
}
