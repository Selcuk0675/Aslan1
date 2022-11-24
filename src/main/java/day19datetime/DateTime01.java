package day19datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {

        //Example 1:Anlik tarihi(current Date) ekrana yazdiran kodu yaziniz
        LocalDate currenDate=LocalDate.now();// bulundugun mekandaki anlik tarihi ver
        System.out.println(currenDate);//2022-10-22 local bilgisayardki tarih

        //Example 2:Anlik zamani (Current Time) ekrana yazdiran kodu yaziniz

        LocalTime currentTime=LocalTime.now();
        System.out.println(currentTime);//19:35:20.514869800

        //Example 3:Anlik tarihi(current Date) ve Anlik zamani (Current Time) ana yazdiran kodu yaziniz

        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);//2022-10-22T19:36:56.776142700

        //Example 4:Japonyadaki anlik tarihi ve zamani ekrana yazdiran kodu yaziniz

        LocalDateTime dtjapan=LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dtjapan+"   *");

        LocalDateTime dtturkey=LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(dtturkey+" *");

        //Example 6: bugunden 789 gun sonra emekli olacaginaza gore ,emeklilik tarihini hesaplayan kodu yaziniz

        LocalDate dretire=LocalDate.now().plusDays(789);
        System.out.println(dretire);


        //Example 7: iki cocugunuzun dogum tarihleri arasindaki farki hesaplayan kodu yaziniz hesaplayan kodu yaziniz

        LocalDate dobAli= LocalDate.of(2005,5,17);
        LocalDate dobVeli= LocalDate.of(2013,2,8);

        long diff =ChronoUnit.DAYS.between(dobAli,dobVeli);//Between metodu kullanildiginda daha eski tarih once yazilmalidir
        System.out.println(diff);//2824

        //Example 8: Istanbulun Fethi ile cumhuriyetin kurulmasi arasında kac ay oldugunu gosteren kodu yazınız
        //           29mayis 1453==>Istanbulun Fethi           29 Ekim1923==>Cumhuriyetin kurulusu

        LocalDate fethiIstanbul= LocalDate.of(1453, 5,29);
        LocalDate kurulusCum=LocalDate.of(1923,10,29);
       Long fark= ChronoUnit.MONTHS.between(fethiIstanbul, kurulusCum);
        System.out.println(fark);//5645

        //Example 9:Verilen tarihin hangi burcta oldugunu gosteren kodu yaziniz


    }
}
