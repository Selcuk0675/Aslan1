package day10stringmanupilation;

public class StringManipulation01 {
    public static void main(String[] args) {      // not : index ile karakter no su ayni degildi index sifirdan baslar karakter 1 den baslar
        String a="java kolaydir";

       boolean b =a.startsWith("kola",5);//ilk 5 karakter'den sonraki Stringe bakar.bunun kola ile baslayip baslamadigini kontrol eder.
        System.out.println(b );   //true                    // eger kola ile basliyosa true verir degise false verir

        String c=  a.replaceFirst("a","*");//bu metod String teki ilk a y, * a cevirir.
        // replace("a","*") metodu ise Stringteki tum a lari * a cevirir
        System.out.println("c = " + c);//J*va kolaydır
        
      String d=  a.concat(    "     Anldin mi");//concat methodu iki stringi birlestirmeye yarar
        System.out.println("d = " + d);// = java kolaydir     Anldin mi

        //Concatenation islemi iki turlu yapilabilir
        //i) + ile      a+ "Anladimi
        //İİ) concat ile
        //Java bir sle icin method uretmisse o metod u kullanmak "best practce dir

        String e ="  Tom Hanks  ";
        System.out.println("e = " + e);//"    Tom Hanks     "
        // trim()methodu bir stringin bas ve sondaki "space" karakterlerini siler,artadaki space karakterlerine dokunmaz
        String f =  e.trim();
        System.out.println("f = " + f);//"tom Hanks"

        String  h ="Java";
        String i="Kava";

        int k   = h.compareTo(i);//-1
        //Note: h.compareTo(i) bu kod iki String'i alfabetik olarak karsilastirir
        // buyuk kucuk harfe duyarlidir. egerf duyarli olmasini istemiyosak h.compareToIgnoreCase(i) kullanabiriz
        // h.compareTo(i) bu kodda h nin alfabetik sırasindan  i nin alfabetik sirasi cikarilir

        String n= a.repeat(3);//bu kod a stringini 3 kere yapıstırır
        System.out.println("n = " + n);// Java Kolaydır.Java Kolaydır.Java Kolaydır.

        //kmethodun ustune geldigimizde ctrl ustune basli tuttugumuzda methodun icine girebiliriz




    }
}
