class Computer {
    int wordSize;
    int memorySize;
    int storageSize;
    int speed;

    Computer() {
        wordSize = 0;
        memorySize = 0;
        storageSize = 0;
        speed = 0;
    }

    Computer(int w, int m, int s, int sp) {
        wordSize = w;
        memorySize = m;
        storageSize = s;
        speed = sp;
    }

    void display() {
        System.out.println("Word Size: " + wordSize);
        System.out.println("Memory Size: " + memorySize);
        System.out.println("Storage Size: " + storageSize);
        System.out.println("Speed: " + speed);
    }
}

class Laptop extends Computer {
    double length, width, height, weight;

    Laptop() {
        super();
        length = width = height = weight = 0;
    }

    Laptop(int w, int m, int s, int sp, double l, double wi, double h, double we) {
        super(w, m, s, sp);
        length = l;
        width = wi;
        height = h;
        weight = we;
    }

    void display() {
        super.display();
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
    }
}

public class Main {
    public static void main(String[] args) {
        Laptop obj = new Laptop(61, 8592, 552000, 9200, 35.5, 24.0, 1.8, 2.2);
        obj.display();
    }
}