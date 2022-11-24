package day04ifstatement;

public class ifStatement01 {
    public static void main(String[] args) {

        int s = 1212;
        if (s > 0) {

            System.out.println("pozitif");

            //Example2:Verilen karakter buyuk harf ise ekrana"Büyük Harf yazdırın"

            char ch = 'A';
            if (ch >= 'A' && ch <= 'Z') ;
            System.out.println("Buyuk Harf");

            // && islemi sadece boolean ile kullanılır.
            // && işlemi hata kabul etmez true almanın tek yolu hepsının true olmasıdır
            // Examler3: Verilen sayı uc basamaklı ise ekrana Uc basamaklı yazdırın

            int sayi = 123;
            sayi = Math.abs(sayi);//Math.abs:Javada mutlak degeri ifaDE eder."+","-" de olsa aynı sonucu verir

            if (sayi > 99 && sayi < 1000) ;
            System.out.println("Uc basamaklı");

            //example4:Verilen bir sayı çift sayı ise ekrana çift sayi yazdırınız

            int sayi2 = 250;
            sayi2 = Math.abs(sayi2);
            if (sayi2 % 2 == 0) ;
            System.out.println("Cift Sayi");

            //"="oporotoru atama operatorudur matematikteki esit anlamına gelmez onun yerıne Java da == esıttır

            // Example5:Verilen sayı 300 den kucuk veya 1200den buyuk ıse ekrana" Harıka Sayı" yazdırın

            int sayi3 = 1500;
            if (sayi3 < 300 || sayi3 > 1200) ;
            System.out.println("Harika Sayi");

        }

    }


}
