package test02.problem03;

public class Cinema {
    private String title;
    private int availableSeats;

    public Cinema(String title, int availableSeats) {
        this.title = title;
        this.availableSeats = availableSeats;
    }

    public void reserve(Customer customer, int count) {
        if (count <= 0) System.out.println("올바른 좌석 수를 입력하세요.");
        else if (count > availableSeats) System.out.println("예약 가능한 좌석이 부족합니다.");
        else {
            availableSeats -= count;
            customer.addReservation(count);
        }
    }

    public void showInfo() {
        System.out.printf("영화 제목: %s\n남은 좌석: %d석", title, availableSeats);
    }
}
