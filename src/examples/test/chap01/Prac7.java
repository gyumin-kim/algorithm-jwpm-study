package examples.test.chap01;

import java.util.Scanner;

public class Prac7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1부터 n까지의 합 출력");
        System.out.print("n의 값: ");
        int n = in.nextInt();

        int i = 1;
        int sum = 0;
        while (i < n) {
            System.out.print(i + " + ");
            sum += i;
            i++;
        }
        sum += i;
        System.out.print(i + " = " + sum);
    }
}
