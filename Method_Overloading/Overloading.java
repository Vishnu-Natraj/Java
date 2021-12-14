//import javax.swing.text.StyledEditorKit.BoldAction;

/**
 * Overloading
 */
public class Overloading {

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;

    }

    public static void main(String[] args) {
        System.out.println(Overloading.add(1, 1));
        System.out.println(Overloading.add(3, 2));
    }
}