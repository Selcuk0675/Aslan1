package day22inharitancepolymorphisim;

public class Mammal extends Animal{
    public int a=13;
    public int b=34;
    public void eat(){
        System.out.println("mammals eat");

    }
    public  void drink(){
        System.out.println("mammals drink");
    }
    public Mammal(){
        System.out.println("mammals");
    }
}
