import java.util.Scanner;

// Base class
class Publication {
    protected String title;
    protected double price;

    public void set() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title: ");
        title = sc.nextLine();
        System.out.print("Enter price: ");
        price = sc.nextDouble();
        sc.nextLine(); // consume leftover newline
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}

class Book extends Publication {
    private int pageCount;

    @Override
    public void set() {
        super.set();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter page count: ");
        pageCount = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Page Count: " + pageCount);
    }
}

class Tape extends Publication {
    private double playingTime;

    @Override
    public void set() {
        super.set();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter playing time in minutes: ");
        playingTime = sc.nextDouble();
        sc.nextLine();
   }

    @Override
    public void display() {
        super.display();
        System.out.println("Playing Time: " + playingTime + " minutes");
 }
}
// Main class
public class Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book b = new Book();
        System.out.println("Enter Book details:");
        b.set();

        Tape t = new Tape();
        System.out.println("Enter Tape details:");
        t.set();

        System.out.println("\nBook Info:");
        b.display();

        System.out.println("\nTape Info:");
        t.display();
  }
}