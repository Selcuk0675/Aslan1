package day15arraysmultidimensionalarray;

import java.util.Arrays;

public class Array02 {
    public static void main(String[] args) {
        //Example 1:Size verilen pozitif ve negatif sayilar iceren bir
        // integer Arraydaki en byuk negatif ve en kuck pozitif elemani bulunuz

        int[] arr={-12,18,-5,23,-2,0};// oncelikle elemanlari sort edecez yani buyukten kucuge dogru yazdiracaz
        Arrays.sort(arr);
        int minNegative=arr[0];// length-1 ==> son eleman
        int maxPositive=arr[arr.length-1];// son eleman kesin poızitif cunku adam soruda bizden oyle istemis
        for (int w : arr) {
            if (w<0){
                minNegative=Math.min(minNegative,w);
            }if (w>0){
                maxPositive=Math.max(maxPositive,w);
            }
        }
        System.out.println(minNegative +" and "+maxPositive);
        // yazdirma islemini loop un dısına koymak zorundayiz
    }
}
