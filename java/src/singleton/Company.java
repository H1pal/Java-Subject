package singleton;

public class Company {
    /* singleton(싱글톤) 패턴 */

    // 해당 인스턴스 하나만 사용되도록 private static으로 지정
    private static Company company = new Company();

    // private으로 지정하여 인스턴스가 여러 개 생성되는 것을 방지
    private Company() {}

    public static Company getInstance() {
        if (company == null)
            company = new Company();
        return company;
    }
}
