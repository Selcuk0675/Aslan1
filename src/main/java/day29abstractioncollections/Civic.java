package day29abstractioncollections;

public class Civic implements Engine,Ac {//interface leri parent yapmak icin implements yapariz
                                         //Burda parent 2 tane :Engine,Ac
    @Override
    public void run() {
        System.out.println("Civics run well");

    }
}
/*
"abstract" methodlar sadece ne yapacagini soyler(what to do)
      "concrete" methodlar ne yapilacigi ile birlikte nasil yapilacagini (How to do) da soyler.

      "interface" ler bir yapilacak isler listesidir.(to do List)

      "multiple parent" intrface kullandiginizda ayni method ismi ile birden fazla method olusturursaniz
       bu methodlarin return type leri ayni olmalidir aksi taktirde hata verir

       interface" ler de constructor olmadigi icin  nterface" ler den object olusturulmaz.
       "abstract" class larda class olduklari icin constructor vardir.
       Ama constructorlar abstract class larda object olusturamazlar.
 */
