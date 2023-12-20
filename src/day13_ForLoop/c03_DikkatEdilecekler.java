package day13_ForLoop;

public class c03_DikkatEdilecekler {
    public static void main(String[] args) {

        // eğer loop i'nin ilk degeri icin bile bitis sarti true olmazsa;
        // loop body'si  hic devreye girmez
        // loop çalışır ama hiçbir işlem yapmaz

        for (int i = 10; i > 20 ; i++) {
            System.out.println("Bu loop body'si hiç çalışmaz"); // consola bir şey yazdırma bu yüzden
        }



        //Eger i'nin bütün degerleri icin bitis sarti true oluyorsa

        for (int i = 10; i >0  ; i++) {
            System.out.print(i + ""); //sonsuza kadar çalışır ve bu duruma teknik olarka sonsuz LOOP denir
        }

















    }
}
