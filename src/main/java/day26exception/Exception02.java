package day26exception;

public class Exception02 {
    public static void main(String[] args) {
      char ch= getCharFromString("Java",2);//Bunu ekranda gormek icin char ch1 sout yaptik
        System.out.println(ch);

       char ch2= getCharFromString("selenium",8);
        System.out.println(ch2);//StringIndexOutOfBoundsException
        //Eger bir stringte olmayan bir karakter kullanilirsa
        //StringIndexOutOfBoundsException alinir


    } //Bir Stringin istedigimiz herhangi bir karakterini veren bir  method olusturalim
    public static char getCharFromString(String str,int index){
        try {
            char ch=str.charAt(index);
            return ch;
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("String bir ifadede istenen character length disi oldugundan Exception verdi " +e.getMessage());
            e.printStackTrace();//detayli "log"icin,  Log;akiş
        }

        return 0;//Return methodun enson satirina konur
    }

}
