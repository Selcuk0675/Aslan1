package day06nestedifswitch;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {

          /*
          Password'un ilk harfi buyuk harf ise
          'A' olursa gecerli password aksi halde gecersiz password
          Passwordun ilk harfi kucuk harf ise
          'z' olursa gecerli passwword aksi halde gecersiz password

         Note:Java nested kodları yazdırırken çok zaman harcar buna"time complexity denir.
              bu yuzden nestedkulanmamaya dikkat ederiz

            */
        Scanner input=new Scanner(System.in);
        System.out.println("Bir password giriniz");
        String pwd=input.next();

        char ilkHarf=pwd.charAt(0);

        if (ilkHarf>='A' && ilkHarf<='z'){
            if (pwd.charAt(0)=='A'){
                System.out.println("gecerli password");
            }else {
                System.out.println("gecersiz islem");
            }
        } else if (ilkHarf>='a'&& ilkHarf<='z') {
            if (ilkHarf=='z'){
                System.out.println("ghecerli password");
            }else {
                System.out.println("gecersiz password");
            }
        }
        else {
            System.out.println("ilk karakter harf olmalısdır");
        }


    }
}
