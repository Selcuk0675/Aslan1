package day04ifstatement;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
         /*
        not:char variablelari matematiksel işlemlerde kullanırsak ,java onların ASCIIdegerlerini kullanır
        not:Javada + sembolunun toplamave birleştirme işlemi olarak iki anlamı vardır
        Java + yı gorunce toplama yapar olmazsa birlestirme yapar o da olmazsa hata verır
         */
        //Example:Kullanıcıdan ilkve soyismini alalım,ilk harfleri,ni yazdıralım
        // ali Can==>ac
        Scanner input=new Scanner(System.in);
        System.out.println("ilk isminizi giriniz");
        char ilkisim=input.next().charAt(0);

        System.out.println("soyisiminizi giriniz");
        char soyisim=input.next().charAt(0);
        System.out.println(""+ilkisim+soyisim);

        //2.yol
        System.out.println("tam isminizi giriniz");
        String tamisim=input.nextLine();// ali can
        char ilkharf=tamisim.charAt(0);
        System.out.println(ilkharf);



        char soyisimilkhar=tamisim.split("")[1].charAt(0);
        System.out.println(soyisimilkhar);

    }
}
