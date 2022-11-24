package day10stringmanupilation;

public class ForLoop01 {
    public static void main(String[] args) {
        // Example 1:Ekrana 5 kere "hi" yazdırınız.
        String str="hi";


        //Baslangic degeri /Loop hangi sartlar altinda calisacak / increment veya decrement
        for(int i=1        ;i<6                                   ;i++                  ){
            System.out.println(str);

        }
        System.out.println();
        //Example 2:Ekrana 4 ten 7 ye kadar tum tamsayilari ekrana yazdirin"
        for (int i=4;i<8;i++) {
            System.out.print(i +" ");
        }
        System.out.println();
        //Example 3:14 den 5 e kadar tum tamsayilari ekrana yazdirin
        for (int i=14;i>4;i--) {
            System.out.print(i +" ");
        }
        System.out.println();
        //Example 4:14 den 6 e kadar tum cift tamsayilari ekrana yazdiriniz
        for(int i=14; i>5;i--) {
            if (i%2==0){
                System.out.print(i +" ");
            }
        }
        System.out.println();
        //2.Way:
        for(int i=14;i>5;i=i-2){
            System.out.print(i +" ");
        }
        System.out.println();
        //Example 5:28 den 157 ye kadar tum tek tamsayilari ekrana yazdiriniz
        for (int i=28; i<158;i++){
            if (i%2!=0){
                System.out.print(i +" ");
            }
        }
        System.out.println();
        //Example 6:Java Stringini J*v*a*v* stringine cevirn kodu yaziniz
        String s="Java ";
        for (int i=0;i<4;i++){// burada index 0 dan basladigi icni i=0 dan baslattik
            System.out.print( s.charAt(i)+"*");//Stringte + yi koyarsak koncat eder
        }
        System.out.println();

        //Example 7:Size verilen bir Stringteki tekrarsiz karakterleri ekrana yaziniz
        String str2="Hellooo Ali";
        for (int i=0;i<str2.length();i++){
            char sonuc=str2.charAt(i);// bakkaldan 6 ekmek alan cocuk ornegi
            if (str2.indexOf( sonuc )==str2.lastIndexOf(sonuc)){
                System.out.print(sonuc);// He Ai // java space yi de tekrarsiz olarak gorur
            }
        }




    }
}
