package day17arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {
        //Example 1: Bir listteki elemanlardan birbirine yakin olan ikisini bbulunuz
        //           [12,15,19,30,21]==>19ve21 birbirine en yakin

        List<Integer> a=new ArrayList<>();
        a.add(12);
        a.add(19);
        a.add(15);
        a.add(30);
        a.add(21);
        System.out.println(a);//[12, 19, 15, 30, 21]

        Collections.sort(a);// listleri sort yhapmak icin Collections kullaniriz
        System.out.println(a);//[12, 15, 19, 21, 30]

        int minFark=Integer.MAX_VALUE;

        for (int i=1;i<a.size();i++){
            minFark=Math.min(minFark,a.get(i)-a.get(i-1)); // get methodu istenen bir indexteki elemani verir
        }
        System.out.println(minFark);//2


    }
}
