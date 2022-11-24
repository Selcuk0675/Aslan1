package day23inharitancepolymorphism;

public class Math extends Courses{
    public void practice(){
        System.out.println("Solve questions");
    }
    public Math(){// constructor olusturma acsesmodifier+Class ismi
        //super("second");
        System.out.println("Constructor1");
    }
    public Math(int a){// burda ikisini de ayni yapmamak icin parantezin icine int a parametresi koyduk
        //this();//Ayniğ classin icinde diger constructor i kullan
        // parante icine yukaridakinden bisey olmadigi icin bizdfe bisey yazmadik
        System.out.println("Constructor2");

    }
}
