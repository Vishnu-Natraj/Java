public class Account {
    private long Acc_no;
    private String Name, Country, Email;
    private float Salary;

    // Account number
    public long getAcc_no() {
        return Acc_no;
    }

    public long setAcc_no(long Acc_no) {
        return this.Acc_no = Acc_no;
    }

    // Name
    public String getName() {
        return Name;
    }

    public String setName(String Name) {
        return this.Name = Name;
    }

    // Country
    public String getCountry() {
        return Country;
    }

    public String setCountry(String Country) {
        return this.Country = Country;
    }

    // Email
    public String getEmail() {
        return Email;
    }

    public String setEmail(String Email) {
        return this.Email = Email;
    }

    // Salary
    public float getSalary() {
        return Salary;
    }

    public float setSalary(float Salary) {
        return this.Salary = Salary;
    }
}

class TestAccount {
    public static void main(String[] args) {
        Account a = new Account();
        a.setAcc_no(20353820096l);
        a.setName("VISHNU");
        a.setCountry("INDIA");
        a.setEmail("Vishnuunatraj@gmail.com");
        a.setSalary(45000);

        System.out.println("Account number - " + a.getAcc_no() + " " + "Name - " + a.getName() + " " + "Country - "
                + a.getCountry() + " " + "Email - " + a.getEmail() + " " + "Salary - " + a.getSalary());
    }
}
