package test02.problem05;

public class Notebook {
    private int totalCount;
    private int rentNotebook;

    public Notebook() {
        this.totalCount = 5;
        this.rentNotebook = 0;
    }

    public void rentNotebook(int rents) {
        if (rents > 0 && rents <= totalCount) {
            rentNotebook += rents;
        }
        else System.out.println("노트북을 대여할 수 없습니다.");
    }

    public void returnNotebook(int returns) {
        if (returns > 0 && returns <= rentNotebook) rentNotebook -= returns;
        else System.out.println("노트북을 반납할 수 없습니다.");
    }

    public void showInfo() {
        System.out.printf("전체 노트북: %d대\n대여 중: %d대\n남은 노트북: %d대\n", totalCount, rentNotebook, totalCount - rentNotebook);
    }
}
