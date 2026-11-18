package inheritance;

public class CustomerTest2 {
    public static void main(String[] args) {
        Customer customerVIP = new VIPCustomer();
        // 업캐스팅(upcasting): 하위클래스의 자료형을 부모클래스의 자료형으로 형변환

//        VIPCustomer customerVIP2 = new Customer();
        // 자식 클래스의 자료형을 가진 부모 클래스를 할당시키지 못함

    }
}
