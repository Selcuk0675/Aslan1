package day18arraylistpassbyvalue;

public class PostPreIncrementDecrement {
    public static void main(String[] args) {
        int a=5;
        //PostIncrement
        int b=a++;
        System.out.println(a);//6
        System.out.println(b);//5
        //PreIncrement
        int c=10;
        int d=++c;
        System.out.println(c);//10
        System.out.println(d);//11

        //Post Decrement
        int e=20;
        int f=e--;
        System.out.println(e);//20
        System.out.println(f);//19

        int h=30;
        int i=--h;
        System.out.println(i);//29
        System.out.println(h);//29

    }




}
