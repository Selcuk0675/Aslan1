package day24statickeywordencapsulation;

public class Student {


    // Encapsulation: Data Hiding demektir
    //Data yi dis etkilrden etkilenmemesini  istedigimiz zaman gizleriz
    //Data yi Access Modifierni private yaparak gizleriz
    //Datayi gizledikten sonra baska classlardan okumak istersek Getter methodu kullaniriz
    //Datayi gizledikten sonra baska classlardan degiştirmek istersek Setter methodu kullaniriz

    public String stdName="SelçukUzun";
    private String stdId="SU123456";
    private double Gpa=3.8;
    private boolean maried=false;


    public String getStdId() {// hey java ben bu metodu kullandigimda bana stdId yi ver return bu işe yarar
        return stdId;
    }

    public double getGpa() {// Get  methodlar public oldu
        return Gpa;          //Variablenin data type ile get methodun return type ayni olmalidr
    }                        //  String==String   ,Boolean==Boolean
                              //Variableninin isminin basina get gelerek getter in ismi olur
    public boolean isMaried() {//Data type boolean olursa variablenin isminin basina is gelir
        return maried;
    }


    public void setStdId(String stdId) {//Dikkat hepsi public oldu ve return type leri void dir
        this.stdId = stdId;               //Set method paramatreyle calisir (String sdtId)
    }                                 //set methodu herseyi degiştirebilir a

    public void setGpa(double gpa) {
        Gpa = gpa;
    }
    //Note : yaptigfimiz butun işlemeler burda obje iCİNndedir classta degişiklik olmaz//
    public void setMaried(boolean maried) {
        this.maried = maried;
    }
}
