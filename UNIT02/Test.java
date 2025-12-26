class Parent {
    void show() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("This is child class");
    }
}

public class Test {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();     // Parent method
        obj.display();  // Child method
    }
}
