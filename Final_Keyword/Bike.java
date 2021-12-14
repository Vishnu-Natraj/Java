/**
 * Bike
 */
public class Bike {

    final void run(){
        System.out.println("Running...");
    }
}
    class Honda extends Bike{
        public static void main(String[] args) {
            //new Honda().run();
            Honda h = new Honda();
            h.run();
        }
    }
