package day29abstractioncollections;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {
        LinkedList<String>visitors=new LinkedList<>();
        visitors.add("tom");
        visitors.add("Hanks");
        visitors.add("tom hanks");
        visitors.add("Brad");
        visitors.add("Pitt");
        visitors.add("Brad Pitt");
        System.out.println(visitors);//[tom, Hanks, tom hanks, Brad, Pitt, Brad Pitt]
        visitors.add(2, "Angelina julie");
        visitors.add("Brad Pitt");
        visitors.add("tom hanks");

        System.out.println(visitors);//[tom, Hanks, Angelina julie, tom hanks, Brad, Pitt, Brad Pitt]

        //Linkedlist ler ekleme ve silme de basarili olduklari icin bununla ilgili cok fazla method var
        visitors.addLast("Ajda Pekkan");
        visitors.addFirst("Cuneyt Arkin");
        System.out.println(visitors);//[Cuneyt Arkin, tom, Hanks, Angelina julie, tom hanks, Brad, Pitt, Brad Pitt, Ajda Pekkan]

        visitors.removeLast();
        System.out.println(visitors);

        visitors.removeFirst();
        System.out.println(visitors);

        visitors.removeFirstOccurrence("tom hanks");
        System.out.println(visitors);//[tom, Hanks, Angelina julie, Brad, Pitt, Brad Pitt, Brad Pitt, tom hanks]

        visitors.removeLastOccurrence("Brad Pitt");
        System.out.println(visitors);//[tom, Hanks, Angelina julie, Brad, Pitt, Brad Pitt, tom hanks]

        visitors.pop();//===>visitors.removeFirst(); Cut--paste
        System.out.println(visitors);//[Hanks, Angelina julie, Brad, Pitt, Brad Pitt, tom hanks]

        LinkedList<String> myList = new LinkedList<>();
        //myList.pop(); NoSuchElementException atti cunku Linkedlist bos



    }
}
