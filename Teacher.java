import java.io.Serializable;

public class Teacher implements Serializable {
    private String teachername;
    private int yearsofexp;

    public Teacher(String teachername, int yearsofexp){
        this.teachername= teachername;
        this.yearsofexp= yearsofexp;

    }

    public void setTeacherName(String teachername){
        this.teachername= teachername;
    }

    public String getTeacherName(){
        return this.teachername;
    }

    public void setyearsofexp(int yearsofexp){
        this.yearsofexp= yearsofexp;
    }

    public int getyearsofexp(){
        return this.yearsofexp;
    }

    

    
}
