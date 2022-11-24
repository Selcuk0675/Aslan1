package day15arraysmultidimensionalarray;

import java.util.Arrays;

public class MultidimensionalArray02 {
    public static void main(String[] args) {
        //MultiDimensionalArray kisa yoldan nasil yailir

        char arr[][]={{'a','b'},{'C','E','D'},{'?'}};
        System.out.println(Arrays.deepToString(arr));//[[a, b], [C, E, D], [?]]

        // Bir String multidimensional Arrayda icndde 'a' olan elemanlari konsola yazdiriniz
        String brr[][]={{"learn","java"},{"earn ","money"}};
        for (String[] w:brr) {
            for (String k:w) {
                if (k.contains("a")) {
                    System.out.println(k);
                }
            }

        }



    }
}
