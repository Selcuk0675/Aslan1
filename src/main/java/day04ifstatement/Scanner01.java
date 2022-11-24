package day04ifstatement;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

          /*
        Kullanıcıdan ilk,ortave soy ,smini alınızve asgi,daki formatta yazınız
        Ali Mert Can
        123456789
         */

       Scanner input=new Scanner(System.in);
//        System.out.println("ilk isminizi Giriniz...");
//        String ilkisim=input.next();//next kullanıcıdan String almak için kullanılır.
//
//        System.out.println("orta isminizi giriniz");
//        String ortaisim=input.next();
//
//        System.out.println("soy isminizi giriniz");
//        String soyisim=input.next();
//
//        System.out.println("tc gir");
//        String tc=input.next();

        //2.Yol:tek Emirle butun dataları yazdır

        System.out.println("ilkisim,ortaisim,soyisim,tc  giriniz");
        String ilkisim=input.next();
        String ortaisim=input.next();
        String soyisim=input.next();
        String veli=input.next();
        System.out.println(ilkisim+" "+ortaisim+" "+soyisim+" "+veli);

        //3.yol:

//     System.out.println("ilkisim,ortaisim,soyisim,tc  giriniz");
//     String tamisim=input.nextLine();
//     System.out.println(tamisim);

    }

}
