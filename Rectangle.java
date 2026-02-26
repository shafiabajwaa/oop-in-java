public class Rectangle {

    int length;
    int breadth;

    void setValues(int l, int b) {
        length = l;
        breadth = b;
    }

    void showRectangle() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
    }

    public static void main(String[] args) {

        Rectangle obj = new Rectangle();

        obj.setValues(12, 6);
        obj.showRectangle();
    }
}