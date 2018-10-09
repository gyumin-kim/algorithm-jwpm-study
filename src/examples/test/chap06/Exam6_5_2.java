package examples.test.chap06;

import java.util.Scanner;

public class Exam6_5_2 {
    static int compareCount = 0;
    static int swapCount = 0;

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubbleSort(int[] a, int n) {
        int k = 0;
        int pass = 1;
        int leftLast = k;
        int rightLast = n - 1;

        if (pass % 2 == 1) {
            while (k < n - 1) {
                rightLast = n - 1;
                System.out.println("패스" + pass + ":");
                for (int j = rightLast; j > leftLast; j--) {
                    compareCount++;
                    //
                    if (a[j - 1] > a[j]) {
                        System.out.print(" ");
                        for (int m = 0; m < j; m++)
                            System.out.print(a[m] + "   ");

                        System.out.print(a[j] + " + ");

                        for (int m = j + 1; m < n; m++)
                            System.out.print(a[m] + "   ");

                        rightLast = j;
                        swap(a, j - 1, j);
                        swapCount++;
                        System.out.println();
                    }
                    else {
                        System.out.print(" ");
                        for (int m = 0; m < j; m++)
                            System.out.print(a[m] + "   ");

                        System.out.print(a[j] + " - ");

                        for (int m = j + 1; m < n; m++)
                            System.out.print(a[m] + "   ");

                        System.out.println();
                    }
                }
                System.out.print(" ");
                for (int l = 0; l < n; l++) {
                    System.out.print(a[l] + "   ");
                }
                k = rightLast;
                pass++;
                System.out.println();
            }
        } else {
            while (k < n - 1) {
                leftLast = 0;
                System.out.println("패스" + pass + ":");
                for (int j = leftLast; j < rightLast; j++) {
                    compareCount++;
                    //
                    if (a[j] > a[j+1]) {
                        System.out.print(" ");
                        for (int m = 0; m < j; m++)
                            System.out.print(a[m] + "   ");

                        System.out.print(a[j] + " + ");

                        for (int m = j + 1; m < n; m++)
                            System.out.print(a[m] + "   ");

                        leftLast = j;
                        swap(a, j - 1, j);
                        swapCount++;
                        System.out.println();
                    }
                    else {
                        System.out.print(" ");
                        for (int m = 0; m < j; m++)
                            System.out.print(a[m] + "   ");

                        System.out.print(a[j] + " - ");

                        for (int m = j + 1; m < n; m++)
                            System.out.print(a[m] + "   ");

                        System.out.println();
                    }
                }
                System.out.print(" ");
                for (int l = 0; l < n; l++) {
                    System.out.print(a[l] + "   ");
                }
                k = leftLast;
                pass++;
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] x = { 9, 1, 3, 4, 6, 7, 8 };
        bubbleSort(x, 7);

        System.out.println();
        System.out.println("비교를 " + compareCount + "회 했습니다.");
        System.out.println("교환을 " + swapCount + "회 했습니다.");
    }
}
