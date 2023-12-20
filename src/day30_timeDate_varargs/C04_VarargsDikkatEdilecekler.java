package day30_timeDate_varargs;

public class C04_VarargsDikkatEdilecekler {

    //argüment olarak verilen syilardan
    // ilki haric geriye kalanlari toplayip
    //bulunan toplami ilk sayi ile carpip
    //sonucu yazdiran bir method olusturun


    //örn: input=0,2,3,4,1   , output: 0*10 = 0
    //örn: input=1,2,3       , output: 1*5  = 5;



    public static void main(String[] args) {

        islemYap(0,2,3,4,1); //0
        islemYap(1,2,3); //5
        islemYap(2,3,4,5,6,7,8,9); //84
        islemYap(5); // kalanlar olmadığından toplam'ı = 0 a eşitlediğimiz için, 0*5'ten = 0(sıfır) olur.
        // islemYap(); //ilk sayıya değer atamazsak hata verir, CTE(Compile time error)!


    }


public static void islemYap(int ilkSayi, int... geriyeKalanlar){

    int toplam= 0;

    for (int each:geriyeKalanlar
         ) {
        toplam += each;
    }

    System.out.println(toplam*ilkSayi);
}

}
