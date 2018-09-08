package examples.test.chap01;

import java.util.Scanner;

public class Prac2 {
    public static void main(String[] args) {
        System.out.println("세 정수의 최소값을 구한다");
        Scanner in = new Scanner(System.in);
        System.out.print("a 입력: ");
        int a = in.nextInt();
        System.out.print("b 입력: ");
        int b = in.nextInt();
        System.out.print("c 입력: ");
        int c = in.nextInt();

        int min = min3(a, b, c);
        System.out.println("최소값은 " + min);
    }

    static int min3(int a, int b, int c) {
        int min = a;
        if (b < min)    min = b;
        if (c < min)    min = c;

        return min;
    }
}
