package inheritance;

public class Customer {
    protected int customerID; // 고객 아이디
    protected String customerName; // 고객 이름
    protected String customerGrade; // 고객 등급
    int bonusPoints; // 보너스 포인트
    double bonusRatio; // 보너스 포인트 적립 비율

    public Customer() {
        customerGrade = "SILVER";
        bonusRatio = 0.1;
        System.out.println("상위 클래스 Customer() 생성자 호출");
    }

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        bonusRatio = 0.1;
        customerGrade = "SILVER";
        System.out.println("상위 클래스 Customer(int, String) 생성자 호출");
    }

    int calcPrice(int price) {
        bonusPoints += (int) (bonusRatio * price);
        return price;
    }

    String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoints +
                "포인트가 적립되어 있습니다.\n";
    }
}
