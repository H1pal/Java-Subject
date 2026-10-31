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
}
