package day05ifstatement;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {


        //Example 1:Kullanıcıdan alınan sayinin tek mi cift mi oldugunu ekrana yazann kodu yazınız

        Scanner input=new Scanner(System.in);
       System.out.println("Please enmter a number");
        int sayi1=input.nextInt();
//        if (sayi1%2==0){
//            System.out.println("Cift Sayi");
//        } else if (sayi1%2!=0) {
//
//            System.out.println("tek Sayi");
//        }
//
        //2.Yol.

        if (sayi1%2==0){
            System.out.println("cift sayi");

        }
        else {
            System.out.println("ek sayi");
        }

        //Example2:Bir sayının negatıf,pozıtıf,veya notr oldugunu soyleyenm kodu yazın

        System.out.println("please enter a number");

        double sayi2=input.nextDouble();
        if (sayi2<0){
            System.out.println("Negatif");
        } else if (sayi2>0) {

            System.out.println("Pozitif");

        }
        else {
            System.out.println("notr");
        }

    }
}
