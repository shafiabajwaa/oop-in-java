public class Car {

    String company;
    String carColor;
    int carSpeed;

    void setDetails(String comp, String col, int sp) {
        company = comp;
        carColor = col;
        carSpeed = sp;
    }

    void showCar() {
        System.out.println("Brand: " + company);
        System.out.println("Color: " + carColor);
        System.out.println("Speed: " + carSpeed);
    }

    public static void main(String[] args) {

        Car obj = new Car();

        obj.setDetails("Honda", "Black", 140);
        obj.showCar();
    }
}