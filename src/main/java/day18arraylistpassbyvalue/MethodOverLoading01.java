package day18arraylistpassbyvalue;

public class MethodOverLoading01 {
    public static void main(String[] args) {

        add(3,5);
        add(3,6);
    }

    /*
method overloading nasil yapilir???

1. method isimleri ayni olmalidir
2. method parametreleri farkli olmalidir.
   i) Parametre ayilari degishtirilebilir.
   ii) Parametrelerin data type'larini degishtirebiliriz
   iii) Parametrelerin yerlerini dgégishtirebilirsiniz ancak
   data type'lari farkli ise
3.Method ısmi +Parametreler =method Signature
Method Signatue disinda ne degistirrseniz degistirn Java o methodlari farkli kabul etmez
     */
        public static void add(int a,int b){
            System.out.println(a+b);
        }public static void add(int a,int b,int c){
        System.out.println(a+b+c);
        }public static void add(int a,double b){
        System.out.println(a+b);
        }public static void add(double a,int b){
        System.out.println(a+b);
    }





}
