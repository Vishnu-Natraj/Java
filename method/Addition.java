public class Addition {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c;

        // methof calling
        c = add(a,b);
        System.out.println("sum of a and b is = " + c);

    }

    // user defined mmethod
    private static int add(int n1, int n2) {
        int s;
        s = n1 + n2;
        return s;

    }
}
