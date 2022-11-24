package day28abstraction;

public class Bird extends Anima {
    @Override
    public void eat() {
        System.out.println("bird eat");
    }

    @Override
    public void move() {
        System.out.println("bird move");

    }
}
