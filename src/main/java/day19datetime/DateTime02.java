package day19datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {

        //Example 1: Java'dan aldiginiz Date'i "ay/gun/yil" olarak yaziniz
        LocalDate currentDate=LocalDate.now();
        System.out.println(currentDate);//2022-10-23

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate1 = dtf1.format(currentDate);
        System.out.println(formattedDate1);//10/23/2022

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        String formattedDay2=dtf2.format(currentDate);
        System.out.println(formattedDay2);//Eki/23/2022

        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formattedDay3=dtf3.format(currentDate);
        System.out.println(formattedDay3);//Ekim/23/2022

        DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("M/dd/yyyy");
        String formattedDay4=dtf4.format(currentDate);
        System.out.println(formattedDay4);//10/23/2022

        //Exammple2:Javadan aldigimiz saatin formatini degistiriniz
        LocalTime myTime=LocalTime.of(6,30,54,12366);
        System.out.println(myTime);

        DateTimeFormatter dtf5=DateTimeFormatter.ofPattern("HH:mm");
        String formattedDay5=dtf5.format(myTime);
        System.out.println(formattedDay5);//06:30

        DateTimeFormatter dtf8=DateTimeFormatter.ofPattern("hh:mm a");
        String mytime2= dtf8.format(myTime);
        System.out.println(mytime2);//06:30 ÖÖ




    }
}
