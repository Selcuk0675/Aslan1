package day09stringmanipulation;

import java.util.Scanner;

public class StringManipulation01 {

    public static void main(String[] args) {
        //Note: indexof mettodu verilen karakterlerinin ilk gorunumunun indexini verir
        String str="Java is easy";
        
        int idxA=str.indexOf("a");
        System.out.println("idxA = " + idxA);//1
        
        //Last index of():

        //lastindexof mettodu verilen karakterlerinin son gorunumunun indexini verir
        
        int idxa2=str.lastIndexOf("a");
        System.out.println("idxa2 = " + idxa2);//9

        String s="Mississipi";//indexof hem string hem de char ile kullanilir
        int idxI= s.indexOf('i');//1
        System.out.println("idxI = " + idxI);

        int idxiss1= s.indexOf("iss");//İlk gorunumun ilk karakterinin indexini verir
        System.out.println("idxiss1 = " + idxiss1);//1
        int idxiss2= s.lastIndexOf("iss");// son gorunumun ilk karakterinin indexini verir
        System.out.println("idxiss2 = " + idxiss2);//4

        // Not. indexof her zaman integer verir.

//Example1:Bir Stringteki bir characterin tekrarli veya tekrarsiz olup olmadigini gosteren bir kod yaziniz
        //         "Helloooo"==> H tekrarsız  , e tekrarsiz ,o tekrarli .l  tekrarli

        String str2="helllooo";
        String h=str2.indexOf("H")==str2.lastIndexOf("H")?"tekrarsız":"tekrarli";
        System.out.println("h = " + h);

        String e=str2.indexOf("e")==str2.lastIndexOf("e")?"tekrarsız":"tekrarli";
        System.out.println("e = " + e);

        String l=str2.indexOf("l")==str2.lastIndexOf("l")?"tekrarsız":"tekrarli";
        System.out.println("l = " + l);

        String o=str2.indexOf("o")==str2.lastIndexOf("o")?"tekrarsız":"tekrarli";
        System.out.println("o = " + o);

        String u="Learn Java earn money";
        int sonuc= u.indexOf("a",6);//javaya bana a nın gorunumu lazım ama 6 dan sonraki ilk a yi ver yani ilk 6 karakteri gorme
        System.out.println("sonuc = " + sonuc);//7
        int sonuc2= u.indexOf("n",5);
        System.out.println("sonuc2 = " + sonuc2);//14
        int sonuc3= u.indexOf("e",4);
        System.out.println("sonuc3 = " + sonuc3);//11
        //fromindex==>...den index

        String v="Java is Java";  // length==0 -->is empty
        boolean bosmu= v.isEmpty();// is empty methodu:Bir stringin bos olup olmadigini kontrol eder
        // .eger stringte hic karakter yoksa is empty metodu true return edrer
        // ,eger herhaangi bir karakter varsa false return eder
        System.out.println("bosmu = " + bosmu);
        // Bir stringi,n bos olupolmadigini anlamak icin length==0 degil is empty metodunu kullanalım

        String x="";
        boolean blankmi= x.isBlank();// isblank --> hem bos string  hem de sadece space iceren stringler icin true return eder
        System.out.println("blankmi = " + blankmi);//true

        //Example2:Kullanıcıdan alinan isim mutlaka spacaden farkli en az  bir character icermelidir

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen isim giriniz");
        String isim=input.nextLine();
        
        String ilkisim=isim.isBlank()?"lutfen gecerli bir isim giriniz":"dogru giris yaptınız";
        System.out.println("ilkisim = " + ilkisim);


    }
}
