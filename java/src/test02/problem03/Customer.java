package test02.problem03;

public class Customer {
    private String name;
    private int reservedSeats;

    public Customer(String name) {
        this.name = name;
        this.reservedSeats = 0;
    }

    public void addReservation(int reservation) {
        reservedSeats += reservation;
    }

    public void showInfo() {
        System.out.printf("%s: %d석\n", name, reservedSeats);
    }
}
