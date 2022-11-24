package day08stringmanipulation;

import java.util.Scanner;

public class StringManipulation01 {
    public static void main(String[] args) {
        //Example1:Kullanicidan aldiginiz isimin ilk ve son harfini ekrana yazdirin
        //        Ramazan==>Rn

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim=input.next();

        char ilkharf=isim.charAt(0);
        char sonharf= isim.charAt   (isim.length()-1);
        System.out.println(" "+  ilkharf+sonharf);//Rn
        System.out.println(ilkharf+sonharf);//192 dir Bu sekilde java bunlarin assci degerini hesaplar


        //2 yol:
        String ilkharf1=isim.substring(0,1);
        String sonharf1=isim.substring(isim.length()-1);
        System.out.println(ilkharf+sonharf);//192
        System.out.println(""+ilkharf+sonharf);

        //Example2: Verilen stringteki tum hayvan isimlerini ekrana yazdırın
                   //"Ben kedi,esim tavuk,oglum sever inek "

        String cumle="Ben kedi,esim tavuk,oglum sever inek ";
        String kedi=cumle.substring(4,8);
        String tavuk=cumle.substring(14,19);
        String inek=cumle.substring(32);//Boyle yaparsak java 34 ten sonuna kadar byazar
        System.out.println(kedi+"  " +"  " +tavuk+"  " +  inek);

        //substring() in iki kullanimi vardir.
//        //1)substring(baslangic indexi, bitis indexi) String'in ortasindan bir parca almaya yarar
//        //2)substring(baslangic indexi) String'in verilen index'ten sonuna kadar almaya yarar

        //Example3: ilk isim ve soy isimi iceren ismlerden ilk ve soy isimlerin bas harflerini ekrana yazdiriniz
        //  Ali Can ==>AC

        String tamisim="ali can";
        String a=tamisim.substring(0,1);
        String b=tamisim.split("")[1].substring(0,1);
        System.out.println(a+b);

    }
}
