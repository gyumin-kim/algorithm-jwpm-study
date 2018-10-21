package examples.test.chap06;

import java.util.Scanner;

public class Prac8 {
    public static int binarySearch(int[] a, int i, int key) {
        int pl = 0;
        int pr = i-1;
        int pc;

        do {
            pc = (pl + pr) / 2;
            if (a[pc] == key)
                break;
            else if (a[pc] < key)
                pl = pc + 1;
            else
                pr = pc - 1;
        } while (pl <= pr);

        return (pl <= pr) ? pc + 1 : pr + 1;
    }

    public static void binaryInsertionSort(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            int j;
            int tmp = a[i];

            int insertionPoint = binarySearch(a, i, tmp);
            System.out.println("i: " + i + ", insertionPoint: " + insertionPoint);
            for (j = i; j > insertionPoint; j--)
                a[j] = a[j-1];
            a[insertionPoint] = tmp;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("이진 삽입 정렬");
        System.out.print("요솟수: ");
        int nx = in.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = in.nextInt();
        }

        binaryInsertionSort(x, nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++)
            System.out.println("x[" + i + "] = " + x[i]);
    }
}
