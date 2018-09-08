package examples.test.chap01;

import java.util.Scanner;

public class Prac9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("정수 a부터 b까지의 합 출력");
        System.out.print("정수 a 입력: ");
        int a = in.nextInt();
        System.out.print("정수 b 입력: ");
        int b = in.nextInt();

        System.out.println(sumof(a, b));
    }

    static int sumof(int a, int b) {
        int sum = 0;

        if (a < b) {
            for (int i = a; i <= b; i++)
                sum += i;
            return sum;
        }
        else if (b < a) {
            for (int i = b; i <= a; i++)
                sum += i;
            return sum;
        }
        else return a + b;
    }
}
