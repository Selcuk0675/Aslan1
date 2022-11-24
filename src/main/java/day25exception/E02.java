package day25exception;

public class E02 {
    public static void main(String[] args) {
        String arr []={"Ali","Can","Veli","Han"};
        getElementFromArray(arr,2);//veli
        getElementFromArray(arr,0);//Ali
        getElementFromArray(arr,4);//Hata verir cunku benim indexim 0 dan baslayip 3 te bitiyuo



    }
    //Bir String Arraydan index girerek eleman elde edebilmek icin bir method olusturunuz
    public static void getElementFromArray(String arr[],int idx){
        try {
            System.out.println(arr[idx]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index te bir problem olustu======>"+e.getMessage());//Array index te bir problem olustu======>Index 4 out of bounds for length 4
            e.printStackTrace();
            System.err.println("bu method hata mesajidir konsolda renkl olur");
        }

    }
}
