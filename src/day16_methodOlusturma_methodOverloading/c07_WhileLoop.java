package day16_methodOlusturma_methodOverloading;

public class c07_WhileLoop {
    public static void main(String[] args) {


        //1'den 20'ye kadar (sinirlar dahil) olan tam sayilari toplayin
            int toplam=0;
        for (int i = 0; i <=20 ; i++) {
            toplam += i;

        }
        System.out.println("Toplam:" + toplam);

        //While Loop olustururken;
        // baslangic degeri, bitis sarti ve artis sekli otomatik oluturulmaz
        // bunlari bizim manuel olarak yapmamiz gerekir
        // Eger for loop ile yapılabilen bir soru varsa for loop tercih ederiz

            toplam=0;
            int baslangic = 1;
        while (baslangic <= 20) {

            toplam += baslangic;
            baslangic++;


        }
        System.out.println(toplam);

        // eger tekrar sayisi belli degilse for loop yerine while loop kullanmayi tercih etmeyiliyiz
        // örn: sifre icin kullanicidan giris isteyin ;
        //3 kereden fazla olursa hata verin dersek "For Loop"
        // şifreyi doğru girene kadar tekrar etsin dersek "While Loop"

    }



}
