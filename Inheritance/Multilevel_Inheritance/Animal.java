/**
 * Animal
 */
public class Animal {

    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

class Littledog extends Dog {
    void weep() {
        System.out.println("Weeping...");
    }
}

class TestAnimal {
    public static void main(String[] args) {
        //Animal a = new Animal();
        //Dog d = new Dog();
        Littledog l = new Littledog();
        l.weep();
        l.bark();
        l.eat();

    }
}