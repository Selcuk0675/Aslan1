package day26exception;

public class Exception01 {
    public static void main(String[] args) {
        String str="123";
        int result= ConvertStringToInteger(str);
        System.out.println(result+10);

        String str2="1a2b";
        int result2=ConvertStringToInteger(str2);//NumberFormatException
        System.out.println(result2+15);
        //Note:Eger icinde rakamdan farkli bir karakter barindiran bir Stringi
        //valueOf()  kullanarak Integer a cevirmek isterseniz NumberFormatException exception verir

    }//Stringi alip int e ceviren kod yaziniz
    public static int ConvertStringToInteger(String str){

        try {//Herhangi bir satirda exception atilirsa java direk catch bolumune gfecer try icindeki sonraki kodlari calistirmaz
            int i=Integer.valueOf(str); //valueOf(str):Bu method Stringi int e cevirir
            //Burada returntype integer olacak cunku burd stringi int e cevirecez elimizde int bulunsun
            System.out.println("Burasi try bolumu");
            return i;
        }catch (NumberFormatException e){
            System.out.println("String ifadeleri Integere cevirirken harfler rakama donusmez");
        }


        return 0;
       //return type burda void den farkliysa burda return yazmak zorundayiz
        // return Integer.valueOf(str);//return type void degilse burayi yaziyoruz
        //Burasi bize str yi integer a ceviririz
    }
}
