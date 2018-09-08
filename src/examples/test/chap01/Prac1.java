package examples.test.chap01;

import java.util.Scanner;

public class Prac1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("네 정수의 최대값을 구한다");
        System.out.print("a값 입력: ");
        int a = in.nextInt();
        System.out.print("b값 입력: ");
        int b = in.nextInt();
        System.out.print("c값 입력: ");
        int c = in.nextInt();
        System.out.print("d값 입력: ");
        int d = in.nextInt();

        int max = max4(a, b, c, d);
        System.out.println("최대값은 " + max);
    }

    static int max4(int a, int b, int c, int d) {
        int max = a;
        if (b > max)    max = b;
        if (c > max)    max = c;
        if (d > max)    max = d;

        return max;
    }
}
