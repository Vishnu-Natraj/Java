//import Animal.Dog;

/**
 * Animal
 */
class Animal {

    String color = "RED";
}

    class Dog extends Animal {
        String color = "WHITE";

        void displayColor() {
            System.out.println(color);
            System.out.println(super.color);
        }
    }

class TestAnimal{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.displayColor();

    }
}



