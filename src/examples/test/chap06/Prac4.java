package examples.test.chap06;

public class Prac4 {
    static int compareCount = 0;
    static int swapCount = 0;

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void printJ(int[] a, int j, int n) {
        System.out.print(" ");
        for (int m = 0; m < j-1; m++)
            System.out.print(a[m] + "   ");
        System.out.print(a[j-1]);
        System.out.print(((a[j-1] > a[j]) ? " + " : " - ") + a[j] + "   ");
        for (int m = j+1; m < n; m++)
            System.out.print(a[m] + "   ");
        System.out.println();
    }

    static void bubbleSort(int[] a, int n) {
        int k = 0;
        int pass = 1;
        while (k < n-1) {   // pass 단위
            int last = n - 1;
            System.out.println("패스" + pass + ":");
            for (int j = n-1; j > k; j--) { // k: 지난번 pass에서 마지막으로 정렬한 곳(j)
                compareCount++;
                printJ(a, j, n);

                if (a[j-1] > a[j]) {
                    swap(a, j-1, j);
                    last = j;
                    swapCount++;
                }
            }
            System.out.print(" ");
            for (int l = 0; l < n; l++)
                System.out.print(a[l] + "   ");
            k = last;
            pass++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] x = { 6, 4, 3, 7, 1, 9, 8 };
        bubbleSort(x, 7);

        System.out.println();
        System.out.println("비교를 " + compareCount + "회 했습니다.");
        System.out.println("교환을 " + swapCount + "회 했습니다.");
    }
}
