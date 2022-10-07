import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TEAMS {
    static ArrayList<Student> students;
    static ArrayList<Teacher> teachers;
    static ArrayList<Course> courses;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Load the data if available ### DO NOT CHANGE THIS PART
        try {
            students = (ArrayList<Student>) loadData("ListofStudents");

        } catch (Exception e) {
            students = new ArrayList<>();
        }
        try {
            teachers = (ArrayList<Teacher>) loadData("teachers");
        } catch (Exception e) {
            teachers = new ArrayList<>();
        }
        try {
            courses = (ArrayList<Course>) loadData("courses");
        } catch (Exception e) {
            courses = new ArrayList<>();
        }

        // ############## MAIN MENU STARTS HERE #############

        System.out.println("Welcome To My TEAMS Project");

        int choice = 1;
        while (choice > 0) {

            // Print the Menu
            System.out.println("1) Add Students ");
            System.out.println("2) Add Teacher");
            System.out.println("3) Add Course");
            System.out.println("4) Edit Students");
            System.out.println("5) List All Student");
            System.out.println("6) List All Courses");
            System.out.println("7) Search for a Student");
            System.out.println("0) Previous Page");
            System.out.println();
            System.out.println("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                optionOne();
            } else if (choice == 2) {
                optionTwo();
            } else if (choice == 3) {
                optionThree();
            } else if (choice == 4) {
                optionFour();
            } else if (choice == 5) {
                optionFive();
            } else if (choice == 6) {
                optionSix();
            } else if (choice == 7) {
                optionSeven();
            } else if (choice == 0) {
                optionZero();
            }

        }
    }

    private static void optionZero() {
        try {

            saveData();

        } catch (Exception e) {
        }

    }

    private static void optionSeven() {
        System.out.println("Enter student name:");
        String name = sc.nextLine();
        // NEED A FOR LOOP THAT PRINTS THE STUDENT toString OR PRINTS "STUDENT NOT
        // FOUND"
    }

    private static void optionSix() {
        System.out.println("Listing Courses...");
        for (int index = 0; index < courses.size(); index++) {
            System.out.print(index + " " + courses.get(index));
        
        }
    }

    private static void optionFive() {
        System.out.println("Listing Students...");
        for (int index = 0; index < students.size(); index++) {
            System.out.println(index + " " + students.get(index)); 
        }
    }

    private static void optionFour() {
        System.out.println("Edit Student:");
        System.out.println("Which student would you like to edit?:");
        for( int index = 0; index < students.size(); index ++){
            System.out.println(index + " " + students.get(index));
        }
        System.out.println("Choice:");
        int choice = sc.nextInt();
        sc.nextLine();
        // Print edit menu
        System.out.println("1) Modify Name");
        System.out.println("2) Modify Grade Level");
        System.out.println("3) Add Class");
        System.out.println("4) Remove Class");
        System.out.println();
        System.out.println("Choice: ");
        int choice2 = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            optionModifyname();
        } else if (choice == 2) {
            optionModifyGrade();
        } else if (choice == 3) {
            optionAddClass();
        } else if (choice == 4) {
            optionRemoveClass();
        }
    }

    private static void optionRemoveClass() {
        System.out.println("Pick a class:");
        for (int index = 0; index < courses.size(); index++) {
            System.out.print(index + " " + courses.get(index));
        System.out.println("Choice:");
        int ans = sc.nextInt();

        // NEED AN IF STATEMENT THAT ALLOWS ME TO REMOVE A CLASS
    }

    private static void optionAddClass() {
        System.out.println("Pick a class");
        for (int index = 0; index < courses.size(); index++) {
            System.out.print(index + " " + courses.get(index));
        System.out.println();
        System.out.println("Choice:");
        int ans = sc.nextInt();
        sc.nextLine();
        if (ans > -1 && ans < courses.size()) {
            Course c = courses.get(ans).clone();
            System.out.println("Enter grade for the course:");
            int grade = sc.nextInt();
            c.setGrade(grade);
            sc.nextLine();
            System.out.println("Currently taking this course? (y/n):");
            String yesNo = sc.nextLine();
            if (yesNo.equals("y")) {
                c.setcurrent(true);
            }
        }
    }

    private static void optionModifyGrade() {
        System.out.print("Modifying grade...");
        // IDK HOW TO EDIT THIS
    }

    private static void optionModifyname() {
        System.out.print("Modifying name...");
        // NEED TO TAKE THE STUDENT THEY PICKED AND EDIT THE VARIABLE FOR NAME
    }

    public static void optionOne() {
        System.out.println("Add a Student");
        System.out.println("Enter New Student Name: ");
        String name = sc.nextLine();
        System.out.println("Enter grade level: ");
        int gradeLevel = sc.nextInt();
        sc.nextLine();
        Student s = new Student(name, gradeLevel);
        students.add(s);
    }

    public static void optionTwo() {
        System.out.println("Add a Teacher:");
        System.out.println("Enter Teacher Name: ");
        String teachername = sc.nextLine();
        System.out.println("Enter Years of Experience: ");
        int yearsofexp = sc.nextInt();
        sc.nextLine();
        Teacher t = new Teacher(teachername, yearsofexp);
        teachers.add(t);
    }

    public static void optionThree() {
        // Print the Menu
        System.out.println("Add a Course:");
        System.out.println("Enter Subject: ");
        String subject = sc.nextLine();
        System.out.println("Pick a Teacher:");
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println(i + " " + teachers.get(i));
        }

        int choice = sc.nextInt();
        sc.nextLine();
        Teacher t = teachers.get(choice);

        Course newCourse = new Course(subject, t);

        courses.add(newCourse);
    }

    // #### DO NOT CHANGE THIS FUNCTION ####
    public static void saveData() throws Exception {
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

    // #### DO NOT CHANGE THIS FUNCTION ####
    public static Object loadData(String name) throws Exception {
        FileInputStream fis = new FileInputStream(name);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object o = ois.readObject();
        ois.close();
        fis.close();
        return o;
    }
}