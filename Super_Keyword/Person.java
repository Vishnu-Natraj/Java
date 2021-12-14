public class Person {
    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Employee extends Person {
    float Salary;

    Employee(int id, String name, float Salary) {
        super(id, name);
        this.Salary = Salary;

    }

    void display() {
        System.out.println(id + " " + name + " " + Salary);
    }
}

class TestPerson {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Vishnu", 25450);
        Employee e2 = new Employee(102, "vivek", 23400);
        e1.display();
        e2.display();
    }
}
