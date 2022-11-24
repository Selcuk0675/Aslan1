package day11loops;

public class NestedForLoop01 {
    public static void main(String[] args) {
        
         /*
            Example 1:Asagıdaki ciktiyi verecek kodu yaziniz
            Week: 1
            day 1
            day 2
            day 3
            day 4
            day 5
            day 6

            Week: 2
            day 1
            day 2
            day 3


            Week: 3
            day 1
            day 2
            day 3
            day 4
            day 5
            day 6

            week: 4
            day 1
            day 2
            day 3
            day 4
            day 5

        */
        
        for (int i=1;i<5;i++){
            System.out.println("week"+i);
            
            for (int k=1;k<8;k++){
                System.out.println("day = " + k);
            }
            
            
        }
        
        
    }
}
