package objectOriented.assignments.assignments01;

public class Order {
    public long orderID;
    public String customerID;
    public String orderDate;
    public String customerName;
    public String productID;
    public String address;

    public void showInfo() {
        System.out.println("주문 번호: " + orderID);
        System.out.println("주문자 아이디: " + customerID);
        System.out.println("주문 날짜: " + orderDate);
        System.out.println("주문자 이름: " + customerName);
        System.out.println("주문 상품 번호: " + productID);
        System.out.println("배송 주소: " + address);
    }
}
