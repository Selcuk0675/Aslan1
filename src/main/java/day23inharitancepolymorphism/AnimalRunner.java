package day23inharitancepolymorphism;

public class AnimalRunner {
    public static final int age=12;//12 bunun final degeridir degistirilemez

    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.eat();
        //age++; yapamayiz cunku final degeri 12dir
    }
}
