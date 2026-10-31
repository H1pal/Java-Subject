package StreamOthers.ioTest.IOex5;

import java.util.Scanner;

public class CarStore {
    public static void main(String[] args) {
        int amount = 3;
        Scanner sc = new Scanner(System.in);

        Car[] cars = new Car[amount];
        for (int i = 0;i < amount;i++) {
            System.out.println("차종/색상/가격을 순서대로 입력해주세요.");

            String model = sc.nextLine();
            String color = sc.nextLine();
            long price = sc.nextLong();
            sc.nextLine(); // 버퍼 비우기

            cars[i] = new Car(model, color, price);
        }

        for (int i = 0;i < amount;i++) {
            System.out.println("보유 차량: " + (i+1));
            cars[i].showCar();
        }
    }
}
