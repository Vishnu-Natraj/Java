import java.util.Scanner;  
public class Userdefined {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = scan.nextInt();
        Userdefined(num);
    }

    private static void Userdefined(int num) {

        if (num % 2 == 0) {
            System.out.println(num + "num is even");
        } else {
            System.out.println(num + "num is odd");
        }
    }

}
