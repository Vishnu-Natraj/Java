public class Method_MatchFound {
    void sum(int a, int b) {
        System.out.println("int argument method is invoked");
    }

    void sum(long a, long b) {
        System.out.println("long argument is invoked");
    }

    public static void main(String[] args) {
        Method_MatchFound m = new Method_MatchFound();
        m.sum(12, 12);
        m.sum(20,20);
    }
}
