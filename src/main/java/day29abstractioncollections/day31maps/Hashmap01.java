package day29abstractioncollections.day31maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap01 {

    /*
    mapler; key-value structure'ini kullanirlar. mapler'de key kismi tekrarsiz (unique) data barindirir.
    value kismi ise; unique olmak zorunda degildir (non-unique). key kisminda "null" kullanilamaz. ancak value'larda
    "null" mumkundur.


     //metodun sol tarafina key, sag tarafina value denir.;Map ler key value kullanilir.
     //Maplar key value srtuctor ini kullanirlar.
     //Map lerde key kismi tekrarsiz data icerir(unique)
     // value kismi unique olmak zorunda degildir.
     //key lerde null kullanilamaz ama value lerde bu mumkundur.
     //value kisminda null kullanmak munknudur.
     //Null bir cok kere kullanilabilir.
     //coklu datalari depolarken ,bir tane deger depoluyorduk. Oysa burada iki deger var.(key,value)
      //  bu iki deger depolamaya entry demisler
      //mapler hakkinda konusurken eleman demeyin,map in 2 tane entry var deriz


       1)Map'ler key-value structure kullanir
2)Key'ler unique'dir
3)Value'lar tekrarli data icerebilir
4)Map'lerde eleman degil EntrySet kullaniriz.
5)Key'ler de  null tekrarsiz olarak kullanilir
6)Value'lar null kabul eder.
7)HashMap'ler EntrySet'leri herhangibir siralamaya tabi tutmaz, rastgele siralar
8)Siralama ile vakit jaybetmedigi icin HashMap'ler cok hizli calisirlar.
     */
    public static void main(String[] args) {
        HashMap<String,Integer> studentAges=new HashMap<>();
        studentAges.put("Ali",13);
        studentAges.put("tom",21);
        studentAges.put("Brad", 31);
        studentAges.put("Ajda", 83);
        studentAges.put("Cuneyt", 83);
        studentAges.put("Ali", 93);//Ani key degerini tekrar yazdigimizda hata vermez overWrite yapar yani ustune ekler deger kismini gunceller
        studentAges.put(null, 75);
        studentAges.put(null, 61);
        studentAges.put("Ayhan İsik", null);
        studentAges.put("Sadri İsik", null);
        System.out.println(studentAges);//{null=61, Ayhan İsik=null, tom=21, Ajda=83, Brad=31, Cuneyt=83, Sadri İsik=null, Ali=93}

        //Map ten sadece key ler nasil alinir
        //studentAges.keySet();// public Set<K> keySet() bize Set return ediyo

        Set<String> keys= studentAges.keySet();
        System.out.println(keys);//[null, Ayhan İsik, tom, Ajda, Brad, Cuneyt, Sadri İsik, Ali]

        //Map ten sadece value ler nasil alinir
        Collection<Integer> values= studentAges.values();
        System.out.println(values);//[61, null, 21, 83, 31, 83, null, 93]

        //Belli bir key'e ait value nasil aliniir
        Integer anyValue=studentAges.get("tom");
        System.out.println(anyValue);//21

        //Example1:tum integer yaslarin ortalamasini hesaplayn kodu yaziniz
        Collection<Integer> ortValue=studentAges.values();
       int sum=0;
       int counter=0;
        for (Integer w:values){
            if (w!=null){
                sum=sum+w;
                counter++;
            }
        }
        System.out.println(values);//[61, null, 21, 83, 31, 83, null, 93]
        System.out.println(sum/counter);//62
        System.out.println(keys);//[null, Ayhan İsik, tom, Ajda, Brad, Cuneyt, Sadri İsik, Ali]

        //Example 2:A ile baslamayan isimlerin icerdigi toplam karakter sayisini bulan kodu yaziniz
        Set<String> names=studentAges.keySet();
        int sum1=0;
      for (String w:names){
          if (w!=null&&w.startsWith("A")){
              sum1=sum1+w.length();
          }
      }
        System.out.println(sum1);//17
        //remove("Ajda",83); key si Ajda ve value su 76 olan EntrySet isiler ve size boolean return eder
       Boolean result= studentAges.remove("Ajda",83);
        System.out.println(result);//true

        Integer result2=studentAges.remove(null);//eger aradigimiz eleman yoksa bize null verir
        System.out.println(result2);//61

        //key varsa value ver yoksa mesaj ver
      Integer result3= studentAges.getOrDefault("Brad",0);//Buradaki 0 bizim verdigimiz deger
        System.out.println(result3);//31

        //Value null ise ekleme yapar null degilse ekleme yapmaz
        //Key yoksa ekleme yapar
        Integer result4=studentAges.putIfAbsent("Brad",1100);
        System.out.println(result4);//31

        //Key yoksa ekleme yapar.
        Integer result5=studentAges.putIfAbsent("Hasan cemal",123);
        System.out.println(result5);   //Key yoksa ekleme yapar.//null
        System.out.println(studentAges);//{Ayhan İsik=null, tom=21, Brad=31, Cuneyt=83, Hasan cemal=123, Sadri İsik=null, Ali=93}

        //replace methodu value leri degistirmek icin kullanilir
        studentAges.replace("Hasan cemal",35);//123 olan degeri 35 işle degistirdi
        System.out.println(studentAges);

        //Example 3:Map teki herbir entryi ekrana farkli bir satirda olacak sekilde yazdiriniz
        //entrySet() method'u Map'deki elemanlari bir Set'in icine koyarak size verir
        Set<Map.Entry<String,Integer>> entries =studentAges.entrySet();
        System.out.println(entries);

        for (Map.Entry<String,Integer> w:entries){
            System.out.println(w);

        }


    }
}

