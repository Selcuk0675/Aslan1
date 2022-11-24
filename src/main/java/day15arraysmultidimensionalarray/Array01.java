package day15arraysmultidimensionalarray;

import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {


        // binarySearch() Method:Bu methodu kullanarak bir elemanin Array'de olup olmadigini anlarixz
        //               binarySearch() Methodunu kullanmadan once "Arrays.sort()"kullanmaliyiz
        //               binarySearch() methodu aradiginiz eleman Arrayda varsa o elemanin indexini return eder
        //               binarySearch() methodu aradiginiz eleman Arrayda yoksa o elemanin indexini return eder

        int[] arr={12,31,43,14};
        int sayi=43;// buradaki sayiyi ornek olarak veriyoruz
        Arrays.sort(arr);//bunu mutlaka yapmaliyiz arraydaki elamanlari kucukten buyugedogru sıralar

        int idx=Arrays.binarySearch(arr, sayi);//burda sayi variablenin indxini goruruz
        System.out.println(idx);//3><<<<< burda dikkat edersek sifirdan baslamadik

        int sayi2=58;
        int idx2=Arrays.binarySearch(arr, sayi2);

        System.out.println(idx2);//-5 bunun anlami eleman yok demektir.
                                 // olsaydi 5. sirada  olurdu


    }
}
