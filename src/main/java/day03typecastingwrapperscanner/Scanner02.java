package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        //Sayilari kullanıcadan alip toplama islemi yapan kod yazınız

        Scanner input=new Scanner(System.in);
        System.out.println("kullanıcı birinci sayiyi gir");
        double sayi1= input.nextDouble();
        System.out.println("kullanıcı ikinci sayiyi gir");
        double sayi2= input.nextDouble();
        System.out.println("kullanıcı toplamın"+(sayi2+sayi1));








    }
}
