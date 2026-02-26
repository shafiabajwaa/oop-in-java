public class Student {

    private String name;
    private int rollNo;
    private double marks;

    private static String universityName = "Comsats University";
    private static int studentCount = 0;

    public final double MAX_MARKS = 100;

    public Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        studentCount++;
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        calculateGrade();
        System.out.println();
    }

    public void calculateGrade() {
        if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }
    }

    public static void displayUniversity() {
        System.out.println("University: " + universityName);
        System.out.println("Total Students: " + studentCount);
        System.out.println();
    }

    public final void showMaxMarks() {
        System.out.println("Maximum Marks: " + MAX_MARKS);
    }

    public static void main(String[] args) {

        Student s1 = new Student("Ali", 101, 85);
        Student s2 = new Student("Sara", 102, 67);

        s1.displayStudentInfo();
        s2.displayStudentInfo();

        s1.showMaxMarks();

        displayUniversity();

       
    }
}