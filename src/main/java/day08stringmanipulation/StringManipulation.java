package day08stringmanipulation;

public class StringManipulation {
    public static void main(String[] args) {

        // Example1: Bir Stringteki space haric kac tane karakter kullanıldıgını gosteren kodu yaziniz
        //           "Ali Okula gitti"==>14

        String str="Ali Okula gitti";
        int ch=str.replace(" ","").length();
        System.out.println(ch);//13

        //replace() methodu bir stringteki herhangi bir karakteri veya karakterleri degistirmik icin kullaanilir

        //Examle2:Bir Stringteki tum 'a' harflerini 'A' ya ceviriniz.
        
        String str2="ali ata bak";
        String nstr2=str2.replace("a","A");
        System.out.println("nstr2 = " + nstr2);

    }
}
