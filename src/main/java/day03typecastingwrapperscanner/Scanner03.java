package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        // Kullanicidan bir dikdortgenin enini ve boyunu alip alanini ve cevresini hesaplayiniz
        Scanner input=new Scanner(System.in);
        System.out.println("kullanici en soyle");
        int en= input.nextInt();
        System.out.println("kullanici boy soyle");
        int boy= input.nextInt();
        System.out.println("kullanıcı alanın" +(en*boy));
        System.out.println("kullanıcı cevren"+(2*(en+boy)));







    }

}
