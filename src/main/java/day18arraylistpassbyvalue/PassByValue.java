package day18arraylistpassbyvalue;

public class PassByValue {
    public static void main(String[] args) {

        int x=5;// static method olan main method un icindeki her sey static olmalidir
        System.out.println(x);
        change(x);
        System.out.println(x);
        int ucret=100;
        int kopya=indirim(ucret);
        System.out.println(kopya);
        System.out.println(ucret);





    }

        /*
1) java variablelerin orijinal degerini korumak ister
2) variable metodlar icinde kullanildiginda java methodun icine orjinal degeri yerine kopyasini kor .
bu sisteme" "Pass By Value" "denir

Not:Java pass by value kullanir
Not: bazi progrramlama dillri orijinal degeri koruma altina almamis bunu developerlara birakmislardi
 buna Pass By Reference denir
 */

    public static int indirim(int gomlekUcretleri){
        return gomlekUcretleri-10;// void olunca data vermiyo biz burda int verdik

    }                              // onun icin kullaniciya islemi ver manasinda method body si icinde
                                   // return keyword kullanilmalidir


    public static void change(int a){
        System.out.println(a+3);
    }







        }
