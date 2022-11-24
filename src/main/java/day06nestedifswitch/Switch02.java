package day06nestedifswitch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {

        // Kullaniciya ay ismini sorunuz ve kullanicinin verdiigi ay isminden son aya kadar ekrana yazin

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen ay ismini giriniz");
        String ayismi=input.next().toLowerCase();//kullanıcı ne girerse girsin java bunu kucu harf yapacak.cunku biz kucuk harf vrmistik
        //Note:tolowercase() metodu bir stringteki butun karakterleri kucuk harflere cevirir
        //Note:toupprercase() metodu bir stringteki butun karakterleri buyuk harflere cevirir

        switch (ayismi){

            case "ocak":
                System.out.println("ocak");

            case "subat":
                System.out.println("subat");

            case "mart":
                System.out.println("mart");

            case "nisan":
                System.out.println("nisan");

            case "mayis":
                System.out.println("mayis");

            case "haziran":
                System.out.println("haziran");

            case "temmuz":
                System.out.println("temmuz");

            case "agustos":
                System.out.println("agustos");

            case "eylul":
                System.out.println("eylul");

            case "ekim":
                System.out.println("ekim");

            case "kasim":
                System.out.println("kasim");

            case "aralik":
                System.out.println("aralik");
                break;

            default:
                System.out.println("gecerli bir ay ismi giriniz");


        }

    }
}
