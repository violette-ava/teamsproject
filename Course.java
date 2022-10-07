import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.plaf.basic.BasicTabbedPaneUI.TabSelectionHandler;

public class Course implements Serializable, Cloneable{
    private String subject;
    private Teacher teacher;
    private int Grade;
    private boolean current; 

    public Course (String subject){
        this.subject= subject;

    }
    public Course(String subject, Teacher teacher, int Grade){
        this.subject = subject;
        this.teacher = teacher;
        this.Grade= Grade;
    }

    public Course(String subject2, Teacher t) {
        this.subject = subject2;
        this.teacher = t;
    }


    public void setsubject(String subject){
        this.subject= subject;
    }

    public String getsubject(){
        return this.subject;
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

    public void setTeacher(Teacher t ){
        teacher= t;
    }

    public Teacher getteachers(){    
        return teacher;
    }

    public static int size() {
        return 0;
    }
        
    public String toString(){
     if(Grade >0 ){
        return subject+" by "+teacher+" Grade: "+Grade;}
    else{
            return subject+ " by "+teacher;
        }
    }
        
     public Course clone() {
      try {
         return (Course) super.clone();
         } catch (Exception e) {
         }
         return null;

     }

     
     
}



    

