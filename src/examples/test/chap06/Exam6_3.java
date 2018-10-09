package examples.test.chap06;

import java.util.Scanner;

public class Exam6_3 {
    static int compareCount = 0;
    static int swapCount = 0;

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubbleSort(int[] a, int n) {
        for (int i = 0; i < n-1; i++) {
            int exchg = 0;
            System.out.println("패스" + (i+1) + ":");
            for (int j = 0; j < n-i-1; j++) {
                compareCount++;

                System.out.print(" ");
                for (int k = 0; k < j; k++)
                    System.out.print(a[k] + "   ");
                System.out.print(a[j] + ((a[j] > a[j+1]) ? " + " : " - "));
                for (int k = j+1; k < n; k++)
                    System.out.print(a[k] + "   ");
                System.out.println();

                if (a[j] > a[j+1]) {
                    swap(a, j, j + 1);
                    swapCount++;
                    exchg++;
                }

//                if (a[j] > a[j+1]) {
//                    System.out.print(" ");
//                    for (int k = 0; k < j; k++)
//                        System.out.print(a[k] + "   ");
//
//                    System.out.print(a[j] + " + ");
//
//                    for (int k = j+1; k < n; k++)
//                        System.out.print(a[k] + "   ");
//
//                    swap(a, j, j + 1);
//                    swapCount++;
//                    exchg++;
//                    System.out.println();
//                }
//                else {
//                    System.out.print(" ");
//                    for (int k = 0; k < j; k++)
//                        System.out.print(a[k] + "   ");
//
//                    System.out.print(a[j] + " - ");
//
//                    for (int k = j+1; k < n; k++)
//                        System.out.print(a[k] + "   ");
//
//                    System.out.println();
//                }
            }
            System.out.print(" ");
            for (int l = 0; l < n; l++) {
                System.out.print(a[l] + "   ");
            }
            if (exchg == 0) break;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] x = { 6, 4, 3, 7, 1, 9, 8 };
        bubbleSort(x, 7);

        System.out.println();
        System.out.println("비교를 " + compareCount + "회 했습니다.");
        System.out.println("교환을 " + swapCount + "회 했습니다.");
    }
}
