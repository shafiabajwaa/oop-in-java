public class Marks {

    private int mark1;
    private int mark2;
    private int mark3;

    public void setMark1(int m1) {
        mark1 = m1;
    }

    public void setMark2(int m2) {
        mark2 = m2;
    }

    public void setMark3(int m3) {
        mark3 = m3;
    }

    public int getMark1() {
        return mark1;
    }

    public int getMark2() {
        return mark2;
    }

    public int getMark3() {
        return mark3;
    }

    public static void main(String[] args) {

        Marks obj = new Marks();

        obj.setMark1(80);
        obj.setMark2(75);
        obj.setMark3(90);

        System.out.println("Mark 1: " + obj.getMark1());
        System.out.println("Mark 2: " + obj.getMark2());
        System.out.println("Mark 3: " + obj.getMark3());
    }
}