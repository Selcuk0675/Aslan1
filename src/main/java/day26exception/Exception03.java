package day26exception;

public class Exception03 {
    public static void main(String[] args) {
       double d= divideStringByTheNumOfTheChar("55555");
        System.out.println(d);
        double d2=divideStringByTheNumOfTheChar(null);
        System.out.println(d2);

    } //String'deki character sayisini bulunuz, String'i integer'a ceviriniz, Integer'i character sayisina bolunuz.
    //1.Yol
    public static double divideStringByTheNumOfTheChar(String str) {
        double sonuc = 0;
        try {
            int length = str.length();
            int i = Integer.valueOf(str);
            sonuc = i / length;

        } catch (NullPointerException e) {
            System.out.println("null String ifadeleirn default degeridir ancak String olarak yazilamaz  " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return sonuc;
    }
    //*****Karsilasabilecegimiz muhtemel exceptionlar**********
    //NullPointerException: "null" String ile "length()" kullanildiginda alinir
    //NumberFormatException: Icinde rakamdan farkli character olan String'ler valueOf() ile kullanildiginda
    //ArithmeticException: Bolen sayi sifir oldugunda alinir

    public static double divideStringByTheNumOfTheChar2(String str) {
        int length=0;
        int i=0;
        double sonuc=0;
        try{
            length=str.length();
            i=Integer.valueOf(str);
            sonuc=i/length;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return sonuc;
    }
    //3.Yol
    public static double divideStringByTheNumOfTheCharacters(String str) {
        int length = 0;
        int i = 0;
        double sonuc = 0;
        try {

            length = str.length();//NullPointerException: "null" String ile "length()" kullanildiginda alinir
            i = Integer.valueOf(str);//NumberFormatException: Icinde rakamdan farkli character olan String'ler valueOf() ile kullanildiginda
            sonuc = i / length;//ArithmeticException: Bolen sayi sifir oldugunda alinir

        } catch (NullPointerException e) {
            System.out.println("NullPointer'a ozel...");
        } catch (Exception e) {
            System.out.println("Diger tum Exception'lar icin...");
        }
        return sonuc;
    }
    /*
    Note: 1)Aralarinda "parent-child" relationship olan Exception Class'lari multiple catch'lerde kullanmak isterseniz
                "child" olan once kullanilmalidir, aksi takdirde hata verir.
              2)Aralarinda "parent-child" relationship olmayan Exception Class'lari multiple catch'lerde kullanmak isterseniz
                siralamanin bir onemi yoktur.
     */
}
