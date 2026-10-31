package test02.problem02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        VendingMachine machine = new VendingMachine("콜라", 1500, 10);
        int orders = sc.nextInt(); sc.nextLine();
        machine.sell(orders);

        System.out.println("==판매 후==");
        machine.showInfo();
    }
}
