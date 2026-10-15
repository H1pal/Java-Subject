package cooperation;

public class Bus {
    private int busNumber;
    private int passengersAmount;
    private int income;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void takePassenger() {
        income += 1100;
        passengersAmount++;
    }

    public void showInfo() {
        System.out.printf("[%d] 현재 총 %d원의 수익과 %d명의 승객이 탑승하고 있습니다.\n", busNumber, income, passengersAmount);
    }
}
