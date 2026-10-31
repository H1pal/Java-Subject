package StreamOthers.ioTest;

import java.util.ArrayList;
import java.util.Scanner;

public class IOex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0;i < 10;i++) {
            arr.add(sc.nextInt());
        }
        for (int i: arr) System.out.print(i + " ");
    }
}
