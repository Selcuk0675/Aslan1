package day28abstraction;

public class Accord implements Engine,Aci,Hood{
    /*
         Atomic olsun diye “parent”i parcaladim
        ama bir “Child Class” in birden fazla “parent” i oldu
        bu ise Java’da mumkun degildir.
        Cunku Java “multiple Inheritance” i desteklemez.

        “multiple inheritance” class’larda mumkun degildir
         fakat Java “interface” isimli yeni bir yapi olusturdu
         bu yapida “multiple inheritance” a musaade etti.
     */
    public void eco(){
        System.out.println("Uses eco engine");
    }

    @Override
    public void gas() {
        System.out.println("Uses gas");

    }

    @Override
    public void tsi() {
        System.out.println("Uses tsi");

    }

    @Override
    public void digital() {

    }

    @Override
    public void climate() {
        System.out.println("Uses digitalAci");
    }

    @Override
    public void steel() {

    }
}
