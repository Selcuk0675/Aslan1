package day05ifstatement;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {


        //Example1:Kullaniciden gun isimlerini aliniz,o gunun hafta sonu mu hafta içi mi oldugunu kullaniciye soyleyiniz
        //         Pazartesi==>Hafta ici        Pazar==>Hafta sonu
        /*
        İki tane String'in birbirine eşit olup olmadigini anlamak icin"==" degl,"equals;()"kullanırız
        İki tane Stringin birbirine esit olup olmadigini kontrol etmek icin iki tane method kullanilabilir
          i) equals()==>Buyuk harf ve Kucuk Harfi onemser."A" ile "a" ayni degildir.
          ii)equalsIgnoreCase()==>Buyuk Harfi onemsemez A"" ile "a" aynıdır.
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Gun ismi giriniz");
        String Gunismi=input.next();
        if (Gunismi.equalsIgnoreCase("pazar")){
            System.out.println();
        } else if (Gunismi.equalsIgnoreCase("pazartesi")) {
            System.out.println("haftaici");

        }else if (Gunismi.equalsIgnoreCase("sali")) {
            System.out.println("haftaici");

        }else if (Gunismi.equalsIgnoreCase("carsamba")) {
            System.out.println("haftaici");

        }else if (Gunismi.equalsIgnoreCase("persembe")) {
            System.out.println("haftaici");

        }else if (Gunismi.equalsIgnoreCase("cuma")) {
            System.out.println("haftaici");

        }else if (Gunismi.equalsIgnoreCase("cumartesi")) {
            System.out.println("haftasonu");

        }
        else {
            System.out.println("gecerli bir gun ismi giriniz");
        }

        //2.yol

        if (Gunismi.equalsIgnoreCase("pazar")||Gunismi.equalsIgnoreCase("cumartesi")){
            System.out.println("hafta sonu");

        } else if (Gunismi.equalsIgnoreCase("pazartesi")||
                  Gunismi.equalsIgnoreCase("sali")||
                  Gunismi.equalsIgnoreCase("carsamba")||
                  Gunismi.equalsIgnoreCase("persembe")||
                  Gunismi.equalsIgnoreCase("cuma")){
            System.out.println("hafta ici");

        }
        //3.Yol:
        boolean haftaSonu=Gunismi.equalsIgnoreCase("Pazar")||Gunismi.equalsIgnoreCase("Cumartesi");

        boolean haftaici=Gunismi.equalsIgnoreCase("pazartesi")||
                Gunismi.equalsIgnoreCase("sali")||
                Gunismi.equalsIgnoreCase("carsamba")||
                Gunismi.equalsIgnoreCase("persewmbe")||
                Gunismi.equalsIgnoreCase("cuma");

        if (haftaSonu){
            System.out.println("Hafta sonu");
        } else if (haftaici) {
            System.out.println("hafta ici");

        }else {
            System.out.println("gecerli bir gun ismi giriniz");
        }


    }
}
