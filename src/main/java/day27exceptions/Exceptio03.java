package day27exceptions;

public class Exceptio03 {
    /*
    1)Java  exceptionlar olusturarak Developerlarin Java kurallarina uymalarini temin etmistir
    2)Bizde aplication uretirken kendi exceptionlarimizi olusturarrk diger developerlarin bizim ortaya koydugumuz
    kurallara uymalarini temin edereiz
    3)Javanin degil  bizim urettigimiz Exceptionlara Custom Exception denir
    4)Custom Exceptionlar da RuntimeException ve CompiletimeException olabilir.
    5)Custom "RuntimeException" üretmek için "extends RuntimeException" deriz.
    6)Custom "CompileTimeException" üretmek için "extends Exception" deriz
   */
    public static void main(String[] args) throws IllegalGradeException {
        // IllegalGradeException bu methodu burda kullanmak icin obje olusturmammiz lazim
        printGrades(150);
    } //Ogrenci notlarini yazdiran bir method olusturunuz
    public static void printGrades(double grade) throws IllegalGradeException {
        if (grade<0||grade>100){
           throw new  IllegalGradeException("Grade 0dan kucuk,100'den buyk olamaz");
        }
        System.out.println(grade);
    }//Verilen ismin ilk harfinin buyuk harf olmamasi durumunda Exeption atiniz
    public static boolean checkNameFormat(String name){
        if (name.charAt(0)>='A'&&name.charAt(0)<='Z'){
            return true;
        }else {
            throw new IllegalArgumentException("Isimler buyuk harfle baslamalidir");//Bu mesaji uretmek icin
                                                                                    // İllegalNameExceptionda Constructor olusturduk
        }

    }


}
