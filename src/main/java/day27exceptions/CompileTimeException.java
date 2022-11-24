package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CompileTimeException {
    /*
       1) FileInputStream fis=new FileInputStream("src\\main\\java\\day27exceptions\\File1.txt");
        "new" den sonra hata verir.Cunki;Java ya verilen adresteki dosyaya git bak dedik,Java
        iki endiseye kapildii)Ya adres yanlissa ii)Ya da verilen adreste dosya yoksa
        Biz method isminden" sonra,"throws FileNotFoundException, yazarak Javaya bu iki endise duydudugun durum
        olusursa "Exception At "dedik

      2;) while ((k=fis.read())!=-1){} yazdigimizda "read() methodu hata vrir.Cunku biz javaya dosyadaki
       karakterleri oku dedik.Java bir endiseye kapildiYa okumasi gereken karakterler Java'nin bilmedigi karakterlerse
        Biz method isminden sonra "throws IOException" yazarak, Java'ya bu durumla karsilastiginda "Excepiton at" dedik.

      3)Method isminden sonra "throw  IOException yazarsaniz Java  FileNotFoundException i siler.CCunku;
        IOException ,FileNotFoundException ikapsar."IOException", "FileNotFoundException" ın parent'ıdır, onun yaptığı
       her şeyi yapabilir, o yüzden "IOException" varken "FileNotFoundException" a gerek yoktu

       "IOException","Input OutputException" demektir.

       4)Gordugunuz gibi "IOException" ve FileNotFoundException biz kod yazarken daha run butonuna basmadan ortaya cikti
        bu tarz exceptionlara" Compile Time Exception" denir.Diger adi Checked Exception" dir Bunlar handle edilmelidir

        "


     *///1.Way:
    public static void main(String[] args) throws IOException {
        readTheTextFromTheFile();           // throws FileNotFound vardi read in altindaki kırmızıyı kaldirmak icin
                                            // more action yapinca bu otomatik olarak boyle oluyo
        readTheText();

    }//Bir text file deki bir texti okuyan kodu yaziniz       // throws FileNotFound vardi read in altindaki kırmızıyı kaldirmak icin
                                                                // more action yapinca bu otomatik olarak boyle oluyo
    public static void readTheTextFromTheFile() throws IOException {
        // bu methodun main metodm icinde deolmasi lazim
        //Java bir file den dosya almak icin Class olusturmustur  FileInputStream
        FileInputStream fis=new FileInputStream("C:\\Users\\User\\IdeaProjects\\Batch103MyPractise\\src\\main\\java\\day27exceptions\\File1.txt");
        int k=0;//Dosya okuma loopu butun harflerii okuduktan sonra baska kaakter olmadigindan -1 olur -1=-1 oldugundan loop kırılır
        while ((k= fis.read())!=-1){
            System.out.print((char)k);//(char)k; bu type casting yukraida asscci degereini alip char acevirecek rakam yerine harf gorecez
        }

    }//2.YOl:
    public static void readTheText()  {
        try {
            FileInputStream fis=new FileInputStream("C:\\Users\\User\\IdeaProjects\\Batch103MyPractise\\src\\main\\java\\day27exceptions\\File1.txt");
            int k=0;
            while ((k= fis.read())!=-1){
                System.out.print((char)k);
        }

        }catch (FileNotFoundException e){
            System.out.println("Dosyanin adresi veya varligi ile ilgili problem var");
        }catch (IOException e){
            System.out.println("Dosyada okunmayan karaktr var");
        }
    }



}
