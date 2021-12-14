abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("drawing rectangle...");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("drawing circle...");
    }
}

class Testshape {
    public static void main(String[] args) {
        Shape s1 = new Circle();// object is provided through method
        Shape s2 = new Rectangle();// object is provided through method
        s1.draw();
        s2.draw();
    }
}