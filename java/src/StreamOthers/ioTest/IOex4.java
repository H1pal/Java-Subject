package StreamOthers.ioTest;

import java.util.Scanner;

public class IOex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();

        for (int i = 0;i < height;i++) {
            for (int j = 0;j < height-i-1;j++) {
                System.out.print(" ");
            }
            for (int j = 0;j < i*2+1;j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
