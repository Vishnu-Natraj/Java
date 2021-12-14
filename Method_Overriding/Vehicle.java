/**
 * Without_Overriding
 */
public class Vehicle {

    // method
    void run() {
        System.out.println("vehicle is running");
    }

}

class bike extends Vehicle {
    public static void main(String[] args) {
        // creating instance of child class
        bike b = new bike();
        // calling method with child class instance
        b.run();
    }
}