package day25exception;

public class E03 {
    public static void main(String[] args) {
        String str="Ali";
        getNumOfChar(str);//3

        String str2="";
        getNumOfChar(str2);//0

        String str3=null;
        getNumOfChar(str3);//Exception verdi

    }
    //Bir Stringte bulunan karakterlerin sayisini bulanilmek icin bir method olusturunuz
    public static void getNumOfChar(String str){

        try {
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("length methodunda problem olustu");
            e.printStackTrace();//Bu method bize hatanin detayini gosterir.ve kod calismaya devam eder

        }



    }



}
