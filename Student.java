public class Student {
    private String name;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}


    public void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Ali");
        String studentname = s1.getName();

        System.out.println("Student Name: " + studentname);
    }
