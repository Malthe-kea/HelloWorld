public class DigitalClockDemo {
    public static void main(String[] args) {
        ClockDisplay ur = new ClockDisplay();

        for (int i = 0; i < 600; i++) {
            ur.timeTick();
            System.out.println(ur.getDisplayString());
        }
    }
}
