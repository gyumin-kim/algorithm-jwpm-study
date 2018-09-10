package examples.test.chap02;

import java.util.Scanner;

public class Prac8 {
    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
    };

    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    static int dayOfYear(int y, int m, int d) {
        m -= 2;
        while (m >= 0)
            d += mdays[isLeap(y)][m--];

        return d;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int retry;

        System.out.println("그 해 경과 일수를 구합니다.");

        do {
            System.out.print("년: ");
            int year = in.nextInt();
            System.out.print("월: ");
            int month = in.nextInt();
            System.out.print("일: ");
            int day = in.nextInt();

            System.out.printf("그 해 %d일째 입니다.\n", dayOfYear(year, month, day));

            System.out.print("한 번 더 할까요? (1.예 / 2.아니오): ");
            retry = in.nextInt();
        } while (retry == 1);
    }
}
