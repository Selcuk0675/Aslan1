package day28abstraction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {
    /*          **********"throw" ile "throws" arasindaki farklar nelerdir********
     1)"throw" methodun body si icinde kullanilir."throws" methodun isminden sonra kullnailir
     2)throw" dan sonra obje olusturulur yani neww demek."throws" dan sonra sadece exception class in ismi yazilir
     3)"throw" methodun body si icinde istedigimiz yerde exception uretmek icin kullanilir
       "throws" ise var olan checked exception u atmak icin kullaniilir.
     4)"throw" dan sonra sadece bir tane exception atabiliriz "throws" dan sonra 1 deen fazla exception koyabiliriz
     */
    public static void main(String[] args) {

    }
    public static void readFileLineByLine(){
        try {
            BufferedReader br=new BufferedReader(new FileReader("src\\main\\java\\day27exceptions\\File1.txt"));//BufferedReader bu obje new FileReader() bununla calişir
            String line =br.readLine();//Birinci satiri okur:::satir okur buna ulasabilmek icin bufferRead i kullanmak zorundayiz
            while (line!=null){//butun satirlar bitince java bize null verecek
                System.out.println(line);//null!=null false oldugu icin loop kırılacak
                line=br.readLine();
            }
        } catch (FileNotFoundException e) {//text file okuyana kod karakter karakter degil de satir satir okunacaksa BufferedReader i kullaniriz
            System.out.println("Ya path yanlis ya da dosya silinmis "+e.getMessage());
        } catch (IOException e) {
            System.out.println("Okunamayacak karakterler var -"+e.getMessage());
        }


    }
}
