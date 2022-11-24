package day28abstraction;

public class Dog extends Mammal {// //Parent abstract classinda abstract methodlar varsa
    //i)Child class iabstract yapmalisiniz  veya                        Biz burda child class i extend yerine override yaptik
    //ii)Parent class taki tum abstract classlari override etmeliyiz
    @Override
    public void eat() {
        System.out.println("Dog eat");

    }

    @Override
    public void move() {
        System.out.println("Dog move");

    }
}
