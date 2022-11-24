package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime03 {
    public static void main(String[] args) {

        //Example 2:Japonya ile almanya arasindaki zaman farkini saat olarak hesaplayan kodu yaziniz

        LocalDateTime japan =LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime German =LocalDateTime.now(ZoneId.of("Europe/Berlin"));

        Long fark=ChronoUnit.HOURS.between(japan,German);
        System.out.println(fark);//-6

        //Example 2:Sabit bir tarih olusturunuz
        LocalDate myTime=LocalDate.of(2022,10,23);
        System.out.println(myTime);//2022-10-23

        /*
              1) Javada sabit datalari ( gun,ay ,amerikada eyalet iismleri..)depolamak icin depolar olusturlur
               bunlara "Enum" denir

         */
        //Example 3: USA icin "Woow!", UK icin "Big", "CANADA" icin "Cold", "TURKEY" icin "Vatan", "GERMANY" icin "Araba", "RWANDA" icin "Cay"


        Countries country=Countries.TURKEY;
        switch (country){
            case USA:
                System.out.println("Woow!");
                break;
            case TURKEY:
                System.out.println("Vatan");
                break;
            case GERMANY:
                System.out.println("Araba");
                break;
            case RWANDA:
                System.out.println("Cay");
                break;
                default:
                    System.out.println("Unknown country");


        }




    }
}
