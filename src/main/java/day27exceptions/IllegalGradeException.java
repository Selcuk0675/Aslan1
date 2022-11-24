package day27exceptions;

public class IllegalGradeException extends Exception {//Eger biz exception yaparsak onu child class yapıyoruz
                                                      //Eger Exception Class'a extend ederseniz sizin Class'iniz "Compile Time Exception" olur

    public IllegalGradeException(String message){//Constructer olusturduk
        super(message);//Boylelikle kendi compile time exception u olusturduk
    }
}
