package day24statickeywordencapsulation;

public class Car {

    public static String make="Honda";
    public String model="Accord";
    public int price=20000;
    public static int counter=0;
    //Degisiklik yaptigimizda butun objeler etkileniyosa buna static denir
    // yaptıgımız objenin sadece bi tanesinin gormesini istiyorsak non_static deriz

    public Car(){
        counter++;
        price++;
    }









}
