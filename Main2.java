class Base {
    int a;

    Base() {
        a = 0;
    }

    Base(int a) {
        this.a = a;
 }

    // Method
    void showA() {
        System.out.println("Value of a: " + a);
  }
}

// First Derived Class
class Child1 extends Base {
    int b;

    Child1(int a, int b) {
        super(a);
        this.b = b;
    }

    void showB() {
        System.out.println("Value of b: " + b);
    }
}

// Second Derived Class
class Child2 extends Base {
    int c;

    Child2(int a, int c) {
        super(a);
        this.c = c;
  }

    void showC() {
        System.out.println("Value of c: " + c);
  }
}

// Main Class
public class Main2 {
    public static void main(String[] args) {
        Child1 obj1 = new Child1(10, 20);
        Child2 obj2 = new Child2(30, 40);

        obj1.showA();
        obj1.showB();

        obj2.showA();
        obj2.showC();
    }
}