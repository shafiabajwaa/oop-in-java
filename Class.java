public class Student {
    private String name;
    private int[] result;
    public Student(String n, int[] r) {
        name = n;
        result = r;
    }
    public double average() {
        int sum = 0;
        for (int i = 0; i < result.length; i++) {
            sum = sum + result[i];
        }
      return (double) sum / result.length;
    }
    public String getName() {
        return name;
    }
    public static void main(String[] args) {

        int[] marks1 = {80, 85, 78, 90, 88};
        int[] marks2 = {70, 75, 72, 68, 74};

        Student s1 = new Student("Ali", marks1);
        Student s2 = new Student("Sara", marks2);
        double avg1 = s1.average();
        double avg2 = s2.average();

        System.out.println(s1.getName() + " Average: " + avg1);
        System.out.println(s2.getName() + " Average: " + avg2);

        if (avg1 > avg2) {
            System.out.println(s1.getName() + " has higher average");
        } else {
            System.out.println(s2.getName() + " has higher average");
        }
        Student s3 = new Student(s1.getName(), marks2);

        System.out.println("Third Student Name: " + s3.getName());
        System.out.println("Third Student Average: " + s3.average());
    }}
