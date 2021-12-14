public class Calculate {
    static int cube(int x){
        return x*x*x;
    }

    public static void main(String[] args) {
        int result = Calculate.cube(10);
        System.out.println(result);
    }
}
