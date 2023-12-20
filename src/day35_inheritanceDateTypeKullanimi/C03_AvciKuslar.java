package day35_inheritanceDateTypeKullanimi;

public class C03_AvciKuslar extends C02_Kuslar {
    String hareket="ucarlar";
    String beslenme="et yerler";
    String pence ="pencelidir";
    String gaga="sivri gagalidirlar";


    public static void main(String[] args) {

        /*
        Eğer özellikler variable(string,int vs.. yapıp değer atamak) olarak oluşturulsa
        güncel bilgiye bakılmaz,
        obje hangi data türünü kullanmişsa
        o class'daki diğer objelerle aynı özellikleri taşır


            bir objenin hangi değerleri alacağını bulmak için,
            OBJENİN DATA TÜRÜ olan class'tan aramaya başlarız,
            ve ilk bulduğumuz değeri kullanırız.

            Aradiğimiz variable'i bulamazsak CTE olur.


            Not: Eğer özellikler variable olarak oluşturulduysa constructor'in variable'larin degeri
            üzerinde hiçbir etkisi olmuyor
            tüm değerleri data type'i olan class'a göre belirleniyor

         */

        C03_AvciKuslar avciKus1 = new C03_AvciKuslar();

        System.out.println(avciKus1.hareket); // ucarlar, AVcikuslar class'indna
        System.out.println(avciKus1.solunum); //akciger, kuşlardan
        System.out.println(avciKus1.beslenme); //et, avcu kuşlardan
        System.out.println(avciKus1.cogalma);// yumurta, kuşlardan
        System.out.println(avciKus1.kanat);// kanatlidir, Kuşlardan
        System.out.println(avciKus1.gaga);// sivri gagalidir, Avcikuslardan
        System.out.println(avciKus1.pence);// pencelidir, Avcikuslardan
        System.out.println(avciKus1.omur);// yaşar ve ölür, hayvanlar class'indan


        C02_Kuslar avciKus2=new C03_AvciKuslar(); //C02'den başladığı için oradan geriye C01'e kadar gider bakar.
        System.out.println(avciKus2.omur);//yasar ve olur, hayvanlar class'indna
        System.out.println(avciKus2.hareket); // hareket ederler, hayvanlar class'indan
        System.out.println(avciKus2.solunum); //akciger, kuşlardan
        System.out.println(avciKus2.beslenme); // beslenirler, hayvanlar class'indan
        System.out.println(avciKus2.cogalma);// yumurta, kuşlardan
        System.out.println(avciKus2.kanat);// kanatlidir, Kuşlardna
        System.out.println(avciKus2.gaga);// sivri gagalidir, Avcikuslardan
        //System.out.println(avciKus2.pence);// CTE! variable olduğunda  //C02'den başlayıp geriye gider, avcikuslardan penceyi alamaz.
        //         c02 ve c01'de de pence olmadıgından hata verir


        C01_Hayvanlar avciKus3= new C03_AvciKuslar(); ///C01'den oluşturduğu için sdaece oraya bakar
        System.out.println(avciKus3.omur);//yasar ve olur, hayvanlar class'indan
        System.out.println(avciKus3.hareket); // hareket ederler, hayvanlar class'indan
        System.out.println(avciKus3.solunum); // nefes alir, hayvanlar class'indan
        System.out.println(avciKus3.beslenme); // beslenirler, hayvanlar class'indan
        System.out.println(avciKus3.cogalma);// cogalirlar, hayvanlar class'indan
        //System.out.println(avciKus3.kanat);// CTE
        //System.out.println(avciKus3.gaga);//CTE
        //System.out.println(avciKus3.pence);// CTE


        System.out.println("===================================");


        C02_Kuslar kus1=new C02_Kuslar(); //C02'den başladığı için oradan geriye C01'e kadar gider bakar.
        System.out.println(kus1.omur);//yasar ve olur, hayvanlar class'indna
        System.out.println(kus1.hareket); // hareket ederler, hayvanlar class'indan
        System.out.println(kus1.solunum); //akciger, kuşlardan
        System.out.println(kus1.beslenme); // beslenirler, hayvanlar class'indan
        System.out.println(kus1.cogalma);// yumurta, kuşlardan
        System.out.println(kus1.kanat);// kanatlidir, Kuşlardna
        System.out.println(kus1.gaga);// sivri gagalidir, Avcikuslardan
        //System.out.println(kus1.pence); //CTE




    }

}
