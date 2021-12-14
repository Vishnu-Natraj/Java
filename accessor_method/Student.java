
/**
 * Student
 */
public class Student {

    private int Roll = 1;
    private String Name = "vishnu";

    public int getroll() { // accessor method = get or getter
        return Roll;
    }

    public void setroll(int Roll) { // mutator method = set or setter
        this.Roll = Roll;
    }

    public String getname() { // accessor method = get or getter
        return Name;

    }

    public void setName(String Name) { // mutator method = set or setter
        this.Name = Name;
    }

    public void display() {
        System.out.println(Roll + " " + Name);
    }

    public static void main(String[] args) {
        System.out.println("accessor and mutator method...!");

    }
}