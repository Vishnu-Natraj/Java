public class Student1 {
    private String Name;
    private String Country;

    public String getname() {
        return Name;
    }

    public String setname(String Name) {
        return this.Name = Name;
    }

    public String getcountry() {
        return Country;
    }

    public String setcountry(String Country) {
        return this.Country = Country;
    }

}

class TestStudent1 {
    public static void main(String[] args) {
        Student1 s = new Student1();
        s.setname("Vishnu");
        System.out.println(s.getname());
        s.setcountry("India");
        System.out.println(s.getcountry());
    }
}
