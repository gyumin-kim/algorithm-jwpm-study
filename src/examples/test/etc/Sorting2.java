package examples.test.etc;

import java.util.Scanner;

public class Sorting2 {
    public static void swap(int[] a, int idx1, int idx2) {
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }

    public static void insertionSort(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j-1] > a[j]) {
                    swap(a, j, j-1);
                }
            }
        }
    }

    public static void bubbleSort(int[] a, int n) {
        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j+1])  swap(a, j, j+1);
            }
        }
    }

    public static void print(int[] a) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];

        // 배열에 들어갈 n개의 정수를 입력 받는다.
        for (int i = 0; i < n; i++)
            a[i] = in.nextInt();

        bubbleSort(a, n);
        print(a);
    }
}