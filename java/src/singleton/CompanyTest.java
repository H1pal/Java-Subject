package singleton;

public class CompanyTest {
    public static void main(String[] args) {
//        Company componyA = new Company(); // Company의 생성자가 private이기 때문에 접근 불가능
        Company companyA = Company.getInstance();
        Company companyB = Company.getInstance();

        System.out.println(companyA == companyB); // 하나의 인스턴스 주소값에 참조하고 있음을 알 수 있음 => 인스턴스는 항상 하나임
    }
}
