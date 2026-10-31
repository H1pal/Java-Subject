package test02.problem01;

import java.util.Scanner;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    public int getRerimeter() {
        return (width+height)*2;
    }

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
