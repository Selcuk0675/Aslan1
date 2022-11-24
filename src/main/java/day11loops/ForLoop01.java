package day11loops;

public class ForLoop01 {
    public static void main(String[] args) {
        
        //Example 1:3 den 6 ya kadar tamsayilarin toplamini bulan kodu yaziniz
        int sum=0;// 0 etkisiz elemandır boylelikle ilk sayiyi degistirmemmis oluruz
        for (int i=3;i<7;i++){// burda her loop un sonucun u yazdirir
            sum=sum+i;          // ozel bi durum olmazsa bu kullanılmaz
            System.out.println("i = " + i);// burda sadece sonucu yazdirir
        }
        System.out.println("sum = " + sum);
        //Example 2: 6 dan 3 e kadar tamsayilarin carpimini yaziniz
        int carpim=1;
        for (int i=6;i>2;i--){
            carpim=carpim*i;

        }System.out.println(carpim);

        //Example 3:Size verilen bir tamsayinin rakamlari toplamini bulunuz
        int sayi=123;// - degerler icin bunu yapmamiz lazim
        sayi=Math.abs(sayi);
        int sonuc=0;
        for (int i=sayi;i>0;i=i/10){// int degeri inte bolersek sonuc tam sayıdır.java virgulden sonraki kismi sile
         
            sonuc=sonuc+i%10;// sondaki rakami ogrenmek icin %10 yapariz


        }
        System.out.println(sonuc);
        
        //Example 4:Size verilen bir Stringi ekrana ters cevirerek yazdiran kodu yaziniz
        String str="Java";
        String ters=" ";
        for (int i=str.length()-1; i>=0; i--) {
            
            ters=ters+str.charAt(i);
        }
        System.out.println("ters = " + ters);
    }
}
