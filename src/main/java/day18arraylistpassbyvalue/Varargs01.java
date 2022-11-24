package day18arraylistpassbyvalue;

public class Varargs01 {
    /*
    1)farkli sayilarda parametrelerle calisabilen bir method olusturmak icin varargs kullanabilirsiniz
    2)varargs arka tarafta arrayler kullanir bu yuzden arraylerle calisiyomus gibi davranabiriz
    3)vararks olusturmak icin  "data typ... varargs ismi"
    burada ... mutlaka arada olmali
    4)Bir methodda vararksin yaninda baska bir parametre kullanilabilir mi?
    vararks en sonda olmak sartiyla kullanilir
    5)Bir method da birden fazla vararks kullanilabilir mi
    vararks en sonda olmak zorunda oldugundan birden fazla kullanirsaniz en az biri en sonda olmayacaktir.
    bu da 4. madde ile celisir

    */
      public static void main(String[] args) {

          int r1=topla(2,3);//5
          System.out.println(r1);

          int r2=topla(2,3,4);
          System.out.println(r2);

          int r3=topla(2,3,4,5,6);
          System.out.println(r3);

          // iki sayinin toplamini return ediniz

      }
      public static int topla(int a,int b){
          return a + b;

     }public static int topla(int a,int b,int c){return a + b + c; }
     public static int topla(int a,int b,int c,int d){return a + b + c + d; }

    // Istedigimiz kadar sayiyi toplayabilecegimiz sayiyi toplayabilecegimiz bir method olusturalim

    public static int topla(int...a){
          int sum = 0;
          for (int w:a){
              sum += w;
          }
        return sum;
    }


}
