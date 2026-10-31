package StreamOthers.ioTest.IOex5;

public class Car {
    private String model;
    private String color;
    private long price;

    public Car (String type, String color, long price) {
        this.model = type;
        this.color = color;
        this.price = price;
    }

    public void showCar() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("price: " + price);
    }
}
