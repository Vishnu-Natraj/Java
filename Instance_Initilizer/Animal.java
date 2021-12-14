/**
 * Animal
 */
public class Animal {

    Animal() {
        System.out.println("eat..");
    }
}

class Dog extends Animal {

    Dog() {
        super();
        System.out.println("bark..");
    }

    {
        System.out.println("calling dog..");
    }

}

class Cat extends Dog {
    Cat() {
        System.out.println("meow...");
    }

}

class TestAnimal {
    public static void main(String[] args) {
        Dog d = new Dog();

    }
}