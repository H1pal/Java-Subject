package cooperation;

public class Subway {
    private int income;
    private int lineNumber;
    private int passengerAmount;

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void takePassenger() {
        income += 850;
        passengerAmount++;
    }

    public void showInfo() {
        System.out.printf("[%d] 현재 지하철은 %d원의 수익과 %d의 승객이 탑승하고 있습니다.\n", lineNumber, income, passengerAmount);
    }
}
