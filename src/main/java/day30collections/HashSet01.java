package day30collections;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {
           /*HashSet
             **tekrarsiz elemanlarda ,siralama onemli degil ,hiz onemli,index kullanmazlar
             ama biz index kullaniyormus gibi yapariz
             o bizim ne kastettigimizi anlar arkada isini halleder
             *
             Hash bir tekniktir,birbirine benzemeyen codlar üretir
             bu kodlar data yi unique yapar.
             *
             Set'lere,çoklu ama tekrarsız data depolamak
             istediğimizde ihtiyaç duyarız.(öğrenci numaraları gibi)

             HashSetler eklenen elemanlarin siralamasiyla ugrasmaz.
             Bu yuzden cok hizli calisir

             HashSetler index kullanmazlar
             cunku siralama rastgele yapildigi icin index manali olmaz
         */
        HashSet<String> emails=new HashSet<>();
        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        System.out.println(emails);//[Apple, Fig, Mango, Apricot, Orange]
        //Burda random order (rastgele siralama yapti)

        emails.add("Mango"); //Setlere ayni elemani ekledigimizde hata vermez .
        System.out.println(emails);// var olaninn ustune ekler(Overwrite)


        emails.add(null);
        emails.add(null);
        emails.add(null);
        System.out.println(emails);//[null, Apple, Fig, Mango, Apricot, Orange]






    }
}
