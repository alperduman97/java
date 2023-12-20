package day35_inheritanceDateTypeKullanimi;

public class C08_Ozet {
    /*

    java'da data type kullanımını su sekılde de sınıflandırabiliriz:

    1-data türü ve constructor aynı ise;

    objenin özellikleri iste VARIABLE, ister METHOD olsun,
    objenin oluşturduğu class'tan aramaya başlanır,
    parentlara doğru devam edilir.
    ILK BULUNAN DEĞER kullanılır.
    DEĞER BULUNAMAZSA, CTE  OLUR!


    2-data türü ve constructor farklı ise;

    özelliğin VARIABLE veya METHOD olması farkli işleyiş gerektirir,


    Eğer VARIABLE ise,
    data türünün olduğu class'tan aramaya başlayıp, parent'lara doğru devam ederiz..........
    Ve ILK BULUNAN değer kullanırız.
    variable'ı BULAMAZSAK CTE olur.



  Eğer METHOD ise,
  data turunun oldugu class'tan başlayıp, parent'lara doğru devam ederiz

  Eğer BULAMAZSAK CTE olur.

  BULUNCA, hemen kullanmayiz,
  Constructor'in olduğu class'a kadar daha guncel hali yani Overriding Method var mı,
  diye bakılır.

  EN GÜNCEL değer kullanılır.






















     */
}
