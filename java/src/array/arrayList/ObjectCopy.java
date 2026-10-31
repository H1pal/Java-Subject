package array.arrayList;

public class ObjectCopy {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        Book[] booksCopy = new Book[5];

        books[0] = new Book("데미안", "헤르만 헤세");
        books[1] = new Book("태백산맥", "조정래");
        books[2] = new Book("연을 쫓는 아이", "할레드 호세이니");
        books[3] = new Book("컴퓨터 보안", "임상혁");
        books[4] = new Book("어린왕자", "생텍쥐페리");

        // 인스턴스를 새롭게 생성하여 배열 복사 => 같은 인스턴스 주소를 가지는 것을 방지
        for (int i = 0;i < booksCopy.length;i++) booksCopy[i] = new Book();
//        booksCopy[0] = new Book();
//        booksCopy[1] = new Book();
//        booksCopy[2] = new Book();
//        booksCopy[3] = new Book();
//        booksCopy[4] = new Book();

        for (int i = 0;i < books.length;i++) {
            booksCopy[i].setBookName(books[i].getBookName());
            booksCopy[i].setAuthor(books[i].getAuthor());
        }

        // books를 수정하여도 booksCopy는 수정되지 않는 것을 확인할 수 있음
        books[0].setBookName("니코마코스의 윤리학");
        books[0].setAuthor("아리스토텔레스");

        System.out.println("==books==");
        for (final Book book: books) book.bookInfo();
        System.out.println("\n==copied books==");
        for (final Book book: booksCopy) book.bookInfo();
    }
}
