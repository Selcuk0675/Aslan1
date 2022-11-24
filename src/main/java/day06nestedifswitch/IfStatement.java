package day06nestedifswitch;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        //Kullan,icidan yas degerini alan ve yasin hangi evrede oldugunu asagıdakı tabloya gore ekrana yazın
        //0-4=>bebek
        //5-12=>cocuk
        //13-20=>genc
        //21-30=>yetiskin
        //Tanimlanmamiş evre

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir yas degerini giriniz");
        int yas=input.nextInt();
        if (yas<0){
            System.out.println("gecerli bir yas giriniz");
        }

        if (yas<=4){
            System.out.println("bebek");
        } else if (yas<12) {
            System.out.println("cocuk");
        } else if (yas<=20) {
            System.out.println("genc");
        } else if (yas<=30) {
            System.out.println("yetiskin");
        }else {
            System.out.println("tanimlanmamis evre");

        }

    }
}
