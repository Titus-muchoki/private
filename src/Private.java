import java.awt.*;

public class Private {
    protected String name = "kajela";
    protected String celeb = "instagram";
    protected String profession = "IT guy";
    protected int experience =22;
}
class Tito extends Private{
    protected int employeeYear = 2023;
    public static void main(String[] args) {
        Private myName = new Tito();
        System.out.println("HIS NAME IS: "+myName.name);
        System.out.println("HE IS KNOWN AS: "+myName.celeb);
        System.out.println("MY PROFFESSION IS: "+myName.profession);
        System.out.println("MY AGE IS: "+myName.experience);
        //System.out.println("I WILL BE EMPOYED: "+myName.);
    }
}
