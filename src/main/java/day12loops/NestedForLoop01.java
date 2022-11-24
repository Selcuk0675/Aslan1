package day12loops;

import java.util.Scanner;

public class NestedForLoop01 {
    public static void main(String[] args) {
        // Asagıdaki sekli ekrana yazdiran kodu ekrana yazdırınız

        //        ****       // Not: Java yukarıdan asagi sonra soldan saga calisir
        //        ****       // onun icin ilk for dongusunu kullanır yukarıdan asagi 4 satir yazdiri sonra ikinci for dongusunu kullanır soldan saga 3 tane yildiz yazdirir
        //        ****

        for (int i=1;i<5;i++){

            for (int k=1;k<4;k++){
                System.out.print('*');

            }
            System.out.println();
        }
        //Example 2: bunu kullanicidan isteyenbir kod yaziniz

        Scanner input=new Scanner(System.in);
        System.out.println("satir sayisini girelim");
        int satir=input.nextInt();

        System.out.println("sutun sayisini girelim");
        int sutun=input.nextInt();

        char ch=input.next().charAt(0);
        for (int i=1;i<satir;i++){
            for (int j=1;j<sutun;j++){
                System.out.print("*");
            }
            System.out.println();// buraaki sout u unutursak istenen sonuc cikmaz
        }

         /*
        Example 2:Asagıdaki sekli cizen kodu yaziniz
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5

         */
        for (int i=1;i<6;i++){
            for (int k=1;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }

           /*
        Example 3:Asagıdaki sekli cizen kodu yaziniz

              * * * *
              * * *
              * *
              *

         */
        int row=4;
        for (int i=1;i<row+1;i++){
            for (int k=row;k>=i;k--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
