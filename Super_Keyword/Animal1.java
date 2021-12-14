public class Animal1 {
    void eat(){
        System.out.println("eating...");
    }
}
    class Dog1 extends Animal1{
        void eat(){System.out.println("eating bread...");}
        void bark(){System.out.println("barking...");}

        void display(){
            super.eat();
            bark();
        }
    }

    class TestAnimal2{
    
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.display();
    }
}

