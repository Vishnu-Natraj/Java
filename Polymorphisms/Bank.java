public class Bank {
    float getrateofinterest() {
        return 0;
    }
}

class Sbi extends Bank {
    float getrateofinterest() {
        return 6.5f;
    }
}

class Icici extends Bank {
    float getrateofinterest() {
        return 4.5f;
    }
}

class Axis extends Bank {
    float getrateofinterest() {
        return 3.6f;
    }
}

class Hdfc extends Bank {
    float getrateofinterest() {
        return 6.1f;
    }
}

class Polymorphism {
    public static void main(String[] args) {
        Bank b = new Bank();
        b = new Sbi();
        System.out.println("RATE OF SBI INTEREST IS :" + b.getrateofinterest());
        b = new Icici();
        System.out.println("RATE OF ICICI INTEREST IS :" + b.getrateofinterest());
        b = new Axis();
        System.out.println("RATE OF AXIS INTEREST IS :" + b.getrateofinterest());
        b = new Hdfc();
        System.out.println("RATE OF HDFC INTEREST IS :" + b.getrateofinterest());
    }
}
