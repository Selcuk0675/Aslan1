package day29abstractioncollections;

public class LinkedListAciklama {
    /*
      /*

           Collection: birden fazla datanın depolanması.
           Array ilkel bu yüzden collectionlara dahil değil.
           List'ler collection'lara dahil.

           Collection diyince bunlar aklınıza gelmeli:
           1)List  i)ArrayList ii)LinkedList
           2)Set
           3)Queue

          >List'lere çoklu ve tekrarlı data depolamak istediğimizde ihtiyaç duyarız, Ör:bir okuldaki öğrenci isimleri.
          >>Set'lere çoklu ama tekrarsız data depolamak istersek ihtiyaç duyarız, Ör: bir okuldaki öğrenci ID'leri.
          --Set ve List'i amacına göre kullanın.
          >>>Queue'lara FIFO(first in first out) veya LIFO(last in firts out) gerektiğinde Queue kullanılır, Ör: bankadaki günlük müşteriler.

     */

    /*
     NOTE: LinkedList eleman ekleme ve eleman silmede cok basarilidir.
     Bu yuzden eleman ekleme ve eleman silme islemlerini cokca yapacaginiz durumlarda LinkedList kullanmalisiniz.

     NOTE: ArrayList eleman bulma işlemlerinde (search) çok başarılıdır. cunku indexlerei vardir
     Ancak  LinkedList eleman bulma (search) işlemlerinde başarısızdır.

     ==> Çok fazla arama işlemi yapılacağında "ArrayList" kullanmalısınız.
     ==> Çok fazla eleman ekleme işlemi yapılacaksa "LinkedList" kullanmalısınız.
     */

    /*
    1)LinkedList'deki her eleman iki bölümden oluşur. i)Data ii)Pointer
2)LinkedList'deki her bir eleman "Node" olarak adlandırılır.
3)LinkedList'ler eleman ekleme ve eleman silme işlemlerinde çok başarılıdırlar.
4)LinkedList'ler eleman arama işlemlerinde başarısızdırlar.
5)3. ve 4. maddelerden dolayı eleman ekleme ve eleman silme işlemlerinin çok yapılacağı durumlarda LinkedList kullanılmalıdır.
6)ArrayList'ler index kullanır LinkedList'ler index kullanmaz.
7)index kullanmak eleman bulma işlemlerinde çok başarılıdır, bu yüzden eleman bulma işlemlerini çok yapacaksanız ArrayList kullanmalısınız.
     */
}

