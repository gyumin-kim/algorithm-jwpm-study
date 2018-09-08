package examples.test.chap02;

import java.util.Random;
import java.util.Scanner;

public class Exam2_5 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        System.out.println("키의 최대값을 구한다.");
        System.out.print("사람 수: ");
        int num = in.nextInt();
        int[] height = new int[num];

        for (int i = 0; i < num; i++) {
            height[i] = 100 + random.nextInt(90);
//            height[i] = (int)(Math.random() * 90) + 100;
            System.out.println("height[" + i + "]: " + height[i]);
        }

        System.out.println("최대값: " + maxOf(height));
    }

    static int maxOf(int[] a) {
        int max = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[max]) max = i;
        }

        return a[max];
    }
}
