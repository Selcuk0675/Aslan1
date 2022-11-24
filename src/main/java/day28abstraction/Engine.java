package day28abstraction;

public interface Engine {
    /*    ***İnterface***
       1) İnterface lerde ki tum methodlar abstract olmak zorundadir body koyamayiz
       2)İnterface lerde abstract method olusturuken abstrac keywordu kullanmaya gerek yok
        yazmasanda olur.Cunku java bunun abstract oldugunu bilir
       3)İnterfacelerdeki tum methodlar otomatik olarak Java tarafindan public kabul edilir
          *O yuzden o methodlar icin public yazmaya gerek yok yazmasanda olur
          *public abstract void eco();==>void eco();ayni anlamdadirlar

        4)İnterfacelerdeki tum methodlar abstract oldugundan interfacelere fully abstraction denir
        5)Abstract classlarda abstrac method ve concrete methot bir arada kullanildigi icin
          Abstract classlara fully abstraction denmez.yarim abstract denir
     */
    void eco();
    void gas();
    void tsi();

    //default keyword kullanarak interfacelerin icinde body si olan methodlar uretebilirsiniz
    //Asagidaki non-static methoddur
    public default int add(int a, int b){
        return a+b;
    }//NORMALDE SİKAYET EDER AMA BİZ  default KOYDUGUMUZ İCİN BUNU YAPBİLİİRİZ
    //static keyword kullanarak interfacelerin icinde body si olan methodlar uretebilirsiniz
    //Asagidaki static methoddur
    public static String update(String str){
        return str+"!";
    }
}
