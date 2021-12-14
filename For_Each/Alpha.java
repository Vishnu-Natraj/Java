import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alpha {
    public static void main(String[] args) {
        List<String> alphabets = new ArrayList<>(Arrays.asList("vishnu", "vivek", "deepak", "rakesh"));

        // To print the list
        alphabets.forEach(s -> System.out.println(s));

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        // Another type of print the list
        alphabets.forEach(System.out::println);

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        // seprate by comma without using ln(new line command)
        alphabets.forEach(s -> System.out.print(s + ","));

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        alphabets.stream()
        .filter(s -> s.endsWith("a"))
        .forEach(System.out::println);

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        alphabets.stream()
        .filter(s -> s.length() > 3)
        .forEach(System.out::println);

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        //To find the Length of the list
        alphabets.stream().mapToInt(s -> s.length()).forEach(System.out::println);

    }
}
