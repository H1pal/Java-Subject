package test17.assignments01;

import java.util.function.ObjDoubleConsumer;

public class OrderTest {
    public static void main(String[] args) {
        Order o1 = new Order();
        o1.orderID = 202609013;
        o1.customerID = "dgsw";
        o1.orderDate = "2026년 9월 1일";
        o1.customerName = "홍길동";
        o1.productID = "PD0345-12";
        o1.address = "대구광역시 달성군 구지면 창리로 93";

        o1.showInfo();
    }
}
