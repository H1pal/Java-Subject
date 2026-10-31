package test02.problem04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPrice = 0;

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("234하 5678", "teslar", 100000));
        cars.add(new Car("555허 2158", "sonata", 70000));
        cars.add(new Car("123호 4567", "genesis", 90000));

        System.out.println("대여 차량(1.teslar, 2.sonata, 3.genesis)와 대여일수를 입력하세요.");
        int num = sc.nextInt(); sc.nextLine();
        int day = sc.nextInt(); sc.nextLine();

        if (num > 3 || num <= 0) System.out.println("잘못된 입력입니다.");
        else totalPrice = cars.get(num-1).rent() * day;

        for (Car car: cars) {
            car.showInfo();
            System.out.println();
        }
        System.out.println("총 대여 금액: " + totalPrice);
    }
}
