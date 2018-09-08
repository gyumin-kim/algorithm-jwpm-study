package examples.test.chap01;

import java.util.Scanner;

public class Exam1C_1 {
    // 세 정수의 중앙값을 구한다
    static int med3(int a, int b, int c) {
        if (a >= b) {
            if (b >= c)
                return b;
            else if (c >= a)
                return a;
            else return c;
        }
        else if (a > c)
            return a;
        else if (b > c)
            return c;
        else return b;
    }

    static int med3_2(int a, int b, int c) {
        if (b <= a) {   // b a
            if (c <= b) // c b a
                return b;
            else if (a <= c)  // b a c
                return a;
            else return c;  // b c a
        }
        else if (c < a) // c a (b)
            return a;
        else if (c < b) // c b (a)
            return b;
        else return b;  // a b c
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("세 정수의 중간값을 구한다");
        System.out.print("a의 값: ");
        int a = in.nextInt();
        System.out.print("b의 값: ");
        int b = in.nextInt();
        System.out.print("c의 값: ");
        int c = in.nextInt();

        System.out.println("중앙값: " + med3_2(a, b, c));
    }
}