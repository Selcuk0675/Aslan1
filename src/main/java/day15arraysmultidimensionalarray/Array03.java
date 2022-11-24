package day15arraysmultidimensionalarray;

import java.util.Arrays;

public class Array03 {
    public static void main(String[] args) {

        //Example 1:Bir stringteki sesli harflerin sayisini bulan kodu yaziniz
        //          A,E,I,O,U,a,e,i,u,o

        String str="Java ogrenince para kazanmak kolay,ogrenmeyincene kolay ki.";
        // bu stringi parcalamam lazim

        String harfler[]=str.split("");// buraya hiclik yerine space koysak normal yazdiracak harflerine ayirmayacakti
        int counter=0;// cunku a yi gordugumuzde artirmak lazim onun icin bu konteyniri olusturduk
        System.out.println(Arrays.toString(harfler));//[J, a, v, a,  , o, g, r, e, n, i, n, c, e,  , p, a, r, a,  , k, a, z, a, n, m, a, k,  , k, o, l, a, y, ,, o, g, r, e, n, m, e, y, i, n, c, e, n, e,  , k, o, l, a, y,  , k, i, .]

        for (String w: harfler){
            switch (w){
                case "a":
                    counter++;
                    break;
                case "e":
                    counter++;
                    break;
                case "i":
                    counter++;
                    break;
                case "u":
                    counter++;
                    break;
                case "o":
                    counter++;
                    break;
                case "A":
                    counter++;
                    break;
                case "E":
                    counter++;
                    break;
                case "I":
                    counter++;
                    break;
                case "U":
                    counter++;
                    break;
                case "O":
                    counter++;
                    break;








            }
        }
        System.out.println(counter);

    }
}
