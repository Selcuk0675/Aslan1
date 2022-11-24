package day13loopsarrays;

import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {
/*
1) Ayni data tipinde olmalilar coklu olmalilar bunlara "Array"denir
 */

        int stdAges[]=new int[7];// [0,0,0,0,0,0,0]// array nasil olusturulur
        System.out.println(Arrays.toString(stdAges));// array nasil yazdirilir
        //Array'lere elemanlar nasil eklenir?
        stdAges[1]=11;
        stdAges[0]=12;
        stdAges[2]=13;
        stdAges[3]=15;
        stdAges[4]=17;
        stdAges[5]=18;
        stdAges[6]=11;
        System.out.println(Arrays.toString(stdAges));//[12, 11, 13, 15, 17, 18, 11]

        //Array daki herhangi bir elemani nasil yazdirabiliriz?
        System.out.println(stdAges[4]);//17

        //Array daki en kucuk ve en buyuk elemani ekrana yazdiriniz
        Arrays.sort(stdAges);// kucukten buyuge dogru sıralar
        System.out.println(Arrays.toString(stdAges));//[11, 11, 12, 13, 15, 17, 18]

        int ilk=stdAges[0];
        int son=stdAges[stdAges.length-1];// Note: length parantezli Stringlerde ,parantezsiz Arraylarde kullanir .cunku bu bir metod degildir
        System.out.println(ilk+son);//18+11=29

        //Example 2:stdAges Arrayi icindeki tum elemanlarin toplamini ekrana yazdiran kodu yaziniz.
        //1.Yol
        int sum = 0;
        for (int i=0; i<stdAges.length; i++){
            sum=sum + stdAges[i];
        }
        System.out.println(sum);


        //2.Yol:whileLoop
        int i=0;
        int top=0;
        while(i<stdAges.length) {
            top = top + stdAges[i];


            i++;
        }
        //3.Yol:do while
        int k=0;  //baslangic
        int toplam=0;
        do {
            toplam=toplam+stdAges[k];
            k++;
        }while ((k<stdAges.length));// sart

        System.out.println(toplam);

        //4.Yol:for each loop// en gelismis loop tur mumkunse bunu kulllanaınız
        //for each arraylarda ve collection larda kullanılır
        int t=0;
        for (int w :stdAges){
            t=t+w;

        }
        System.out.println(t);

        //Example 3:String bir Array olusturunuz.
        //          Bu Arraya 5 tane isim yerlestiriniz
        //          Bu isimlerdeki karakter sayilarin toplamini ekrana yazdiriniz

        String stdName[]=new String[5];

        stdName[0]="Ali";
        stdName[1]="Tom";
        stdName[2]="Veli";
        stdName[3]="Kemal";
        stdName[4]="Cem";

        int karaktersayilaritop=0;

        for(String w : stdName){
            karaktersayilaritop=karaktersayilaritop+w.length();

        }
        System.out.println(karaktersayilaritop);//18

        //Example 4:Char bir array olusturunuz
        //          Bu Arraya 5 tane eleman yerlestiriniz
        //          Bu arraydaki sadece byuk harfleri ekrana yazdiriniz

        char ch[]={'a', 'B', 'c', 'D', 'e'};

        for (char w : ch) {

            if (w>'A' && w<='Z'){
                System.out.println(w);
            }


        }


    }
}
