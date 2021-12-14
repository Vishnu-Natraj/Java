import javax.print.DocFlavor.READER;

/**
 * Method_TypePromotion
 */
public class Method_TypePromotion {

    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        Method_TypePromotion m = new Method_TypePromotion();
        m.sum(10, 10);
        m.sum(10, 10, 10);;
    }
}