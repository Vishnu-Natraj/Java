/**
 * Blank_Final_Variable
 */
public class Blank_Final_Variable {

    final int speed;

    //Only inside constructor we can create blank final variable
    Blank_Final_Variable() {
        speed = 70;
        System.out.println(speed);
    }
    public static void main(String[] args) {
        new Blank_Final_Variable();
    }
}