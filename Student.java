public class Student {

    int id;
    String studentName;
    String program;

    void showDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + studentName);
        System.out.println("Program: " + program);
    }

    void attendClass() {
        System.out.println("Student is attending: " + program);
    }

    public static void main(String[] args) {

        Student obj = new Student();
        obj.id = 201;
        obj.studentName = "Sara";
        obj.program = "CS";

        obj.showDetails();
        obj.attendClass();
    }
}