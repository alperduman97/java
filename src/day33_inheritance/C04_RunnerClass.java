package day33_inheritance;

public class C04_RunnerClass {

    public static void main(String[] args) {
                C03_DizelCorolla dc1 = new C03_DizelCorolla();

                    //Araba Class'indan
        System.out.println(dc1.sanzuman);// Sanzuman belirtilmemis, Araba class'indan


                        //Toyota Class'indan
        System.out.println(dc1.marka); //Toyota  ,toyota class'indan
        System.out.println(dc1.guvenlik);// ektra güvenlik, Toyota class'indan



                     //DİzelCorolla Class'indan
        System.out.println(dc1.model); //Corolla, dizelcorolla class'indan
        System.out.println(dc1.motor);// Dizel, DizelCorolla class'indan
        System.out.println(dc1.yakit); //dizel, DizelCorolla class'indan
        System.out.println(dc1.uretimYeri);// Sakarya, DizelCorolla class'indan
        System.out.println(dc1.aku);// İnce aku, DizelCorolla class'indan
        System.out.println(dc1.teker);// pirelli 15 inç // DizelCorolla class'indan
        System.out.println(dc1.renk);//Renk belirtilmemiş, DizelCorolla class'indan
        System.out.println(dc1.fren);//Abs fren, DizelCrolla class'indan

    }
}
