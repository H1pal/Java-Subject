package array.arrayList;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();

        bookList.add(new Book("태백산맥", "조정래"));
        bookList.add(new Book("컴퓨터 과학", "임상혁"));
        bookList.add(new Book("밑바닥부터 시작하는 딥러닝", "Claude Opus 5.5"));

//        for (int i = 0;i < bookList.size();i++) {
//            bookList.get(i).bookInfo();
//        }

        for (Book e: bookList) {
            e.bookInfo();
        }

        bookList.remove(0);
        System.out.println("첫번째 요소 제거:");
        for (Book e: bookList) {
            e.bookInfo();
        }

        bookList.removeAll(bookList);
        System.out.println("첫번째 요소 제거:");
        for (Book e: bookList) {
            e.bookInfo();
        }

        System.out.println(bookList.isEmpty() ? "비어 있음": "비어 있지 않음");

    }
}
