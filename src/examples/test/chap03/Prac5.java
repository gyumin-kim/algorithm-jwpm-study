package examples.test.chap03;

public class Prac5 {
    static int binSearchX(int[] a, int n, int key) {
        int lo = 0;
        int hi = n - 1;
        int mid;

        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (a[mid] == key) {
                while (a[mid] == a[mid-1])
                    mid--;
                return mid;
            }
            if (key < a[mid])
                hi = mid - 1;
            else if (key > a[mid])
                lo = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] a = { 1, 3, 5, 7, 7, 7, 7, 8, 8, 9, 9 };
        System.out.println(binSearchX(a, a.length, 7));
    }
}
