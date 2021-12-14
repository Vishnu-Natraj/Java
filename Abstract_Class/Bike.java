/**
 * Bike
 */
abstract class Bike {

    abstract void run();//there is no implemenetation inside the abstract method ...
}

class Honda extends Bike {
    void run(){
        System.out.println("running safely...");
    }
    
    public static void main(String[] args) {

        Honda h = new Honda();
        h.run();
    }
}