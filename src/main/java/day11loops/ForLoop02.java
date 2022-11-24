package day11loops;

public class ForLoop02 {
    public static void main(String[] args) {

        //Example 1:Bir Stringdeki m haric butun karakterleri yazdiriniz
        String str="JAvama dokunma";
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);// bakkaldan 6 ekmek alan cocugun hikayesi
            if (str.charAt(i) != 'm'){
                System.out.println(str.charAt(i));
            }
        }
        //2.Way:
        String str2="JAvama dokunma";
        for (int i=0; i<str2.length(); i++) {
            char c = str2.charAt(i);// bakkaldan 6 ekmek alan cocugun hikayesi

            if (c == 'm'){
                continue;
            }
            System.out.print(c);
        }

        //Example 2:1 den 100 e kadar 6 ile bolunebilen ler haric tum sayilari yazdiriniz
        for (int i=1;i<101;i++) {
            if (i%6==0) {
                continue;
            }
            System.out.print(i);
        }
        System.out.println();
        //Example 3:Size verilen bir Stringteki "m" den onceki karakterleri yaziniz

        String s="Luxemburg";

        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='m'){
                break;
            }

            System.out.print(ch);
        }


    }
}
