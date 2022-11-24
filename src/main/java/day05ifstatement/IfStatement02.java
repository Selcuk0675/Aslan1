package day05ifstatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {

        //Example:Kullanıcı gun numarasını girsin kod gun ismini yazsın

        Scanner input=new Scanner(System.in);
        System.out.println("gün numarasını giriniz");
        int GunNo=input.nextInt();
        if (GunNo==1){
            System.out.println("Pazar");
        } else if (GunNo==2) {
            System.out.println("Pazartesi");

        } else if (GunNo==3) {
            System.out.println("sali");

        } else if (GunNo==4) {
            System.out.println("carsamb");

        } else if (GunNo==5){
            System.out.println("persemb");

        } else if (GunNo==6){
            System.out.println("cuma");

        } else if (GunNo==7) {
            System.out.println("cumartesi");

        }
       else {
            System.out.println("Gecerli bir sayı giriniz");
        }


    }
}
