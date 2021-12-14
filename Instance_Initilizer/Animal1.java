/**
 * Animal1
 */
public class Animal1 {

    int speed;

    Animal1() {
        System.out.println("eat" + speed);
    }

    {
        speed = 200;
    }
}

class Dog2 extends Animal1 {
    int speed1 = 200;

    Dog2() {
        System.out.println("barking.." + speed * speed1);
    }
}

class TestAnimal1 {
    public static void main(String[] args) {

        // Animal1 a1 = new Animal1();
        Dog2 d = new Dog2();
        
    }
}
