package examples.test.chap06;

public class Prac5 {
    private static int compareCount = 0;
    private static int swapCount = 0;

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void printEachPrepare(int[] a, int j, int n) {
        System.out.print(" ");
        for (int m = 0; m < j-1; m++)
            System.out.print(a[m] + "   ");
        System.out.print(a[j-1]);
        System.out.print(((a[j-1] > a[j]) ? " + " : " - ") + a[j] + "   ");
        for (int m = j+1; m < n; m++)
            System.out.print(a[m] + "   ");
        System.out.println();
    }

    static void cocktailSort(int[] a, int n) {
        int rightLast = n-1;
        int leftLast = 0;
        int pass = 1;

        while (rightLast >= leftLast) {
            int last;
            if (pass % 2 == 1) {
                last = rightLast;
                System.out.println("패스" + pass + ":");
                for (int j = rightLast; j > leftLast; j--) { // 지난번 pass에서 마지막으로 정렬한 곳까지만 비교한다
                    compareCount++;
                    printEachPrepare(a, j, n);

                    if (a[j - 1] > a[j]) {
                        swap(a, j - 1, j);
                        last = j;
                        swapCount++;
                    }
                }
            }
            else {
                last = leftLast;
                System.out.println("패스" + pass + ":");
                for (int j = leftLast; j < rightLast; j++) { // 지난번 pass에서 마지막으로 정렬한 곳까지만 비교한다
                    compareCount++;
                    printEachPrepare(a, j+1, n);

                    if (a[j] > a[j+1]) {
                        swap(a, j, j+1);
                        last = j;
                        swapCount++;
                    }
                }
            }
            System.out.print(" ");
            for (int l = 0; l < n; l++) System.out.print(a[l] + "   ");
            if (last == ((pass % 2 == 1) ? rightLast : leftLast))  break;

            if (pass % 2 == 1)  leftLast = last;
            else rightLast = last;
            pass++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] x = { 9, 6, 3, 7, 2, 5, 8 };
        cocktailSort(x, 7);

        System.out.println();
        System.out.println("비교를 " + compareCount + "회 했습니다.");
        System.out.println("교환을 " + swapCount + "회 했습니다.");
    }
}
