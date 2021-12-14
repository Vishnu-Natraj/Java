
class Programmer extends Employee {
    int bonus = 10000;

    public static void main(String args[]) {
        Programmer p = new Programmer();
        //Employee e = new Employee();
        //e.dispaly();
        System.out.println("Emp_id is:"+p.Emp_id);
        System.out.println("Employee Name is:"+p.Name);
        System.out.println("Programmer salary is:" + p.salary);
        System.out.println("Bonus of Programmer is:" + p.bonus);

    }
}