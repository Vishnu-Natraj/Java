/**
 * MyClass
 */

 abstract class demo{
     abstract void display();
 }


public class MyClass extends demo {

    void display(){
        System.out.println("abstract method ...!");
    }

    public static void main(String[] args) {
        MyClass m = new MyClass();
        m.display();
    }
}