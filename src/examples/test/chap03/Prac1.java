package examples.test.chap03;

import java.util.Scanner;

public class Prac1 {
    static int seqSearchSen(int[] a, int n, int key) {
        int i = 0;

        a[n] = key; // sentinel

        for (i = 0; ; i++) {
            if (a[i] == key)    break;
        }

        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = in.nextInt();
        int[] x = new int[num + 1];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = in.nextInt();
        }

        System.out.print("검색할 값: ");
        int key = in.nextInt();
        int index = seqSearchSen(x, num, key);

        if (index == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(key + "은(는) x[" + index + "]에 있습니다.");
    }
}
