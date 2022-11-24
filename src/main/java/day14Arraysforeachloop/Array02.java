package day14Arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Array02 {
    public static void main(String[] args) {

        //Example 1:[0,2,3,,0,12,0] sifirlari en sona koyunuz
        //          [2,3,12,0,0,0]//
        // bu soruyu cozmek icin yeni array olusturmammiz lazim bunun icin de olusturdugumuz yeni array orjinaliyle ayni sayida olmali

        int original[]={0,2,3,0,12,0};
        int yeni[]=new int[original.length];

        int idx=0;
        for(int i=0;i<original.length;i++){
            if (original[i]!=0){
                yeni[idx]=original[i];// bi elemani gectikten sonra yenisine gecmek lazim
                idx++;// onun icin bunu yaptik
            }
        }
        System.out.println(Arrays.toString(yeni));

        //Example 2:Bir Arrayin icinde herhngi bir elemanin olup olmadigini ve kac kere tekrarlandigini kontrol eden ve gosteren kodu aziniz
        //          [2,1,2,-3,2]==> kullanici 2 yi sordu 2 elemani var 3 kere tekrarlandi
        //                      ==> kullanici 6 yi sordu 6 elemani yok 0 kere tekrarlandi

        int [] arr={2,1,2,-3,2};
        int eleman=-3;
        int counter=0;
        for(int w : arr){
            if(w==eleman){
                counter++;
            }
        }
        if (counter>0){
            System.out.println(eleman+"  Array de  "+counter+"    Defa var");
        }else System.out.println(eleman+"   Arrayde yok");

        /*
              Array içerisindekileri sayı değeri olarak değil eleman olarak alıyor.
              Artırma ya da azaltma işlemlerini w ve counter üzerinde yapıyor.  if koşulu sağlanıyorsa counter ve w +1yapıyor.
              şayet if koşulu sağlanmıyorsa sadece w değeri +1 yapılacak counter sabit kalacak . özeti budur

         */
        //Example 3:Size verilen bir cumledeki en uzun kelimeyi bulan kodu yaziniz
        //         "Java kolaydir calisana, ne kolay ki calismayana"
        // cevaba dogru:cumleyi parcalayacaz ,noktalama isaretlerinden kurtulacaz
        String sentence="Java kolaydir calisana, ne kolay ki calismayana.";
        System.out.println(sentence);

        sentence=sentence.replaceAll("\\p{Punct}"," ");//noktalama isaretlerini kaldirdik
        System.out.println(sentence);

        String words[]=sentence.split(" ");
        Arrays.sort(words, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(words));//[ne, ki, Java, kolay, kolaydir, calisana, calismayana]
        // burda en son eleman en uzun olanidir
        System.out.println(words[words.length-1]);//calismayana
        // son eleman stringlerde ve arraylarda her zaman length-1 dir
    }
}
