/**
 * Student
 */
public class Student {

    int Id; //instance variable
    String Name;
    static String College_name = "KGISL Institute Of Technology"; //static variable

    //constructor
    Student(int i, String n) {
        Id = i;
        Name = n;
        // College_name = c;
    }

    //method
    void display() {
        System.out.println(Id + " " + Name + " " + College_name);
    }

    public static void main(String[] args) {

        //creating object
        Student s1 = new Student(1, "vivek");
        Student s2 = new Student(2, "vishnu");

        //we can change the college name as like this:
        //Student.College_name ="BIT";

        s1.display();
        s2.display();
    }

    public static void change() {
    }

}