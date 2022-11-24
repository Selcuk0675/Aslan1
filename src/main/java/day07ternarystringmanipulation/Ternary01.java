package day07ternarystringmanipulation;

public class Ternary01 {
    public static void main(String[] args) {

        //Example1:Bir sayinin pozitif olup olmadıgını ekrana yazdıran kodu yaziniz

        //1.Way:if_else ile cozelim

        int sayi=25;

        if (sayi>0){
            System.out.println("pozitif sayi");
        }else {
            System.out.println("negatif");
        }
        //2.Way.Ternary

        String sayi1=sayi>0 ? "pozitif": "negatif";

        //condition   ? Condition dogru ise uygulanacak kod : Condition yanlis ise uygulanacak kod ;

        System.out.println(sayi1);

        //Example 2 : İki sayidan kucuk olani secen kodu yazin
        
        int a=15;
        int b=23;
        int nsayi=a<b ? a :b ;
        System.out.println("nsayi = " + nsayi);

        //Example3:verilen bir sayinin mutlak degerini hesaplayan kodu yazin
        //          Pozitif sayilarin ve 0 in mutlak degeri kendileridir.Negatif sayilarin -1 ile carpmasıdır
        
        int sayi3=-23;
         int nsayi3=sayi3>0 ? sayi3 : -1*sayi3;
        System.out.println("nsayi3 = " + nsayi3);

        //Examle4:İki tane sayi ayni isaretli ise bunlari carpıınız ,farkli ise "islem yapamam"mesaji veriniz
        
        int num1=8;
        int num2=9;
      //  int nnum=num2==num1 ? num2*num1 :"islem yapamam";// ternary farklı data typlarda sonuc return ederse sonucun data typınıu "Object " yapiniz
        Object nnum=num2==num1 ? num2*num1 :"islem yapamam";
        System.out.println("nnum = " + nnum);

    }
}
