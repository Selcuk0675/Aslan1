package day30collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
     /*
       LinkedHashSet'ler elemanlari ekleme sirasina (İnsertion Order) gore yerlestirirler
       LinkedHashSet elemanlari siralamada zaman harcadiği icin HashSet'lere gore yavas calisir
      */
     public static void main(String[] args) {
         LinkedHashSet<String> emails=new LinkedHashSet<>();
         emails.add("abc@gmail.com");
         emails.add("bca@gmail.com");
         emails.add("klm@gmail.com");
         emails.add("tafo@gmail.com");
         emails.add("fgh@gmail.com");
         System.out.println(emails);//[abc@gmail.com, bca@gmail.com, klm@gmail.com, tafo@gmail.com, fgh@gmail.com]
     }
}
