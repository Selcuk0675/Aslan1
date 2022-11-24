package day22inharitancepolymorphisim;

public class Runner {
    public static void main(String[] args) {


        //Inheritance de variableler secilirken java objenin data tipine bakar .
        // Oncelikle istedigimiz variableyi objenin data typ i olan class da arar.
        // o class da bulamazsa parent class abakar oradada bulamaza hata verir

        Cat cat1=new Cat();// DAta type=Cat
        System.out.println(cat1.a);//14  a yi secereken datat typine bakarak a yi secer
        System.out.println(cat1.b);// java cat1 objesini kullanarak bana b yi bul
                                   // java cat objesine gider bulamazsa mammals taki objeyi kullanir cevap:34
        System.out.println(cat1.c);// java cat1 objesini kullanarak bana c yi bul
                                   // java cat objesine gider bulamazsa mammals a ordada yoksa animal a gider cevap:45
        Mammal cat2=new Cat();//cat olusturuyoruz data type ni mamaml yapiyoruz yani tipi mememeli
        System.out.println(cat2.a);//13// burada mammal class ina gidip a yi alir

        Animal cat3=new Cat();//cat olusturuyoruz data type ni Animalaml yapiyoruz yani tipi Animal
        System.out.println(cat3.a);//12burada animal class ina gidip a yi alir


        //note inharitance de metodlar secilirken java consturactor a baka .
        // ,oncerlikle istedigimiz metodu kulanilan constractordan alir
        // o class ta bulamazsa parent classlara bakar oradada bulamazsa hata verir
        Cat cat4=new Cat();
        cat4.eat();//cats eat//burada metod kendisi ekrana yazdiriyo sout a gerek yok
        cat4.drink();//drink metod biz metod cagirdigimizda java hemen consturactor abakar burada constructor Cat()
        //mammals drink
        Mammal cat5=new Mammal();//burada new den sonra kulanılanlara consturacror denir
                                 //consturactorlarin isimleri variable yle ayni olmalidir
                                 // metodlarin void vardir constractorlarda yok

        cat5.eat();//mammals eat
        Animal cat6=new Animal();
        cat6.eat();//animals eat
                    //variableler secilirken java objenin data tipine bakar

                    //Objec olustururken data type Child Classlardan secilmez



        //===========================Constructor ile methodlar arasindaki farklar===========================
        /*
        public void eat(){                                  public Cat(){
        System.out.println("Animals eat")                  }
        }                                                  retun type yok
        method                                             Constructor
        vaid var                                            Void yok

         metot ismi bize baglidir                 Constructor ismi Class ismidir
          istedigimiz ismi verebiliriz                       Buyuk harfbaslar
          kucuk harfle baslar





         */



































    }
}
