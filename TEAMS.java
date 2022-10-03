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

                    public static void optionOne(){
                    System.out.println("Add a Student");
                    System.out.println("Enter New Student Name: ");
                    Scanner fetchstudent = new Scanner(System.in);
                    // HOW DO I CREATE AN OBJECT USING USER INPUT
                    System.out.println("Enter grade level: ");
                    Scanner fetchgrade = new Scanner(System.in);
                    Student student1 = new Student()
                    //HOW DO I RETURN TO MAIN MENU?

                }
            
                public static void optionTwo(){
                    System.out.println("Add a Teacher:");
                    System.out.println("Enter Teacher Name: ");
                    Scanner fetchteacher = new Scanner(System.in);
                    System.out.println("Enter Years of Experience: ");
                    Scanner fetchexperience = new Scanner(System.in);

                }
            
                public static void optionThree(){
                    int choice = 1;
                    while(choice > 0){
                        //Print the Menu
                        System.out.print("Add a Course");
                        System.out.println("Enter Subject: "); 
                        Scanner fetchsubject = new Scanner(System.in);
                        System.out.println("Pick a Teacher"){
                            import java.util.ArrayList; 
                            public class ListsWithStrings {
                            public static void main(String[] args) {
                             ArrayList<String> list = new ArrayList<String>();  //HOW DO I ADD TEACHERS SPECIFIC TO A COURSE?
                                
                             list.add("James");
                            list.add("Steve");
                             list.add("Amanda");
                             list.add("Rachael");
        
                         System.out.println(list);
                         list.size(); 
                            list.get(); 
                            }
                        }
                    

                        System.out.println("3) Sub Option 3");
                        System.out.println("0) Exit");
                        System.out.println();//EMPTY LINE
                        //get the choice
                        System.out.println("Choice: ");
                        choice = sc.nextInt();
                        sc.nextLine();//You have to do this
                    }
                }
    
            }
        }           //#### DO NOT CHANGE THIS FUNCTION ####
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