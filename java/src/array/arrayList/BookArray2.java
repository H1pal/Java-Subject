package array.arrayList;

public class BookArray2 {
    public static void main(String[] args) {
        Book b1 = new Book("태백산맥", "조정래");
        Book b2 = new Book("데미안", "헤르만 헤세");
        Book b3 = new Book("연을 쫓는 아이", "할레드 호세이니");
        Book b4 = new Book("컴퓨터 보안", "임상혁");
        Book b5 = new Book("어린왕자", "생텍쥐페리");

        b1.bookInfo();
        b2.bookInfo();
        b3.bookInfo();
        b4.bookInfo();
        b5.bookInfo();
    }
}
