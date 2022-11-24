package day17arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList02 {
    public static void main(String[] args) {

        //Example 1:Verilen bir listteki elemanlari tekrarsiz olarak yaziniz
        //          [2,3,2,2,5]==>[2,3,5]

        List<Integer> a=new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);

        List<Integer> yeni=new ArrayList<>();
        for (Integer w: a) {
            if (!yeni.contains(w)){
                yeni.add(w);
            }

        }
        System.out.println(yeni);//[2, 3, 5]

        //Example 2:Kullanıcıdan bir harf aliniz harf sizdeki listin icinde varsa
        // o harfi "Bulundu" ya ceviriniz yoksa  o harfi liste ekleyiniz
        // [A,K,R,S]==>R==>[A,K,Bulubdu,S]
        // [A,K,R,S]==>R==>[A,K,R,S,X]

        List<String> c=new ArrayList<>();
        c.add("A");
        c.add("K");
        c.add("R");
        c.add("S");

        Scanner input=new Scanner(System.in);
        String harf="";
        do {
            System.out.println("lutfen bir harf giriniz");
             harf=input.next().substring(0,1);

           if (c.contains(harf)){
               c.set(c.indexOf(harf), "bulundu");
           } else if (!harf.equals("Q")) {
               c.add(harf);

           }


        }while (!harf.equals("Q"));
        System.out.println(c);



    }
}
