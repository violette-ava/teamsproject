import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {
 private String name;
 private int gradeLevel;
 private double GPA;
 private double grade;
 private String bestclass;
private ArrayList<Course> courses; 

    public Student(String name, int gradeLevel){
        this.name= name;
        this.gradeLevel= gradeLevel;
        courses= new ArrayList<>();

    }

    public void setGPA(double g){
        g = GPA;
    }

    public double getGPA(){
        if(grade >= 90.0){
            GPA = 4.0;
        }else if(grade < 90.0 && grade >= 80.0){
            GPA = 3.0;
        }else if(grade < 80.0 && grade >= 70.0){
            GPA = 2.0;
        }else if(grade < 70.0 && grade >= 60.0){
            GPA = 1.0;
        }
        return GPA;
    }

    public void setbestclass(String bestclass){
        this.bestclass= bestclass;
    }

    public String getbestclass(){
        //NEED TO RETURN SOMETHING THAT STATES THE BEST CLASS BY GRADE
    }

   public String toString(){
    return "Name:"+ name+ " "+ "Grade Level:"+gradeLevel+ " "+ "GPA: "+ GPA + " Best Class:"+ bestclass;
   }
}
