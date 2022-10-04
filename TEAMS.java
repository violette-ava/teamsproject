import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class TEAMS{
    static ArrayList<Student> students;
    static ArrayList<Teacher> teachers;
    static ArrayList<Course> courses;

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        
        //Load the data if available ### DO NOT CHANGE THIS PART
        try{
            students =(ArrayList<Student>)loadData("ListofStudents");

        }catch(Exception e){
            students = new ArrayList<>();
        }
        try{
            teachers =(ArrayList<Teacher>)loadData("teachers");
        }catch(Exception e){
            teachers = new ArrayList<>();
        }
        try{
            courses =(ArrayList<Course>)loadData("courses");
        }catch(Exception e){
            courses = new ArrayList<>();
        }


        //############## MAIN MENU STARTS HERE #############
        
            System.out.println("Welcome To My TEAMS Project");
    
            int choice = 1;
            while(choice > 0){
    
                //Print the Menu
                System.out.println("1) Add Students "); 
                System.out.println("2) Add Teacher");
                System.out.println("3) Add Course");
                System.out.println("4) Edit Students");
                System.out.println("5) List All Teachers");
                System.out.println("6) List All Courses");
                System.out.println("7) Search for a Student");
                System.out.println("0) Previous Page");
                System.out.println();//EMPTY LINE
                //get the choice
                System.out.println("Choice: ");
                choice = sc.nextInt();
                sc.nextLine();//You have to do this
    
                if(choice  == 1){
                    optionOne();
                }else if(choice == 2){
                    optionTwo();
                }else if(choice == 3){
                    optionThree();
                }
            }
        }
        public static void optionOne(){
            System.out.println("Add a Student");
            System.out.println("Enter New Student Name: ");
            String name = sc.nextLine();
            System.out.println("Enter grade level: ");
            int gradeLevel = sc.nextInt();
            sc.nextLine();
        }

        public static void optionTwo(){
            System.out.println("Add a Teacher:");
            System.out.println("Enter Teacher Name: ");
            String teachername= sc.nextLine();
            System.out.println("Enter Years of Experience: ");
            int yearsofexp = sc.nextInt();
            sc.nextLine();
            Teacher t = new Teacher(teachername,yearsofexp);
            teachers.add(t);
        }
        
        public static void optionThree(){
            int choice = 1;
            while(choice > 0){
                //Print the Menu
                System.out.println("Add a Course:");
                System.out.println("Enter Course: "); 
                String subject= sc.nextLine();
                for(int i= 0; i< Course.size(); i++){
                    System.out.print(i + " " + courses.get(i));
                }
                System.out.print(s: "Choice: ");
                int choice3 = sc.nextInt();
                sc.nextLine();

                System.out.println("Pick a Teacher");
                for(int i=0; i< teachers.size(); i++){
                    System.out.println(i + " "+ teachers.get(i));
                }
                System.out.print("Choice: ");
                int choice2 = sc.nextInt();
                sc.nextLine();
                
                



                
                

            }
        }

    
        
        //#### DO NOT CHANGE THIS FUNCTION ####
                    public static void saveData()throws Exception{
                     FileOutputStream f1 = new FileOutputStream("students");
                    ObjectOutputStream os = new ObjectOutputStream(f1);
                     os.writeObject(students);
                     os.close();
                     f1.close();

                    FileOutputStream f2 = new FileOutputStream("courses");
                     os = new ObjectOutputStream(f2);
                     os.writeObject(courses);
                     os.close();
                     f2.close();

                     FileOutputStream f3 = new FileOutputStream("teachers");
                     os = new ObjectOutputStream(f3);
                     os.writeObject(teachers);
                     os.close();
                     f3.close();
    }

                     //#### DO NOT CHANGE THIS FUNCTION ####
                     public static Object loadData(String name) throws Exception{
                     FileInputStream fis = new FileInputStream(name);
                     ObjectInputStream ois = new  ObjectInputStream(fis);   
                     Object o = ois.readObject();
                      ois.close();
                     fis.close();
                     return o;
    }
}