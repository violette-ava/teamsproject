import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {
 private String name;
 private int gradeLevel;
private ArrayList<Course> courses; 

    public Student(String name, int gradeLevel){
        this.name= name;
        this.gradeLevel= gradeLevel;
        courses= new ArrayList<>();


    }

   
}
