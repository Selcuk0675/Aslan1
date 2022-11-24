package day06nestedifswitch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {//note: Switch te sadece ;int, byte,short,char,String kullanabiliriz

//Kulanıcıdan islem ve iki taner sayi alarak islemin sonucunu ekrana yazdıran basit bir hesap makinasi yapiniz

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir islem giriniz:+,-,*,/,%");
        char islem=input.next().charAt(0);

        System.out.println("lutfen birinci sayiyi giriniz");
        double sayi1=input.nextDouble();

        System.out.println("lutfen ikinci sayiyi giriniz");
        double sayi2=input.nextDouble();


        switch (islem){

            case '+':
                System.out.println(sayi1+sayi2);
                break;
            case '-':
                System.out.println(sayi1-sayi2);
                break;
            case '*':
                System.out.println(sayi1*sayi2);
                break;
            case '/':
                System.out.println(sayi1/sayi2);
                break;
            case '%':
                System.out.println((sayi1*sayi2)/100);
                break;
            default:
                System.out.println("gecerli bir islem giriniz");






        }


    }
}
