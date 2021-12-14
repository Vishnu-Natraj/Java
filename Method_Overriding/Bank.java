//import Bank.SBI.ICICI;
//import Bank.SBI.ICICI.HDFC;

class Bank {
    int getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    int getRateOfInterest() {
        return 5;
    }
}

class ICICI extends Bank {
    int getRateOfInterest() {
        return 6;
    }
}

class HDFC extends Bank {
    int getRateOfInterest() {
        return 9;
    }

}

class Test {
    public static void main(String[] args) {

        SBI s = new SBI();
        ICICI i = new ICICI();
        HDFC h = new HDFC();

        System.out.println("Rate_Of_Interest of SBI is :" + s.getRateOfInterest());
        System.out.println("Rate_Of_Interest of ICIC is :" + i.getRateOfInterest());
        System.out.println("Rate_Of_Interest of HDFC is :" + h.getRateOfInterest());

    }
}
