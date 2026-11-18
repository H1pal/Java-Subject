package inheritance;

public class CustomerTest {
    public static void main(String[] args) {
//        Customer customerLee = new Customer();
//        customerLee.customerID = 10010;
//        customerLee.customerName = "이우주";
//        customerLee.bonusPoints = 1000;
//        System.out.println(customerLee.showCustomerInfo());

//        VIPCustomer customerMoon = new VIPCustomer();
//        customerMoon.customerID = 10011;
//        customerMoon.customerName = "문성준";
//        customerMoon.bonusPoints = 50000;
//        System.out.println(customerMoon.showCustomerInfo());

        VIPCustomer customerHa = new VIPCustomer(20011, "하강호", 1101);
        customerHa.customerID = 20011;
        customerHa.bonusPoints = 20000;
        System.out.println(customerHa.showVIPCustomerInfo());
    }
}
