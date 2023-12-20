package day08_nestedIfElseStatements;

public class co5_Ternary {
    public static void main(String[] args) {


        //input olarak verilen bir tam sayi icin
        // pozitif veya pozitif degil yazdirin

        int input = 50;

        if (input > 0) {
            System.out.println("Sayı pozitif");
        }else {
            System.out.println("sayı negatif");
        }

        // tek satırda daha kolay yazabiliriz. Ama basit kodlamada;

        System.out.println( input > 0 ? "sayi pozitiftir" : "sayı negatiftir"); //satırın türkeçsi:
        // input değeri 15'den büyük mü? (büyükse pozitif yazdıracak). Değilse (negatiftir) yazdıracak.






        //input olarak verilan sayi
        // cift sayi ise 2 katina ciksin
        // degilse  sayi  5 ile arttirilsin

        if(input % 2 == 0) {
            input *= 2;
        }else {
            input += 5;
        }

        input = input % 2 == 0 ? input * 2 : input+5;



        System.out.println(input);



















    }
}
