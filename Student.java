import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {
 private String name;
 private int gradeLevel;
 private double calculateGPA;
 private double grade;
 private String bestclass;
private ArrayList<Course> courses; 

    public Student(String name, int gradeLevel){
        this.name= name;
        this.gradeLevel= gradeLevel;
        courses= new ArrayList<>();

    }

    public void addCourse(Course c){
        courses.add(c);
    }

    public void removeCourse(Course c){
        courses.remove (c);
    }

    public ArrayList<Course> getCourses(){
        return courses;
    }

    public void setname(String n){
        name = n;
    }

    public String getname(){
        return name;
    }

    public void setgradeLevel(int gradeLevel){
        this.gradeLevel= gradeLevel;
    }

    public int getgradeLevel(){
        return gradeLevel;
    }

    public void setgrade(double grade){
        this.grade= grade;
    }

    public double getgrade(){
        return grade;
    }

    public void setcaluclateGPA(double g){
        g = calculateGPA;
    }

    public double calulateGPA(){
        int gpaPoints = 0;
        for(int index = 0; index < courses.size(); index++){
            Course c= courses.get(index);
            double grade = c.getGrade();
            if(grade>= 90){
                gpaPoints += 4;
            }
            if(grade < 90 && grade >= 80){
                gpaPoints +=3;
            }
            if(grade < 80 && grade >= 70){
                gpaPoints +=2;
            }
            if(grade < 70 && grade >= 60){
                gpaPoints +=1;
            }
        }
        return (double) gpaPoints/courses.size();
    }

    public void setbestclass(String bestclass){
        this.bestclass= bestclass;
    }

    public Course getbestclass(){
        if(courses.size() == 0){
            return null;
        }

        Course best = courses.get(0);
        for (int i = 0; i < courses.size(); i++){
            Course c = courses.get(i);
            if(c.getGrade() > best.getGrade()){
                best =c;
            }
        }
        return best;

    }

   public String toString(){
    if(getbestclass() == null){
        return "Name:"+ name+ " "+ "Grade Level:"+gradeLevel+ " "+ "GPA: "+ calulateGPA();
    }
    else{
        return "Name:"+ name+ " "+ "Grade Level:"+gradeLevel+ " "+ "GPA: "+ calulateGPA() + " Best Class:"+ getbestclass();
    }
   }
}
