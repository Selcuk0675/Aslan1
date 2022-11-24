package day29abstractioncollections.day31maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap02 {
         /*
   1)Siz "HashMap<String, Double> salaries = new HashMap<>();" kodu yazdığınızda Java memory'de 16 kutu(bucket) içeren bir yapı oluşturur ve
      bu yapıdaki her bir kutuya index verir. Index'ler 0'dan 15'e kadardır.
    2)Siz "salaries.put("QA", 110000.00);" kodunu yazdığınızda Java key için bir HashCode oluşturur, bu HashCode'u 15'e böler ve kalanı index olarak kullanır.
      Ve bu elemanı o index'e yerleştirir.
    3)Yerleştirirken 4'lü bir yapı oluşturur, bu yapının ilk bölümüne "HashCode"u ikinci bölümüne "Key"i, üçüncü bölümüne "Value" u ve dördüncü bölümüne
      "pointer"ı koyar. Bu çok bölümlü yapı LinkedList'lerdeki Node'dur. Yani HashMap, bucket'lara koyduğu data'yı LinkedList olarak depolar.
    4)Java "null" için hep HashCode olarak "zero" üretir, o yüzden key null olduğunda eleman ilk bucket'a yerleştirilir. Bundan dolayı key'si null olan
      elemanlar Map'in içinde genellikle ilk sırada gözükürler.
    5)Java normalde HashCode'ları unique yapar ama bazen trafik kazası gibi farklı iki eleman için aynı HashCode üretilebilir. Buna "HashCollision" denir.
      HashCollision meşhur bir Java development problemidir. Bu problemle karşılaşıldığında developer'lar bu problemi çözmek için kodlar yazarlar, ama bu
      Core Java'nın konusu değildir.
         */
         public static void main(String[] args) {
             HashMap<String,Double> salaries=new HashMap<>();
             salaries.put("QA",11000.00);
             salaries.put("Dev",130000.00);
             salaries.put("SalesForce",125000.00);
             System.out.println(salaries);//{QA=11000.0, SalesForce=125000.0, Dev=130000.0}
             Set<Map.Entry<String, Double>> newslry= salaries.entrySet();//burda map i seti n icine koydyk entrysetle
             for (Map.Entry<String, Double> w:newslry){//for la tektek ustunden gecip yazdirdik
                 System.out.println(w);

                 /*
                 QA=11000.0
                 SalesForce=125000.0
                  Dev=130000.0

                  */


             }

         }
}
