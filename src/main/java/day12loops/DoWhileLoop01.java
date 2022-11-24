package day12loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {
        int i=1;               //WhileLoop bazi durumlarda hic calismaya bilir
        // yani while loop icin "zero execution"mumkundur hic calistirimama ihtimali vardir
        while (i<1){
            System.out.println("while Loop");
            i++;
        }
        int k=1;         //Do While Loop kullandıgımızda loop body sindeki kod en az bi kez calisir yani zero executıon mumkun degildir
        do {               // yani kod en az br kere calisir
            System.out.println("Do While Loop");
            k++;
        }while (k<1);

        //Example 1:Bir ondalik sayinim ondalik kismindaki rakamlarinin toplamini bulnuz

        //           24.5673==>5+6+7+3=23
// not :split metodunu kullanmak icin mecbur yukaridaki double i stringe cevirmeliyiz
        double sayi=24.5673;// bunu splitle bolemeyiz
        String str=String.valueOf(sayi);//valueOf metodu double alip strıngın icine kor
        String decimalpart=str.split("\\.")[1];// note: splitte nereden keseceksek orayi soyleriz ondan sonra keser
                                              //mesala 5 ten sonra keseceksekregex 5 olur 5den sonraki rakamlar okunur
                                              // yani sayimiz 673 olur
        System.out.println(decimalpart);             // eger kesecegimiz ye nokta ise ozaman noktanin basina \\ koyariz
        int decimalint=Integer.valueOf(decimalpart);//5673 u integer e ceviriyoruz

        int sum = 0;
        do {
            sum=sum+decimalint%10;//bize rakamlari verecek   3  7  6  5

            decimalint=decimalint/10;// sayiyi kucultecek   567  56 5  0
        }while (decimalint>0);
        System.out.println(sum);

    }
}
