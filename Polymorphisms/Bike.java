/**
 * Bike
 */
public class Bike {

    void run() {
        System.out.println("Bike Running...");
    }
}

    class Splender extends Bike {
        void run() {
            System.out.println("Splender is Running...");
        }

        public static void main(String[] args) {
            Bike B = new Splender();//upcasting
            B.run();
        }

    }

