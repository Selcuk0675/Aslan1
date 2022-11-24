package day12loops;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {
        //Example 1:3 ten 10 a kadar tam sayilari ayni satirda ekrana yazdiriniz

        for (int i=3;i<10;i++) {
            System.out.print(i);
        }
        System.out.println();
        // 2.Way:While-loop
        int i=3;
        while(i<10){
            System.out.print(i);
            i++;
        }
        System.out.println();
        //Example 2:17 den 4 e kadar tum cift sayilari ayni satirda ekrana yazdirin
        int k=17;
        while(k>4){

            if (k%2==0){
                System.out.print(k);
            }
            k--;
            }
        System.out.println();
        //Example 3:12 den 67 ye kadar sayilarin toplamini verne kodu yaziniz
        int j=12;
        int sum=0;
        while (j<67){
            sum=sum+j;

            j++;

        }
        System.out.print(" "+sum);
        System.out.println();
        // Example 4:size verilen bir tamsayinin rakamlari toplamini ekrana yazdiran kodu y z
        int m=123;
        int top=0;
        while (m>0){
            top=top+m%10;
            m=m/10;
        }
        System.out.println(top);
        System.out.println();

        //Example 5 :kullanicidan aldiginiz bir sayinin carpım tablosunu ekrana yazdirin
        // 3 ==>3*1=3   3*2=6   3*3=9 .....3*10=30
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi=input.nextInt();

        int n=0;
        while (n<10){
            System.out.println(sayi+"*"+n+"="+sayi*n);
            n++;// buradaki n++ nın yri onemli eger sout un onune koyarsak index i bir artirr
                // eger sonuna koyarsak index sifir alir
        }




    }
}
