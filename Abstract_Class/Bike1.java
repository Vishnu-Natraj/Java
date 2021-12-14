abstract class Bike1 {
    Bike1() {
        System.out.println("Bike Started...");
    }

    abstract void run();

    void GearChange() {
        System.out.println("Gear Changed Successfully...");
    }

}

// Creating a Child class which inherits Abstract class
class Honda1 extends Bike1 {
    void run() {
        System.out.println("Bike Running Safely...");
    }
}

// Creating a Test class which calls abstract and non-abstract methods
class TestBike1 {
    public static void main(String[] args) {
        Bike1 b = new Honda1();
        b.GearChange();
        b.run();

    }
}
