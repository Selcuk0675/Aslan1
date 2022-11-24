package day16multidimensionalarraysarraylist;

import java.util.Arrays;

public class MultidimensionalArray01 {
    public static void main(String[] args) {
        // Bir tane integer multidimensional arrays olusturunuz
        // Bu arraydaki tum sayilarin toplamini veren kodu yaziniz
        // ic ice oldugu icin nested loop a ihtiyacimiz var
        int [][] arr={{2,5,1},{32,75},{13,21,43,56}};
        int sum=0;// toplama islemi yapacgimiz zaman her zaman bunu kullanacaz
        for (int [] w: arr) {// dıstaki bir oldugu icin bir koseli parantez koyduk
            for (int k : w) {// burada k variablenin ismi rastgele koyduk :dikkat. koseli parantez yok
                sum=sum+k;// java w den aldigi ilk arraydeki ilk elemani k nıonı icine koyacak

            }
        }
        System.out.println(sum);
        //Example 2: Bir multidimensional array i normal arraya ceviren kodu yaziniz
        //{{2,5,1},{32,75}}==>{2,5,1,32,75}
        // cozum e dogru : multidimensional array deki eleman sayisini bulunuz
        // cunku eleman sayisi yeni bir array icin elemansayisi orijinal arrayin kine esit olmalidir

        int [][] brr={{2,5,1},{32,75}};
        int toplam=0; //burada multi-dimensional array deki elamna sayisini bulduk
        for (int [] w: brr) {
            toplam=toplam+w.length;// bunun sonucu bize tolplami veriyor


        }
        System.out.println(toplam);//5
        int idx=0;                  // [0,0,0,0,0,]
        int [] crr=new int[toplam];// yukari toplamda kac eleman varsda yeni arrayda da o kadar eleman var
        for (int [] w: brr) {
            for (int k:w){
                crr[idx]=k;
                //crr[0]=2        //   buradakiş eleman lar bittigi icin loop kırılascak
                //crr[1]=5
                //crr[2]=1
                //crr[3]=32
                //crr[4]=75
                idx=idx++;
            }
        }
        System.out.println(Arrays.toString(crr));//[2, 5, 1, 32, 75]

    }
}
/*
Array veya collection varsa for eachloop kullnamak ilk tercihimiz olsun
array veya collection var ama index kullanmak zorundaysak forloop kullnamak zorundayiz
 cunku foreach loop calismaz
 */