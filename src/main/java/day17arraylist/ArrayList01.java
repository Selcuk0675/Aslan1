package day17arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {

        List<String> names=new ArrayList<String>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Tacettin");
        System.out.println(names);//[Tom, Thomas, Tahsin, Trump, Tacettin]

        List<String> cities = new ArrayList<String>();// asagidaki elemanlari yukaridaki listten cikarmak icin
        cities.add("Trump");                      // asdagidaki  listi olusturduk.removeAll metodunu kullandik
        cities.add("Tom");                        // removeAll kullanmak icin mutlaka list olmali
        cities.add("Tacettin");
        names.removeAll(cities);// names listinde  cities listini cikardik,yani sadece names listi degisti cities ayni kaldi
        System.out.println(names);//[Thomas, Tahsin]
        System.out.println(cities);//[Trump, Tom, Tacettin]

        List<String> myNames=new  ArrayList<String>();

        myNames.add("Thomas");
        myNames.add("Tahsin");

        boolean sonuc1=names.containsAll(myNames);// bir listin icinde coklu elemanin var olup olmadigini kontrol eder
                                                  // hepsi varsa true en az biri yoksa false kullanir
        System.out.println(sonuc1);//true

        List<String> a=new ArrayList<>();
        a.add("Shoes");
        a.add("Tv");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        //Example 1:a listinde "Shoes" elemaninin ilk gorunumunu siliniz
        a.remove("Shoes");// remove metodu ilk gorunumu siler
        System.out.println(a);//[Tv, Radio, Laptop, Shoes, Book, Shoes]
        //Example 2:a listinde "Shoes" elemanin tum gorunumunu silin

        List<String> silinecekler=new ArrayList<>();
        silinecekler.add("Shoes");
        a.removeAll(silinecekler);//removeAll metodu tum gorunumu siler bunun icin yeni bir list olusturmamaiz lazim yoksa hata verir
        System.out.println(a);//[Tv, Radio, Laptop, Book]

        //Example 3:Bir tane salary list olusturunuz eger salary 10000 den az ise %20 cok ise %10 zam yapiniz
        List<Double> salary=new ArrayList<>();
        salary.add(12345.50);
        salary.add(7895.25);
        salary.add(9999.89);
        salary.add(15457898.25);

        for (Double w : salary){
            if (w<10000){

                salary.set(salary.indexOf(w),w*1.2);// burada set metodu salary listine gider ,salary.indexOf(w) indexini bulup bunu ,w*1.2 ye cevirir

            }else {
                salary.set(salary.indexOf(w),w*1.1 );
            }


        }
        System.out.println(salary);//[13580.050000000001, 9474.3, 11999.867999999999, 1.7003688075000003E7]

        // iki arraylistin esit olmasi icin elemaanlar esit ve ayni index te olmali

        //Example 4:İKİ Arraylistin esit olup olmadigini anlatan kodu yaziniz
        List<Character> m=new ArrayList<>();
        m.add('A');
        m.add('B');
        m.add('C');
        m.add('D');

        List<Character> n=new ArrayList<>();
        n.add('A');
        n.add('B');
        n.add('C');
        n.add('D');

        int counter=0;
        for (int i=0; i<m.size(); i++){
            if (m.size()!=n.size()){   // size =length
                counter++;
                System.out.println("listler esit degildir");
                break;
            }else if (m.get(i)!=n.get(i)){// gfet metodu istenen bir index teki elemani alir
                counter++;
                System.out.println("listler esit degildir");
                break;
            }




        }if (counter==0){
            System.out.println("listler esittir");
        }

        //2.Yol:
        boolean esitmi=m.equals(n);
        if (esitmi){
            System.out.println("listler esit");
        }else System.out.println("listler esit degil");






     }
}
