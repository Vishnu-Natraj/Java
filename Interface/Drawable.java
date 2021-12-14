public interface Drawable {
    void draw();

    static char[] cube(int i) {
        return null;
    }
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing rectangle...");
    }
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("drawing circle...");
    }
}

class TestDrawable {
    public static void main(String[] args) {
        Drawable d = new Circle();
        d.draw();
    }
}
