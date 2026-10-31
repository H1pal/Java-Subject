package test02.problem03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cinema cinema = new Cinema("어벤져스", 10);
        Customer c1 = new Customer("홍길동");
        Customer c2 = new Customer("김철수");

        int c1_reservation = sc.nextInt(); sc.nextLine();
        int c2_reservation = sc.nextInt(); sc.nextLine();

        cinema.reserve(c1, c1_reservation);
        cinema.reserve(c2, c2_reservation);

        System.out.println("==예약 결과==");
        c1.showInfo();
        c2.showInfo();
        cinema.showInfo();
    }
}
