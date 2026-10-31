package StreamOthers;

import java.util.Arrays;
import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름: ");
        String name = sc.nextLine();

        System.out.print("직업: ");
        String job = sc.nextLine();

        System.out.print("사번: ");
        int num = sc.nextInt(); // System.in에서 숫자만 받음 -> 마지막에 Enter('\n') 버퍼가 남음

        sc.nextLine(); // 남은 Enter 버퍼 비우기 (없으면 전화번호 입력하지 못함)
        System.out.print("전번: ");
        String tel = sc.nextLine();

        System.out.printf("%s님 안녕하세요! 당신은 %d번쨰 %s으로 환생하엿습니다. %s로 전화주세요", name, num, job, tel);
    }
}
