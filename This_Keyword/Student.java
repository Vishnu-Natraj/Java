class Student {
    int rollno;
    String name, course;
    float fee;

    // void Student(int rollno, String name, float fee) {
    // this.rollno = rollno;
    // this.name = name;
    // this.fee = fee;
    // }

    Student(int rollno, String name, String course) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;

    }

    Student(int rollno, String name, String course, float fee) {
        this(rollno, name, course);// reusing constructor
        this.fee = fee;
    }

    void display() {
        // System.out.println(rollno + " " + name + " " + course + " " + fee);
        System.out.println("rollno :" + rollno);
        System.out.println("name :" + name);
        System.out.println("course :" + course);
        System.out.println("fee :" + fee);
    }
}

// main funtion in TestThis.java
// THIS keyword can be used to invoke the class method or class