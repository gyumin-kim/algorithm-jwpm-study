package examples.test.chap01;

import java.util.Scanner;

public class Exam1_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1부터 n까지의 합을 구한다");
        System.out.print("n의 값: ");
        int n = in.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("1부터 " + n + "까지의 합: " + sum);
    }
}
