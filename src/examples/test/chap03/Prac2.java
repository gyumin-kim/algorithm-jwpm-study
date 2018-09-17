package examples.test.chap03;

import java.util.Scanner;

public class Prac2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = 7;
        int[] arr = { 6, 4, 3, 2, 1, 9, 8 };
        int key = 2;

        System.out.print("  |  ");
        for (int i = 0; i < len; i++)
            System.out.print(i + "  ");
        System.out.println("");
        System.out.println("---------------------------");

        for (int i = 0; i < len; i++) {
            // 별 출력되는 line
            System.out.print("  | ");

            for (int j = 0; j < i; j++)
                System.out.print("   ");
            System.out.print(" *  ");
            for (int j = i+1; j < len; j++)
                System.out.print("  ");

            System.out.println("");

            // 배열 요소들 출력되는 line
            System.out.print(" " + i + "|  ");
            for (int j = 0; j < len; j++)
                System.out.print(arr[j] + "  ");
            System.out.println("");

            if (arr[i] == key) {
                System.out.println(key + "은(는) x[" + i + "]에 있습니다.");
                break;
            }
            System.out.println("  |");
        }
    }
}
