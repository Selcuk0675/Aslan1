package day30collections;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {
      /*
       Deque:Double Ended Queue Manasindadir yani iki uclu Queue demektir.
       Fifo ve Lifo beraber gerektiginde kullanilir--> iki ıcı kullanilan boru
     */
      public static void main(String[] args) {
          Deque  furnitureTruck=new LinkedList();
          furnitureTruck.add("Chair");
          furnitureTruck.add("Mirror");
          furnitureTruck.add("Sofa");
          furnitureTruck.add("Bed");
          furnitureTruck.add("Bed");
          furnitureTruck.add("Bed");
          furnitureTruck.add("Dining Table");
          System.out.println(furnitureTruck);//[Chair, Mirror, Sofa, Bed, Bed, Bed, Dining Table]


          furnitureTruck.push("Refrigator");
          System.out.println(furnitureTruck);//[Refrigerator, Chair, Mirror, Sofa, Bed, Bed, Bed, Dining Table]

      }
}
