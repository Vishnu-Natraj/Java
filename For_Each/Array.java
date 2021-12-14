import java.util.List;
import java.util.function.Consumer;
import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;

public class Array {
    public static void main(String[] args) {
        String[] array = { "vishnu", "rakesh", "vivek" };

        List<String> list = Arrays.asList(array);
        System.out.println(list);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        list.forEach(System.out::println); //Method Reference
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        //Consumer c = new Consumer<String>() {
        // public void accept(String s) {
        //        System.out.println(s);
        // //   }
       // };
       // list.forEach(c);
        list.forEach(s->System.out.println(s));
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        list.stream()
        .filter(s -> s.startsWith("v"))
         .forEach(System.out::println);

    }
}
