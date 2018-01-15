
import java.io.Serializable;

public class Student implements Serializable {
    private String Name;
    private double CGPA;
    
    public Student(String name,double CGPA)
    {
        this.Name=name;
        this.CGPA=CGPA;
    }
    String getName()
    {
        return this.Name;
    }
    double getC()
    {
        return this.CGPA;
    }
}
