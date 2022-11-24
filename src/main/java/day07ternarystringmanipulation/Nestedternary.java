package day07ternarystringmanipulation;

public class Nestedternary {
    public static void main(String[] args) {

          /*
        Verilen yılın "leap year"  (artik yil) olup olmadigini kontrol eden kodu yazınız
        i) Yil 100 bolunurse 400 e bolunmelidir==>1600 artık yıldır 1800 artık yıl degildir
        ii)Yil 100 e bolunmezse 4 e bolunmelidir==>1996 artı yıldır   2001 degildir
         */
        int year=1601;

        String leap=year%100==0 ? (year%400==0 ? "leap year" :"leap year degil"):(year%4==0? "leap year" :"leap year degil" );
        System.out.println(leap);

        /*
            Asagıdaki kurallara gore passwordun gecerli olup olmadigini kontrol eden kodu yazınız
            i)sekiz karakterden fazla karakter veya 8 karakter varsa ilk harf 'i' olmalıdır
            ii)sekiz karakterden az karakter varsa ilk harfi'K' olmalidir

         */

        String pwd="iKLŞ457!";

        String npwd=pwd.length()>=8 ? (pwd.charAt(0)=='i' ? "gecerli" : "gecersiz"):(pwd.charAt(0)=='K'?"gecerli" : "gecersiz" );
        System.out.println(npwd);


    }
}
