package day41_exceptions_collections;

public class C01_Exceptions {
    public static void main(String[] args) {


        int sayi = -7;

        //eğer sayi negatifse sadece 1.satir çalışsın, sonra 5.satirdan normal çalışmaya devam etsin.
        // sayi çift ise 1. ve 2.satri çalışsın, sonra 5.satırdan normal çalışmaya devam etsin.
        //diğer durumlarda 5satır da çalışsın


        try {
            System.out.println("satir1");
            if(sayi < 0) throw new IllegalArgumentException();
            System.out.println("satir2");
            if (sayi % 2 == 0) throw new RuntimeException();
            System.out.println("satir3");

            System.out.println("satir4");
            System.out.println("satir5");
        } catch (IllegalArgumentException e) {

        }catch (RuntimeException e) {
        }

        System.out.println("buradan itibaren çalışmaya devam");
    }
}
