package inheritance;

public class VIPCustomer extends Customer {
    private int agentID;
    double saleRatio;

    public VIPCustomer() {
        super(); // 상위 클래스의 생성자를 호출하여 생성(컴파일러가 기본적으로 생성)

        customerGrade = "VIP";
        bonusRatio = 0.5;
        saleRatio = 0.1;
        System.out.println("하위 클래스 VIPCustomer() 생성자 호출");
    }

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName); // 하위 클래스의 생성자는 기본적으로 부모 클래스의 매개변수가 없는 생성자를 기본적으로 호출
        this.customerID = customerID;
        this.customerName = customerName;
        this.agentID = agentID;
        customerGrade = "VIP";
        bonusRatio = 0.5;
        saleRatio = 0.1;
        System.out.println("하위 클래스 VIPCustomer(int, String) 생성자 호출");
    }

    public int getAgentID() {
        return agentID;
    }

    public String showVIPCustomerInfo() {
        return super.showCustomerInfo() + "상담원 아이디는 " + getAgentID() + "입니다.";
    }
}
