package day24statickeywordencapsulation;

public class StudentRunner {
    public static void main(String[] args) {
        Student std1=new Student();//Student class taki variabledlere ulasmak icin obje olusturdum

        System.out.println(std1.getStdId());//SU123456           Normalde sdtıd private oldugu icin goremiyorduk
        System.out.println(std1.isMaried());//false              bunu getter olusturarak baska classtan okuduk getter i da bulundugu Classtan olusturduk
        System.out.println(std1.getGpa());//3.8


        std1.setGpa(4.0);
        System.out.println(std1.getGpa());//4,0 //set ile 3,8 olan gp yi 4,0

        std1.setStdId("AB");                  // brnim verdigim AB yi StdId ile degiştirdik
        System.out.println(std1.getStdId());//AB


        Student std2=new Student();
        //Olusturdujugumuz bu yeni objeyle classin yeni bir kopyasini olusturduk
        // yani yukarıda yaptigiimiz degişiklikler olmayacak
        // gpa=3,8 olacak

        System.out.println(std2.getStdId());//SU123456
        //Note : yaptigfimiz butun işlemeler burda obje iCİNndedir classta degişiklik olmaz
        // objeler class larin kopyasidir.Degişimler objede olur classta degil
        //Std1==>Obje       Student==>Class
        //Objeyi biz olusturuyoruz     Student std1=new Student()











    }
}
