public class Time {

    int hr;
    int minute;
    int second;

    void assignTime(int h, int m, int s) {
        hr = h;
        minute = m;
        second = s;
    }

    void showTime() {
        System.out.println("Current Time: " + hr + ":" + minute + ":" + second);
    }

    public static void main(String[] args) {

        Time obj = new Time();

        obj.assignTime(9, 15, 30);
        obj.showTime();
    }
}