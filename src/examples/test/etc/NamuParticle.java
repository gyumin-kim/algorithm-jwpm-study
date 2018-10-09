package examples.test.etc;

import java.util.Scanner;

public class NamuParticle {
    public static void bubbleSort(int[] a) {
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j+1]) {
                    swap(a, j, j+1);
                    print(a);
                }
            }
        }
    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < 5; i++)
            a[i] = in.nextInt();

        bubbleSort(a);
    }
}