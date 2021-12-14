public class Employee {
    int id;
    String name;
    Address address;

    Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }

    public static void main(String[] args) {
        Address a1 = new Address("kotagiri", "TamilNadu", "India");
        Address a2 = new Address("coonoor", "TamilNadu", "India");

        Employee e1 = new Employee(101, "Vishnu", a1);
        Employee e2 = new Employee(102, "vivek", a2);

        e1.display();
        e2.display();
    }
}
