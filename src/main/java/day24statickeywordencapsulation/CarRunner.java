package day24statickeywordencapsulation;

public class CarRunner {
    public static void main(String[] args) {
        Car car1=new Car();
        Car car2=new Car();
        Car car3=new Car();
        Car car4=new Car();

        System.out.println(car1.counter);//Static variablelere ulasmak icin objeleri kullanmak mumkun ama tavsiye edilmez bunun yerine;
        System.out.println(Car.counter);//Static variablelere ulasmak icin Class ismi kullanmak gerekir
        System.out.println(car1.price);

        System.out.println(Car.counter);
        System.out.println(car1.price);

        // Her new keywordu bir obje demektir
        //Static keyword Class a baglanmis Class elemanlaridir
        //Static eleman her objenin ortak elemanidir
        //Stati Class elemanlarina class uzerinden ulasilir
        //Staticler override edilmezler cunku ortak methodun degistirilmesine izin verilmez







    }
}
