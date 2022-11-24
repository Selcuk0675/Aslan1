package day16multidimensionalarraysarraylist;

import java.util.ArrayList;
import java.util.List;

public class Arraylist01 {
    public static void main(String[] args) {
             /*
        Arraylist'ler ayni data tipine sahip birden fazla datayi depolamak icin kullanir.
        Array ile farkalri:
        1)Array olustururken Arrayin icine kac eleman koymamiz gerektigini soylemeliyiz ve soyledigimiz erleman sayisindan fazlasini koyamayiz
           Arrayle eleman sayisinda fixed dirler.

           Arraylist'leri olustururken eleman sayisini soylemeye gerek yok cunku eleman sayisinda flexible dir
        2)Arraylerin icine primitive ve adresleri koyabiiriz
           Arraylistlrin icine sadece non-prımıtıve le konur
        3)Arrayler superfast tirler ve memory i cok az kullanir.
          bu yuzden uzunlugundan emin oldugumuz coklu datalarda array kullanilir
         */
        //Arraylist nasil olusturulur
        // 1.yol
        ArrayList <Integer> ages=new ArrayList <> ();
        // 2.Yol
        ArrayList <Integer> heights=new ArrayList <> ();
        // 3.yol
        List<Integer> nums=new ArrayList <> ();

        //Arraylist leri nasil yazdiririz
        System.out.println(nums);//[]

        //Arraylist lere nasil eleman eklenir
        // add her zaman elamni en sona ekler (insertion order)
        nums.add(21);// add boolean verir true gorev tamm.
        nums.add(21);                  // false yerlestirilemedi
        nums.add(20);
        System.out.println(nums);

        nums.add(1,50);//index bir e 50 yi yerlestiriniz
        System.out.println(nums);//[21, 50, 21, 20]
// List e num ekleme
        List<Integer>prices=new ArrayList<Integer>();
        prices.add(23);
        prices.add(185);

        nums.addAll(prices);
        System.out.println(nums);//[21, 50, 21, 20, 23, 185]

        //Arraylistlerin eleman sayisi nasil bulunur?
        int elemanSayisi=nums.size();
        System.out.println(elemanSayisi);//6
        //Arraylistlerde herhangi bir eleman nasil secilir
        // get methodu istenen bir indexteki elemani verir
        int eleman1=nums.get(3);// 3 uncu index deki elamani verir
        System.out.println(eleman1);//20

        //Arraylistin bos olup olmadigininasi anlariz
        boolean bos1=nums.isEmpty();
        System.out.println(bos1);//false

        boolean bos2=nums.isEmpty();
        System.out.println(bos2);//true

        //ArrayList te bir eleman nasil degistirilir
        nums.set(3,200);// nums listine gidip 3teki elemani bulup onu 200 e cevir
        System.out.println(nums);//[21, 50, 21, 200, 23, 185]

        //Example 1:nums ArrayListindeki tum tek sayilari 11 artirdiktan sonra ekrana yazdiriniz

        for (int w : nums){
            if (w%2!=0){
                nums.set(nums.indexOf(w),w+11);// set metodu 21    11 artıracak
                //     21==>0=21 , 21+11=32
                //     23==>2=23 , 23+11=34
            }
        }
        System.out.println(nums);//[32, 50, 32, 200, 34, 196]  butun teklere  11 ekledik
        // remove metodunun icine tamsayi, koyarsaniz java onu index olarak kabul eder
        // o zamn 200 wrapper class a cevirmemmiz lazim
        //ArrayList ten 200 elemanini siliniz

        Integer sayi=200;
        nums.remove(sayi);// remove un icine 200 yazarsak onu index olarak kabul eder
        // cunku java memory korumak icin bunu primitive olarak kabul eder
        // bu yuzden bunu wrapper classa ceviriirz
        System.out.println(nums);//[32, 50, 34, 18, 20, 34, 196]

        //Note: tum tam asayilar aksi soylenmedikce java icin int dir
        //Note 2:primitiveler arraylistlerin elemani olamzlar cunku listler nonprimitivedir
        //Note 3:primitiveleri WrapperClassa cevirirsek non primitive olurlar vr
        // bunlar listlerin erlemani olur, index olamaz

    }
}
