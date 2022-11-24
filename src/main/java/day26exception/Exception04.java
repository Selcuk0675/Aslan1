package day26exception;

public class Exception04 {
    public static void main(String[] args) {
        try {
            printAge(300);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }//Yaşı ekrana yazdıran bir method oluşturunuz

    public static void printAge(int age) {
        if (age < 0 || age > 200) {
            throw new IllegalArgumentException("Yaş negatif olamaz veya 200'den büyük olamaz.");
        }
        System.out.println(age);
    }
      /*
Exception'lar ikiye ayrılır
1) RunTime(Unchecked) Exception: Siz run butonuna bastıktan sonra oluşan Exception'lardır
    a)ArithmaticException
    b)NullPointerException
    c)ArrayIndexOutOfBoundsException
    d)StringIndexOutOfBoundsException
    e)NumberFormatException
2) CompileTime(Checked) Exception: Biz kod yazarken javanın kızmızı altını çizmesi.

       */
}