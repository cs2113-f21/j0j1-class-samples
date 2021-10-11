import java.util.Scanner;

//parent of LabPoint is Point
//child of Pint is LabPoint
public class LabPoint extends Point{
    private String label;

    public LabPoint(double x, double y, String lab){
        super(x,y); //calls the constructor 
                    //of the parent class
        this.label = lab;
    }
    public LabPoint(Point p, String lab){
        super(p);
        this.label = lab;
    }

    public String toString(){
        String point_str = super.toString();
        return label+": " + point_str;
    }

    public static LabPoint nextPoint(Scanner sc){
        String label = sc.next();
        Point p = Point.nextPoint(sc);
        return new LabPoint(p,label);
    }
}
