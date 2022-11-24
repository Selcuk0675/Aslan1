package day13loopsarrays;

import day04ifstatement.Scanner01;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {
        //Example 1:Kullanicidan bir sayi aliniz sayi 100 den kucuk ise ekrana kazandin yazdiriniz
        // aksi halde ekrana kaybettin yazdiriniz.
        // kullanici kazandikca oyun devama edecektir
        Scanner input=new Scanner(System.in);
      int sayi=0;// burada herhangi bir deger verebiliriz kullanıcı zaten bunu asagida if le degistirebiliyo
               do {
            System.out.println("lutfen bir sayi giriniz");// bunu yukari yazdigimizda sonsuz dongu veriyo
            sayi=input.nextInt();// buradaki inti yukarida oldugu icin sildik
            if (sayi<100){
                System.out.println("kazandin");
            }

        }while (sayi<100);
        System.out.println("kaybettin");
// normalde butun inc ve dec var onu biz kullanıcıya yaptırdık muhim olan inc vr dec in olmasi

        //Example 2:Kullanicidan isimler aliniz ilk harfinin buyuk harf olup olmadigini kontrol ediniz

        do {
            System.out.println("lutfen bir isim giriniz");
            char ch=input.next().charAt(0);
            if (ch>'A'&& ch<'Z'){
                System.out.println("tebrikler madalya takacagiz");
            }
            else System.out.println("yanlis secim yaptınız");
            break;// bu bizi loop un disina atar boylrelikle loop kirilir// egerrf kırmazsak sonsuz dongu olustutrur
        }while (true);

        //Infınıte Loop   sonsuz dongu  for (int i=1;i<4;i--){// artirma  azaltma kisminda hata yaparsak infinite loop sorunsali olusur
        ////            System.out.println("hi");
        ////        }
        ////        for (int i=1;i<4;){// artirma azaltma kismini yazmazsaniz infinite loop sorunsali olusur
        ////            System.out.println("hi");
        ////        }
        //
        //        int i=12;
        //        while (i<15){
        //            System.out.println("hi");// artirma azaltma kismini yazmazsaniz infinite loop sorunsali olusur
        //        }

    }
}
