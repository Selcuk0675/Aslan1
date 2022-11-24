package day25exception;

public class E01 {
    /*
    1) Exception:Javada kodlarimizi calistirirkrn beklenmedik hata durumlaridir
    2)Exceptionlarla calismanin iki yolu vardir
      a)try-catch kullanma exception olussa bile calismaya devam etmektir
      b)throw exception:calismayi durdurma(mesela yazdigimiz kod geregi bir dosya uzerinden bir okuma yapmammiz gerekiyor ise
       bu dosyamiz eger silinmis ise java dosyayi bulamaz ve uygulamanin devam etmesi gerekmez)
     3)Eger exception i handle etmezsek jav calismayi durdurur
     4)try-catch kullanirken try kodunu bir yada birden fazla catch ile birlikte kullanabiliriz
     5)ry olmazsa catch kullnilmaz
     6)eger yazdigimiz kod esnasind hata olabilecegini dusundugumuz kodu try-catch icinee oymaliyiz
     7)catch blok icerisine olmasi muhtemel exception class ismi yazilmalidir
     8)e.getmassage() methodunu kullanarak teknik mesajlşar elde edebiliriz
      sout un icine yazmis oldugumuz mesajlar bizim teknik olmayan aciklamalarimizdr
       e.printStackTrace(); methodu exceptionlarla ilgili detayli mesajlar verir.kod calismaya devam eder
       System.err.println(); hata mesajini renkli olarak verir bu sayede consolda diger mesajlardan ayirmak icin kullaniriz
     9)Eger try body icindeki kod sorunsuz calisirsa catch block devreye girmez



     */





    public static void main(String[] args) {

        divide(9,3);//3
        divide(0,2);//0
        divide(5,0);//Exception verir
        divide2(7,0);

    }//Bolme methodu olusturalim
    //1.Yol
    public static void divide(int a,int b){//yukrida main method oldugu icin static oldugu icin burayi da static yaptik
        if (b==0){
            System.out.println("bir sayi o ile bolunemez");
        }else

        System.out.println(a/b);////bunu yukarida calistiracaz main in icinde

    }//2.yol
    public static void divide2(int a,int b){
        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("bolme isleminde bir hata olustu");
        }
        //Java mtematik ile ilgili karsilasilmasi muhtemel tum istisnalari "ArithmeticEzception Class ina koymustur
        //Matematik tekki tum istisnalari bilmek zorunda degiliz


    }

}
