import java.io.Serializable;
import java.util.ArrayList;

public class Course implements Serializable{
    private String subject;
    private ArrayList<Teacher> teachers;
    private int Grade;
    private boolean current; 

    public Course (String subject, int Grade){
        this.subject= subject;
        this.Grade= Grade;

    }

    public Course(String subject, Teacher teacher, int Grade){
        this.subject = subject;
        teachers= new ArrayList<>();
        this.Grade= Grade;
    }

    public void setsubject(String subject){
        this.subject= subject;
    }

    public String getsubject(){
        return this.subject;
    }
    public String toString(){//CHANGE 
        return //NEED TO RETURN COURSE BY TEACHER
    }

    public void setGrade(int Grade){
        this.Grade= Grade;
    }

    public int getGrade(){
        return this.Grade;
    }

    public void setcurrent(boolean current){
        this.current=current;
    }

    public boolean getcurrent(){
        return current;
    }

    public void setteachers(ArrayList teachers){
        teachers= new ArrayList<>();
    }

    public ArrayList getteachers(){    
        return teachers;
    }

    public static int size() {
        return 0;
    }
        
    }



    

