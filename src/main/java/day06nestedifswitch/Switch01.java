package day06nestedifswitch;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

        // Kullanıxcıdan gunsayisini aliniz ve gun ismini giriniz
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen gun sayisini giriniz");
        int gunsayisi=input.nextInt();

        if (gunsayisi==1){
            System.out.println("pazar");
        } else if (gunsayisi==2) {
            System.out.println("pazartesi");

        }else if (gunsayisi==3) {
            System.out.println("sali");
        }
        else if (gunsayisi==4) {
            System.out.println("carsamba");
        }
        else if (gunsayisi==5) {
            System.out.println("persembe");
        }
        else if (gunsayisi==6) {
            System.out.println("cuma");
        }
        else if (gunsayisi==7) {
            System.out.println("cumartesi");
        }else {
            System.out.println("gecerli bir gun ismi giriniz");
        }

        //2Yol:Switch ile cozum

        switch (gunsayisi){

            case 1:
                System.out.println("pazar");
            break;

            case 2:
                System.out.println("pazartesi");
                break;

            case 3:
                System.out.println("sali");
                break;

            case 4:
                System.out.println("carsamba");
                break;

            case 5:
                System.out.println("persembe");
                break;

            case 6:
                System.out.println("cuma");
                break;

            case 7:
                System.out.println("cumartesi");
                break;

            default:
                System.out.println("gecerli bir gun numarasi giriiniz");

        }

    }

}
