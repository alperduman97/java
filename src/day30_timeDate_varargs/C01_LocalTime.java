package day30_timeDate_varargs;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.TemporalUnit;

public class C01_LocalTime {

    public static void main(String[] args) {

        LocalTime saat = LocalTime.now(); //şuanki saati bulunduğumuz bir zaman dilimine göre veriyor

        LocalTime saatUsa = LocalTime.now(ZoneId.of("America/New_York"));
        LocalTime saatUsa1 = LocalTime.now(ZoneId.of("Asia/Istanbul"));

        System.out.println("NewYork Saati: " + saatUsa); // NewYork Saati:12:44:27
        System.out.println("Istanbul Saati: "+ saatUsa1); //Istanbul Saati: 20:46:53.802177100


        System.out.println("bir milyon saat sonra" + saat.plusHours(100000)); // 10:48:08.815789300

        System.out.println("şimdiki saatten eksiye doğru:" + saat.minusHours(3)
                                                             .minusSeconds(23)
                                                               .minusMinutes(15));    //  15:33:59.470729500


        System.out.println("şimdiki saatei dk sn olarak verme: " + saat.withMinute(27).withSecond(15)); //şimdiki saati istediğimiz dakika,sn vs ile veriyor


        System.out.println("nano cinsinden saat:" + saat.toNanoOfDay()); //67966143341100
        //gece 00:00'dan baslayacak saat'in olusturuldugu ana kadar gecen nanosaniye

        System.out.println("günün saniye cinsinden değer: " + saat.toSecondOfDay()); //68040

        LocalTime saat1=LocalTime.of(10,45);
        LocalTime saat2=LocalTime.of(14,12,23);
        System.out.println(saat1.isBefore(saat2)); //true
        System.out.println(saat1.isAfter(saat2)); // false




    }














}
