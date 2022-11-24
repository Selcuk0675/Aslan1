package day07ternarystringmanipulation;

public class StringManipulation {
    public static void main(String[] args) {

          /*


                      String Class Methodlari
              1)equals(): iki tane stringin ayni olup olmadigini kontrol eder
                  equals() : methodu "boolean" return eder.

              2)equalsignorecase(): iki tane stringin ayni olup olmadigini buyuk harf kucuk harfe bakmadan anlamamıza yarar
                               "boolean" return eder.

              3)toLowerCase():Bir stringteki butun harfleri kucuk harfe cevirmeye yarar
                               String return eder
              4)toLowerCase():Bir stringteki butun harfleri buyuk harfe cevirmeye yarar
                               String return eder
              5)charAt(): Bir Stringten belli bir index deki caracteri almak icin kullanilir
                               char return eder
              6) length():Bir Stringde kac tane character kullanildigini ogrenmek icin kullanir
                               int return eder
              7)contains(): Bir stringte bnelli bir character var olup olmadigini anlamak icin kullanir
                              boolean return eder
              8)split():bir Stri,ngi istedigimiz karakterden bolmemize yarar
                              "Array return eder.


         */
        /*
             soru): Bir passwordun gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yazın.
                   i) En az 8 character icermel,i
                   ii)Space characteri icermememeli
                   iiiİlk harfi "m" veya "M" olmali
                   iv) Son characteri "?" olmasli

         */

        String pwd2="mnjHK4456?";

      //  i) En az 8 character icermel,i
        boolean pwd3=pwd2.length()>=0;
       // ii)Space characteri icermememeli
        boolean pwd4=!pwd2.contains(" ");// ! ==> isareti mez anlamındadır
       // iiiİlk harfi "m" veya "M" olmali
        boolean pwd5=pwd2.charAt(0)=='m'||pwd2.charAt(0)=='M';
       //v) Son characteri "?" olmasli
        boolean pwd6=pwd2.charAt(pwd2.length()-1)=='?';

        System.out.println(pwd5&pwd4&pwd6&pwd3);






    }
}
