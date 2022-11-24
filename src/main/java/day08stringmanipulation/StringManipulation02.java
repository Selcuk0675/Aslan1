package day08stringmanipulation;

public class StringManipulation02 {
    public static void main(String[] args) {


        // Example1: Bir Stringteki space haric kac tane karakter kullanıldıgını gosteren kodu yaziniz
        //           "Ali Okula gitti"==>14

        String cumle="Ali Okula gitti";
         int ncumle=cumle.replace(" ","").length();
        System.out.println("ncumle = " + ncumle);

        //replace() methodu bir stringteki herhangi bir karakteri veya karakterleri degistirmik icin kullaanilir

        //Examle2:Bir Stringteki tum 'a' harflerini 'A' ya ceviriniz.

        String str2="ali ata bak";
        String nstr2=str2.replace("a","A");
        System.out.println("nstr2 = " + nstr2);

        //Example3:Bir Stringteki kara kelimesinin yerine * koyunuz
        
        String cumle2="ankaranın tasına gozlerimin yasına bak";
        String ncumle2=cumle2.replace("kara","*");
        System.out.println("ncumle2 = " + ncumle2);

        //Examle4:Bir Stringteki tum sayilari yıldiza ceviriniz
        //        AC20217899"==>AC*********
        
        String cumle3="AC20217899";
        String ncumle3=cumle3.replaceAll("[0-9]","*");
        System.out.println("ncumle3 = " + ncumle3);

        //bir grup datayi ifade eden kodlara regex=regular expressions  denir
        // 1) tum rakamlar==>[0-9]
        // 2) ]tum kucuk harfler==>[a-z]
        // 3)]tum buyuk harfler==>[A-Z]
        // 4) tum harfler==>[a-zA-Z]
        // 5) sesli hjarfler ==>[aeiouAEIOU]
        //SPACE==>[  ]
        //tum rakamlar ve tuım harfler==[0-9a-zA-Z]
        //tum noktalam isaretleri==>//p{Punct}

        //Example5:
        // Verilen bir string de kulanılan noktalama isareti ve rakamlar ve space karakteri haric,tum karakterlrin sayisini bulan kod yaziniz

        String cumle4="if you want you must believe and never give up 12345!^";
        int ncumle4=cumle4.replaceAll("[0-9]","").
                replace(" ","").
                replace("\\p{Punct","").
                length();
        System.out.println("ncumle4 = " + ncumle4);

        //Rakamlar haricc tum karakterler==>[^0-9]
        // Kucuk harfler haric tum karakterler[^a-z]
        //Kucuk harfler haric tum karakterle[^A-Z]
        //ucuk harfler haric tum karakterle[^a-zA-Z]
        //ucuk harfler haric tum karakterle[^  ]

        //Example6:Bir Passwordun gecerli olup olmadigini asagidaki kuallara gore test eden kodu yazızı
        //1. kural) space haric enaz sekiz karakter olmali
        // 2.kural) en az 1 sembol icermeli
        // 3.kural9)en az 1 rakam icermeli
        // 4.kural9)en az 1 buyuk harf icermeli
        // 5.kural9)en az 1 kucuk HARF icermeli

        String pwd="ASd123!^^";
        //1. kural) space haric enaz sekiz karakter olmali
        boolean first=pwd.replace(" ","").length()>=8;
        // 2.kural) en az 1 sembol icermeli
        boolean second=pwd.replaceAll("[0-9a-zA-Z]","").length()>0;
        // 3.kural9)en az 1 rakam icermeli
        boolean third=pwd.replaceAll("[^0-9]","").length()>0;
        // 4.kural9)en az 1 buyuk harf icermeli
        boolean fourth=pwd.replaceAll("[^A-Z]","").length()>0;
        // 5.kural9)en az 1 kucuk HARF icermeli
        boolean fifth=pwd.replaceAll("[^a-z]","").length()>0;

        if (first&&second&&third&&fourth&&fifth==true){
            System.out.println("gecerli password");

        }else {
            System.out.println("gecersiz password");
        }

        //Example8:Verilen bir string "AL" ile basliyor x ile bitiyorsa ekrana "Harika" yazdirin aksi halde normal yazdirin

        String str="ALkgm46x";
        boolean baslangic=str.startsWith("AL");
        boolean son=str.endsWith("x");
        String str1=baslangic&&son ? "harika":"normal";
        System.out.println("str1 = " + str1);

        //Example7:Bir stringteki noktalama isaretlerini  sayisini  gosteren kodu yaziniz

        String cumle5="Sen yapmazsan ,ben yapmazsam,o yapmazsa kim yapacak?...";
        int number=   cumle.replaceAll("[^\\p{Punct}]","").length();

        System.out.println(number);


    }
}
