import java.util.Date;

class Person {
    protected String name;
    protected String address;
    protected String phone;
    protected String email;

    public Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
}

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
  }
}

class Student extends Person {
    private String status;

    public Student(String name, String address, String phone, String email, String status) {
        super(name, address, phone, email);
        this.status = status;
  }

    @Override
    public void display() {
        super.display();
        System.out.println("Status: " + status);
    }}

// Employee subclass
class Employee extends Person {
    protected String office;
    protected double salary;
    protected Date dateHired;

    public Employee(String name, String address, String phone, String email,
                    String office, double salary, Date dateHired) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Office: " + office);
        System.out.println("Salary: " + salary);
        System.out.println("Date Hired: " + dateHired);
  }
}

// Faculty subclass
class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phone, String email,
                   String office, double salary, Date dateHired, String officeHours, String rank) {
        super(name, address, phone, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Office Hours: " + officeHours);
        System.out.println("Rank: " + rank);
  }
}
// Staff subclass
class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phone, String email,
                 String office, double salary, Date dateHired, String title) {
        super(name, address, phone, email, office, salary, dateHired);
        this.title = title;
    }
  @Override
    public void display() {
        super.display();
        System.out.println("Title: " + title);
    }
}

// Test class
public class Lab1Test {
    public static void main(String[] args) {
        Student s = new Student("Ali", "Street123", "123456789", "ali@email.com", "Freshman");
        s.display();
        System.out.println();

        Date d = new Date();
        Faculty f = new Faculty("Dr.Ahmed", "Street456", "987654321", "ahmed@email.com",
                                "B12", 50000, d, "9-5", "Professor");
        f.display();
        System.out.println();

        Staff st = new Staff("Sara", "Street789", "1122334455", "sara@email.com",
                             "A10", 40000, d, "Secretary");
        st.display();
    }
}