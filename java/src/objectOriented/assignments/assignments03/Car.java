package objectOriented.assignments.assignments03;

public class Car {
    public static int serial = 10000;

    private int carNum;

    public Car() {
        carNum = ++serial;
    }

    public int getCarNum() {
        return carNum;
    }
}
