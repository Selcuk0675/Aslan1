package day18arraylistpassbyvalue;

import java.util.ArrayList;
import java.util.List;

public class Arraylist01 {
    public static void main(String[] args) {

        //Example 1:Bir integer array list teki 7 haric tum elemanlari 2 artiriniz

        List<Integer> a = new ArrayList<Integer>();

        a.add(12);
        a.add(13);
        a.add(14);
        a.add(7);
        a.add(139);


        for (int w:a){
            if (w==7){
                continue;
            }
            // w=w+2; list i degistirmek icin bunu n yerine set kodunu yazmaliyiz.yoksa calismaz
            a.set(a.indexOf(w),w+2);// ages listini git w nun indexini bul sonra hepsini iki artir

        }

        System.out.println(a);

        //Example 2:size verilen arrayliste 8 ve 8 den onceki tum elamanlari iki katina cıkariniz
        List<Integer> nums= new ArrayList<>();

        nums.add(12);
        nums.add(7);
        nums.add(21);
        nums.add(8);
        nums.add(9);

        for (int w:nums) {
            nums.set(nums.indexOf(w),2*w);
            if (w==8){
                break;
            }

        }


        System.out.println(nums);




    }
}
