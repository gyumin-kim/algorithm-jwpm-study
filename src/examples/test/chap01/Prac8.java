package examples.test.chap01;

import java.util.Scanner;

public class Prac8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1부터 n까지의 합 출력(가우스 덧셈): ");
        System.out.print("n의 값: ");
        int n = in.nextInt();

        System.out.print("1부터 n까지의 합(가우스 덧셈): ");
        System.out.println(gaussSum(n));
    }

    static int gaussSum(int n) {
        int sum;

        if (n % 2 == 1) {
            sum = n * (n / 2);
            sum += n;
        }
        else
            sum = (1 + n) * (n / 2);

        return sum;
    }
}
