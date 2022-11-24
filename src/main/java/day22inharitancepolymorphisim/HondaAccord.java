package day22inharitancepolymorphisim;

public class HondaAccord {
    /*
      1) siz class olusturdugunuzda java size otomatik olarak  size gorunmez bir consturactor verir.
        Cunku java Classin bir kalip oldugunu ve object olusturmak icin yaratildigini ve object olusturmak icin
        constructorin sart oldugunu bilir
        2)Javanin otomatik olarak olusturdugu bu gorunmez constructor a default constructordenir
         3) siz bir consturactor olusturdugunuzda Java default constructor i siler
         4)bir Classda birden fazla constructor olabilir.fakat bu constructorlarin parametreleri, farkli olmalidir
         59"this" keyword bu clşass demektir thiss.price demek bu class daki praice isimli variable demektir
         this.price syntx costructor larin icind ekullanilşr
         not:Constructor kullanarak variableler uzerinde yaptiginiz degisimler sadece object uzerindeki variablelerin degerlerini degistirir.
         Classs takilerin degerlrini degistiremez..


     */

    public  int price;// burda deger atanasi yapmadigimiz icin price nin degeri sifirdir
    public int year;
    public String make;
    public String model;

    public HondaAccord(){// gorunmez costuractor i gorunur yaptık
                         // Constructor bir ahcidir Obje olusturmaya yarar

    }
    public  HondaAccord(int  price){

        this.price = price;// bununla fiyatini bizim belirledigimiz HondaAccord olusturduk

    }
    public HondaAccord(int price,int year) {

        this.price = price;// bununla fiyatini bizim belirledigimiz HondaAccord olusturduk
        this.year = year;
        System.out.println("Honda Accord Constructor");
    }
    public HondaAccord(int price,int year,String Make,String Model) {
        this.price = price;
        this.year = year;
        this.make = Make;
        this.model = Model;

    }
}
