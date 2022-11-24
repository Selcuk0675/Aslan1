package day20stringbuilderstringbuffer;

public class StringBuilder01 {
    public static void main(String[] args) {

         /*
        1) StringBuilder Javada bir classtir
        2) StringBuilder String olusturmaya yarar
        3)String class varken nicin String builder a ihtiyac vardir?
           Cunku String class Immutable Class dir ama biz bazen Mutable Stringlere ihtiyac duyariz
           StringBuilder bize "Mutable String verir
        4)Immutable Class larda var olan bir deger degistiriemez
          var olan bir degeri degiştirmek istiyorsak;
            i) Memory de yeni bir variable yeni degerle olusturulur
            ii) Eski variable nin pointer i yeni variable ye dondurulur
            iii) eger bir variable hicbir pointer gostermiyorsa o variable Garbage Collector tarafindan silinir

            "mutable class larda var olan deger degistirilebilir .orijinal deger korunmaz
        5)String classlarin immutable yapisi security icin onemlidir
          Ayni degere sahip birden fazla string oldugunda ,Javabir tane container olusturur ve ayyni degere  sahip Stringlerin bu containeri
          kullanmasini temin eder.Bu memoryi korumak icin iyidir ancak containeri daki degeri bir variable icin degistirdigimizde tum variablelarin
          etk,lenmesi tehlikesi vardir.Bu tehlikeden kurtulmak icin Java Stringleri immutable (degisme) yapmistir.Fakat herhangi bir variablenin degerini
          degistirmek i,cin Java bir yol bulmustur.Degiştirmek istediginiz variable icin yeni bir container olusturur ve variablenin pointerini bu yeni variable a yonlendirr.
          Boylelikle hem degisim saglanmis hem de digerleri etkilenmis olur.

     */

        String str="Java";
        //StringBuilder nasil olusturulur
        //1Yol:
        StringBuilder strb=new StringBuilder("Java");
        System.out.println(strb);//Java

        //2.Yol
        // yol a:
        StringBuilder strb2=new StringBuilder();
          strb2.append("Java");
          strb2.append("  is easy");
          strb2.append(" !!!");
        System.out.println(strb2);//Java  is easy !!!
        // yol b:
        strb2.append(" learn ").append(" Java").append(" earn money");
        System.out.println(strb2);//Java  is easy !!! learn  Java earn money

        //StringBuilder larda karakter sayisi nasil bulunur?
        StringBuilder strb3=new StringBuilder();
        strb3.append("Cat");
        strb3.append("123456789123456");
        int numOfChar=strb3.length();//karakter sayisi
        System.out.println(numOfChar);//18

        int capacity=strb3.capacity();
        System.out.println(capacity);//34
        //Kapassite asimlarinda var olanin iki katindan iki fazlasini yapar

        strb3.append("asdfghjklşizxcvbnmöçwertyuıo");
        int krktrsayisi=strb3.length();
        System.out.println(krktrsayisi);//46

        int capacity2=strb3.capacity();
        System.out.println(capacity2);//70

        strb3.setCharAt(2,'r');// 2 . karakteri  r ye cevirir
        System.out.println(strb3);//Car123456789123456asdfghjklşizxcvbnmöçwertyuıo

        strb3.delete(3,18);// indexx 3 dahil indewx 18 haric e kadar butun karakterleri siler
        System.out.println(strb3);//Carasdfghjklşizxcvbnmöçwertyuıo

        strb3.deleteCharAt(2);
        System.out.println(strb3);//Caasdfghjklşizxcvbnmöçwertyuıo

        strb3.reverse();// String buildere ters cevirir
        System.out.println(strb3);//oıuytrewçömnbvcxzişlkjhgfdsaaC
        // mutable lerde orijinal degeri degiştirmek icin methodu kullnmak yeterlidir

        //Immmutable lerde orijinal degeri degiştirmek icin methodu kullnmak yeterli degildir ayni zamanda atama yapilmalidir

        String str2="Java";
        str2=str2.replace("a","i");
        System.out.println(str2);//Jivi

        String strngstrb3=strb3.toString();// bu method String builderlari stringe cevirir
        System.out.println(strngstrb3);//artik string oldu bunu sonuna nokta koyarak anlayabiliriz

        StringBuilder strb4=new StringBuilder(strngstrb3);// Stringten de Stringbuildere geri donebiliriz
        System.out.println(strb4);

        strb4.insert(3,"ssssss");
        System.out.println(strb4);//oıussssssytrewçömnbvcxzişlkjhgfdsaaC

        StringBuilder a=new StringBuilder("Java");
        StringBuilder b=new StringBuilder("Java");

        int sonuc=a.compareTo(b);// bu method sb ler tamamiyla ayni ise 0 verir
        System.out.println(sonuc);//0

         // a alfabetik sirada b den sonra gelirse pozitif olarak aradaki alfabetik siralama farkini gosterir
        //  a alfabetik sirada b den once gelirse negatif olarak aradaki alfabetik siralama farkini gosterir




    }
}
