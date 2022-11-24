package day02methodcreation;

public class MethodCreation {



                //Example:toplama islemi yapan bir methodm olusturunuz

            public static     double toplamaYap ( double a, double b){
                        return a + b;
                }


        public static void main(String[] args) {

                System.out.println(toplamaYap(1.2,5));
                System.out.println(ucSayiyiCarp(2,3,6));

        }

//example2:uc sayıyı birbiriyle çarpan method oluşturun

       public static double ucSayiyiCarp(double a,double b,double c){return a*b*c;}




}
