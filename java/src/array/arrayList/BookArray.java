package array.arrayList;

public class BookArray {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        Book[] booksCopy = new Book[5];

        // 객체 배열의 초기값은 null
        for (final Book book: books) System.out.print(book + " ");

        books[0] = new Book("데미안", "헤르만 헤세");
        books[1] = new Book("태백산맥", "조정래");
        books[2] = new Book("연을 쫓는 아이", "할레드 호세이니");
        books[3] = new Book("컴퓨터 보안", "임상혁");
        books[4] = new Book("어린왕자", "생텍쥐페리");


        System.out.println("\n==books==");
        for (final Book book: books) book.bookInfo();

        System.arraycopy(books, 0, booksCopy, 0, books.length);
        // arraycopy로 객체 배열 복사

        // arraycopy는 각 인스턴스들의 주소를 복사함 => books와 booksCopy는 같은 인스턴스들을 담고 있음
        books[0].setBookName("니코마코스의 윤리학");
        books[0].setAuthor("아리스토텔레스");

        System.out.println("\n==copied books==");
        for (final Book book: booksCopy) book.bookInfo();
    }
}
