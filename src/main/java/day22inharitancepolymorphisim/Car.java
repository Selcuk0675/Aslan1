package day22inharitancepolymorphisim;

public class Car extends Vehicle{
    public String color;
    public int km;
    public Car(){

    }
    public Car(String color,int km){
        super();
        this.color=color;
        this.km=km;
        System.out.println("Car Constructor");
    }
}
