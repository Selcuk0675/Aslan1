package day21accesmodifiersinharitance;

public class Animalrunner {

    public static void main(String[] args) {


        /*
           1)"inheritance" sayesinde;
               i) Code tekrarlarindan kurtuluruz
               ii)Code tamiri8maintenance) kolay olur
               iii)Child Classlari daha atomic oluruz
           2)Bir Classi baska bir Class in Child Class yapmak icin
           "extend" keyword kullanilir
           3)Child Class objejtleri Parent Class dan method ve variablelleri
            kullanabilirler
            4)    Parent Class objejtleri Child Class dan method ve variablelleri
            kullanamazlar
            5)Object Class her Classin Parent idir.
            6)Private method ve variable lar Child Class tarafindan kullanamazlar
            7)Protected method ve variable lar Child Class lar tarafindan kullanilabilir
            8)Default method ve variable lar ayni package de Child Class lar tarafindan kullanilabilir
            9)Public method ve variable lar Child Class lar tarafindan kullanilabilirler
            Note: Child Class lar tarafindan kullanilabilir olmak inherit edilebilirler demektir
            10)4 tip inheritance vardir
               i) Multilevel inheritance:Java bunu kabul eder
               iii)Multiple inheritance:Bir child a coklu parent Java doesnt support
               ii)Hierrchical inheritance:: bir parent icin coklu child java support
               iv)Single inheritance;Bir child icin bir Parent class demektir, Java support
         */
        Cat c1=new Cat();
        c1.eat();
        c1.meow();
        c1.drink();


        Dog d1=new Dog();
        d1.eat();
        d1.drink();
        d1.bark();





    }

}
