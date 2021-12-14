public class Static_Method {

    int rollno;
    String name;
    static String college = "ITS";

    // constructor to initialize the variable
    Static_Method(int r, String n) {
        rollno = r;
        name = n;
    }

    // change() method
    static void change() {
        Static_Method.college = "BITS ";
    }

    // method to display values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

// Test class to create and display the values of object filename -
// TestStatic_Method.java
