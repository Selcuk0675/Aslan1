package day23inharitancepolymorphism;

public class Cat extends Mammal{
    public void meow(){
        System.out.println("meow");
    }// Cat in icine Moew methodu koyuyoruz

    @Override//Bu annotationu kullanarak ,Javanin yaptigimiz Override islemini kontrol etmesini saglariz
    public void eat() {
        // super.eat();//Parenta git eat i kullan  bunu s,lecez Parentteki eati degistirip yazizyoruz
        System.out.println( "cats eat");
        // public void eat(){
        //        System.out.println("Animals eat");
        //    } parent class taki bu metodu "Animals eat" bunu  "cats eat" olarak degistirdik buna override denir

    }
    /*
   1) Override yaparken metodun body si degistirebiliriz" Cts eat"
   2) Override yaparken ASLa method signature(isim ve parametre) degistirilemez
   3)Override yaparken "inheritance" olmak zorundadir.
   4)Override yaparken access modifier ler belli kurallara gore farklilastirilabilirler
      i)private methodlar override yapilamaz
      ii)Child Classstaki override edilen methodun access modifier i;
       parent classtaki methodun access modifieri( public default protected,private) ile ayni veya genis olmalidir
       Note:Child Classtaki methodun access modifier!i daha dar olamaz
     iii)Default methodlar ayni package icindeyse override edilebilirler
   5)Parent Classtaki methodun return typ(int,boolean,long ,short.....) i void se return type degiştirilemez
   6)Parent Classtaki methodun return typ i primitive ise return type degistirilemez
   7)Parent Classtaki methodun return typ i Wrapper Class ise return type degistirilemez
   8)Parent Classtaki methodun return typ i Parent Class ise return type Child 'lardan biri olabilir
     note:Child Class daki return type parent classtakinden geniş olamaz
     note:Aralarinda parent child iliskisi olmayan Classlar Overriding de return type degisiminde kullanilamazlar
     mesela Short Integer dan kucuktur fakat aralarinda parent child ilisklisiolmadiginda
     Integer yerine Short kullanamazsiniz
     Note:Child deki methodun return type ndan par5enttaki methodun return typena gidiste
     IS _A relationship olmali
     Note: Aralarinda IS A relotionship olan data lara covariant denir
   10)Final methodlar override edilemezler cunku overrriding de method body deistirilir fakat final
   11)Polymorphisim= Overelaading+Overriding
      note: Polymorphisim nedir derlerse overoadin ve ovrriding i anlatin
   12:Overloading ile overriding arasindaki farklar nedir
      i)Overloading icin inheritance gerekez fakat overrriding icin gerekir
        overloadin tek bir classin icinde oldugu icin inharitance gerekmez
      ii)private methodlar Overload edilebilirler,Override  edilemez
      iii)"final" methodlar overload edilebilirler,Overridee ler edilemez
      iv)Overloading static polymorphisim,Overriding dynamic polymorphisim olaraka adlandirilir
      cunku static methodlar overload edilir ,override edilemezler
       v)Overloading de method signature degisir,Overriding te method signature ye dokunulmaz





 */
}
