package day16multidimensionalarraysarraylist;

import java.util.Arrays;

public class MultidimensionalArray02 {
    public static void main(String[] args) {
        // bir multidimensional arraydeki en buyuk ve en kucuk elemanin toplamini veren kodu yaziniz
        int arr [][]={{ 2,5,1},{83,75}};
        //1.Yol:
        int toplam=0;
        for (int [] w: arr) {
            toplam=toplam+ w.length;// burada eleman sayisini buluyoruz

        } System.out.println(toplam);//5
        int brr[]=new int[toplam];
        System.out.println(Arrays.toString(brr));//[0, 0, 0, 0, 0]

        int idx = 0;
        for (int[] w: arr) {
            for (int  k: w) {
                brr[idx]=k;
                idx++;

            }

        }
        System.out.println(Arrays.toString(brr));//[2, 5, 1, 83, 75]
        int crr []={2, 5, 1, 83, 75};
        Arrays.sort(crr);
        System.out.println(Arrays.toString(crr));//[1, 2, 5, 75, 83]
        int drr[]={1, 2, 5, 75, 83};

        System.out.println(drr[drr.length-1]+drr[0]);//84

        //2,yol
        int maxElement=arr[0][0];
        int minElement=arr[0][0];
        for (int [] w: arr) {//{{ 2,5,1},{83,75} arr miz/// burada w icin array diyoruz
            for (int  k: w){
                maxElement=Math.max(maxElement,k);
                minElement=Math.min(minElement,k);
            }
        }
        System.out.println(maxElement+minElement);





    }
}
