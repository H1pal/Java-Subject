package test02.problem01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("가로: ");
        int width = sc.nextInt();
        System.out.print("세로: ");
        int height = sc.nextInt();

        Rectangle rect = new Rectangle(width, height);

        System.out.println("넓이: " + rect.getArea());
        System.out.println("넓이: " + rect.getRerimeter());
    }
}
