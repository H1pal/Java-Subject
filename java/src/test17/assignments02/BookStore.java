package test17.assignments02;

public class BookStore {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();

        b1.setTitle("연을 쫓는 아이");
        b1.setAuthor("할레드 호세이니");
        b1.setPrice(18000);

        b2.setTitle("오디세이아");
        b2.setAuthor("호메로스");
        b2.setPrice(27000);

        System.out.println(b1.getInfo());
        System.out.println(b2.getInfo());
    }
}
