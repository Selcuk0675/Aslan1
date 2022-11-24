package day28abstraction;

public abstract class Anima {
    //Body si olmayan methodlara  abstract method denir
    //Bir methodu abstract yapmak icin 1)Method body sil 2)abstract keywor kullan
    //Abstract methodlar abstract class icinde olmalidir
    public abstract void eat();

    //abstract class larda hem abstract hem de concrete method kullanilabilir

    public static void drink() {
        System.out.println("Animal Drink");////cocrete method

    }//abstract move method olusturun
    public abstract void move();

}