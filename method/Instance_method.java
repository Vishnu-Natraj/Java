public class Instance_method {
    public static void main(String[] args) {
        // before creating instance method , we have to create an object
        Instance_method i = new Instance_method();
        // invoke the instance method
        System.out.println("sum of two num" +" "+ i.add(1, 2));

    }

    int s;

    public int add(int a, int b) {
        s = a + b;
        return s;
    }

}
