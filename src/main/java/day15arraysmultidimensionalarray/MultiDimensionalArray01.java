package day15arraysmultidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {
        // note: Bir Arrayin elemenlari Array ise bu Arraylar multidimensiolo Array denir
        //Multidimensional Array nasil olusturulur

        int arr[][]=new int[3][2];
        System.out.println(Arrays.deepToString(arr));//// note: Bir Arrayin elemenlari Array ise bu Arraylar multidimensiolo Array denir

        //Multidimensional Arraylara eleman ekleme
        arr[0][0]=1;
        arr[0][1]=2;
        arr[1][0]=3;
        arr[1][1]=4;
        arr[2][0]=5;
        arr[2][1]=6;
        //Multidimensional Array consola nasil yzdırılir
        System.out.println(Arrays.deepToString(arr));//[[1, 2], [3, 4], [5, 6]]
       //Multidimensional Arraylerde Array elemanlarından biri nasil yazdirilir
        System.out.println(Arrays.toString(arr[2]));//[5, 6]
        //ultidimensional Arraylerde  ic Arraylardaki elemanlar nasil yazdirilir
        System.out.println(arr[2][0]);//5
        //Example 1: String bir multidimensional bir Array olusturunuz.
        // Elemanlari ekleyiniz.
        // oplam eleman sayisini ekrana yazdiran kodu yaziniz

        //String bir multidimensional bir Array olusturunuz.
        String [][]brr= new String[4][3];
        brr[0][0]="A";
        brr[0][1]="B";
        brr[0][2]="C";

        brr[1][0]="D";
        brr[1][1]="E";
        brr[1][2]="F";

        brr[2][0]="G";
        brr[2][1]="H";
        brr[2][2]="I";

        brr[3][0]="J";
        brr[3][1]="K";
        brr[3][2]="L";
        System.out.println(Arrays.deepToString(brr));//[[A, B, C], [D, E, F], [G, H, I], [J, K, L]]
        int sum= 0;
        for (String [] w : brr) {
            sum=sum+ w.length;
        }
        System.out.println(sum);//12

    }
}
