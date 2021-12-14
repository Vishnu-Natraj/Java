//import java.util.jar.Attributes.Name;

/**
 * Student
 */
public class Student {

    private String name;

    public String getname() {
        return name;
    }

    public String setname(String name) {
        return this.name = name;
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student s = new Student();
        s.setname("vishnu");
        System.out.println(s.getname());
    }
}
