package day28abstraction;

public class Cat extends Mammal {
    @Override
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public void move() {
        System.out.println("Cats move");

    }
      /*
        Bir method parent classta abstract class ise
        Child class o methodu override edip kullanmak zorundadir
        Bu yuzden child class icin bi fonksiyonu  zorunlu yapmak istersek onu abstract yapariz
     */
}
