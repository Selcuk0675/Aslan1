package day27exceptions;

public class Exception01 {
    public static void main(String[] args) {
        double r1=compareNumOfCharacters("Java","xy");
        System.out.println(r1);
        double r2=compareNumOfCharacters("null","xy");
        System.out.println(r2);
        double r3=compareNumOfCharacters("selenium","");
        System.out.println(r3);



    } //Verilen iki Stringten birinin karakter sayisinin digerinn kac kati
      // oldugunu veren method olusturunuz
    public static double compareNumOfCharacters(String s,String t) {


        double result = 0;
        try {
            result = s.length() / t.length();

        } catch (ArithmeticException e) {
            System.out.println("Herhangi bir sayi sifir ile bolunmez");
        }catch (NullPointerException e){
            System.out.println("Length methodu null ile calismaz");
        }finally {//Database ile connection u kesmek icin bunu yapiyoruz bu her durumda bu calisir
                  //Note:Eger kod yazdigimizda herhalukarda bir fiilin yapilmasini istiyorsak
                  // onu finally nin suslu parantezi icine yazariz
            System.out.println("Database ile connection kesildi");
        }


        return result;
    }

 /*  "final","finally","finalize" aciklayiniz
       1)"final" bir keyworddur .Variable Class ve Methodlar icin kullanilir....
          i)Variablelerde kullanilabilir     public final int age=12;
              a)Atanan deger degiştirilemez
              b)Deger atamasi yapilmak zorundadir
          ii)Methodlarda kullanilabilir   public final int add(){return a+b}
        a)Bir method olusturulurken "final"olarak olusturulmus ise o mehodun body si asla degistirilemez
           dolayisiyla o method override edilemez
         iii)Class larda kullanilabilir
             Bir class i final yaparsaniz o Classi kisirlastirmis ollursunuz
             Bir class final iseeeee o class extend edilmez.
             final Class Child olabilir

       2)"finally" bir "code block"tur(suslu parantezin icine yazilir
          "try-catch" veya adece "try" ile kullanilir.
          "finally" code block icine yazilan code 'lar her halukarda calistirilir
          Mesela database ile connection ukesmek herhalukarda yapilmasi gereken bir fiildir.Bunu "finally" ile yapabiliriz
       3) "finalize"bir methoddur bu method java tarafindan datalar imha edilmeden once cagrilir bu method datalari imha edilecek hale getirr
           daha sonra "garbage collector" bu datalari imha eder
           not: "finalize"bir methodunu Java Developer'larda cagirabilir ama Java kendi bildigini yapar.

     */


}
