package day03_ScannervedataCasting;

public class c05_DataCasting {
    public static void main(String[] args) {

            byte a = 15;
            short b = a;
            int  c = b;
            long d=c;
            double e = d;

            /* kucuk data turundeki degeri büyük data türündeki variable'a atamak isterseniz java bunu
        otomatik olarak yapar. Buna auto widening denir. */


            /* büyük data türündeki değeri küçük data türündeki variable'a atamak istersek java bunu otomatik olarak
            yapmaz. Sorumluluğu almamızı ister. Sorumluluk almak için büyük data türündeki degerin önüne
            parantez içinde çevirmek istediğimiz küçük data türünü yazarız. Buna da explicit narrowing denir.
             */




        double f = 34.5;
        int g= (int)f;
        short h= (short) g;
        byte k = (byte) h;




    }
}
