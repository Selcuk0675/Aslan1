package day30collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {
    public static void main(String[] args) {

/*
        İlk giren elemanı ilk kullanmanız(First In First Out ==> FIFO)
        gerektiğinde Queue en iyi seçimdir.
        Queue'da elemanlar "insertion order" a göre dizilirler.
        Queue'da pop(), peek(), poll(), element(), remove() gibi ilk elemanı
        ilgilendiren birçok method vardır
        offer() method'u kapasite kontrolu yapildiktan sonra
        eleman ekleme durumlarinda kullanilir.
 */
        Queue<String> wareHouse=new LinkedList<>();//LinkedList in constructur ini kullaniyoruz
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Honey");
        wareHouse.add("Tomatoes");
        System.out.println(wareHouse);

         /*  OFFER
                 Inserts the specified element into this queue
                  if it is possible to do so immediately without violating capacity restrictions.
                   When using a capacity-restricted queue, this method is generally preferable to add,
                   which can fail to insert an element only by throwing an exception.
                 Params:
                 e – the element to add
                 Returns:
                true if the element was added to this queue, else false
                Throws:
                ClassCastException – if the class of the specified element prevents it from being added to this queue
                 NullPointerException – if the specified element is null and this queue does not permit null elements
                  IllegalArgumentException – if some property of this element prevents it from being added to this queue

         */
        wareHouse.offer("Potatoes");
        System.out.println(wareHouse);//[Milk, Meat, Bread, Honey, Tomatoes, Potatoes]





    }
}
