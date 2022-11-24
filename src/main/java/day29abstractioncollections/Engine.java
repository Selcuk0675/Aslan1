package day29abstractioncollections;

public interface Engine extends Vehicle {
    int price=1456;
   double weight =23.5;

   void run();
}
/*
    //Class-->Interface===>Imlement
    //Class-->Class==>extends
    //Interface-->Interface==>extends
    ////Interface-->Class==>Mumkun degil


    //interfacelerin icinde butun variableler otomatic olarak public tir.
    //interfacelerin icinde butun variableler otomatic olarak (default) finaldir.
    //interfacelerin icinde butun variableler otomatic olarak (default) statictir.

     *****************İnterwiew Sorusu******************
            Abstract class la interface nin farki nedir?
      1)Method;
           Abstract class hem abstract hem de concrete method lar icerebilir
           interface ler ise sadece abstract methodlar icerir
           Ama istersek interfaceler icinde default ve static keywordlar kullanarak
           concrete methodlar olusturabiliriz

       2))Variable
            "Abstract class" larda normal Class'lardaki gibi her turlu variable olusturulabilir
            "Interface" lerde ise variable'lar, public static ve final olmak zorundadir.

        3)Inheritance
              "Abstract class" lar class olduklari icin multiple inheritance'a musade etmezler
               "Interface"ler ise multiple inhertance 'ı destekler

         4)Object Creation
            "Abstract Class" larda constructor vardir ama object olusturmada kullanilmazlar.
            "Interface" lerde ise constructor olmadigindan object olusturulamaz.


         Soru: Object Oriented Programming Language prensipleri(principles) nelerdir?
         i)Inheritance   ii)Polymorphism   iii)Encapsulation   iv)Abstraction








 */
