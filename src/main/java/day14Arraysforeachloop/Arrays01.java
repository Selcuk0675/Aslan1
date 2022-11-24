package day14Arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {
        //Note: Arrayslerin icne sadece primitive data typleri ve reference lar yerlestirilir
        String[] array = new String[3];
        array[0] = "java";
        array[1] = "did";
        array[2] = "surprısed you";
        System.out.println(Arrays.toString(array));
        //string bir array olusturunuz selcuk ve selcuktan onceki tum elemanlari ekrana yazdiriniz

        String  str[]={"Fatma","loves","selçuk","they","will","marry"};
        System.out.println(Arrays.toString(str));
        for (String w:str){
            System.out.println(w);
            if (w.equals("selçuk")){
                break;
            }
        }
        System.out.println();
        //Example 2://Yukaridaki streing icin selçuk ve fatma haric butun elemanlari yazdiriniz
        for (String w:str){
            if (w.equals("selçuk")||w.equals("Fatma")){
                continue;
            }
            System.out.println(w);
        }
        System.out.println();
        //Example 3:Kullaniciyla beraber Array olusturunuzve icine data yerlestiriniz
        //Bir ogtertmenin sınıfındaki ogrencilerin isimlerini bir aplication a yuklemesini saglayan kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksiniz");//Arraylarda sayi belirtilmeli
        int numOfStd=input.nextInt();
        String names[]=new String[numOfStd];
        System.out.println("girisi sonlandirmak icin q harfine basiniz");
        for (int i=1;i<=numOfStd;i++){// burada daha array yok arrayi yeni olusturuyoruz onun icn for each loop kullanmadik

            System.out.println("lutfen "+i+".ogrenci ismini giriniz");
            String stdName=input.next();// kullanicidan aldigimiz data yi memorye oradan asagida array a koyuyoruz
            names[i-1]=stdName;;// burada index sifir olacagi icin -1 yapti
            // names arrayındeki index0 a sdt name koyu
            if (stdName.equalsIgnoreCase("q")){
                break;
            }

        }
        System.out.println(Arrays.toString(names));




    }
}
