package examples.test.chap01;

import java.util.Scanner;

public class Prac11 {
    public static void main(String[] args) {
        System.out.println("양의 정수의 자릿수를 출력");
        Scanner in = new Scanner(System.in);
        System.out.print("양의 정수 n 입력: ");
        int n = in.nextInt();

        int digit = getDigit(n);
        System.out.println("그 수는 " + digit + "자리입니다.");
    }

    static int getDigit(int n) {
        int digit = 0;
        do {
            n /= 10;
            digit++;
        } while (n > 0);

        return digit;
    }
}
