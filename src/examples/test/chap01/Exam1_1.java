package examples.test.chap01;

import java.util.Scanner;

public class Exam1_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("세 정수의 최대값을 구한다");
        System.out.print("a의 값: ");
        int a = in.nextInt();
        System.out.print("b의 값: ");
        int b = in.nextInt();
        System.out.print("c의 값: ");
        int c = in.nextInt();

        int max = a;
        if (b > max)    max = b;
        if (c > max)    max = c;

        System.out.println("최대값은 " + max);
    }
}
