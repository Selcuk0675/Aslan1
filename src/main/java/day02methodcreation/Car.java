package day02methodcreation;

public class Car {



        String marka = "honda";
        int fiyat = 20000;
        void hareketEt () {
            System.out.println("Honda güzel hareket ede");
        }
        void dur () {
            System.out.println("Honda güzel durur");
        }

    public static void main(String[] args) {


        Car myHonda = new Car();


        System.out.println(myHonda.fiyat);
        System.out.println(myHonda.marka);
        myHonda.hareketEt();
myHonda.dur();

    }
    }




