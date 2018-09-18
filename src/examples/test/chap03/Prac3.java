package examples.test.chap03;

public class Prac3 {
    static int searchInx(int[] a, int n, int key, int[] idx) {
        int idxIndex = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                idx[idxIndex++] = i;
            }
        }

        return idxIndex;
    }

    public static void main(String[] args) {
        int[] a = { 1, 9, 2, 9, 4, 6, 7, 9 };
        int[] idx = new int[8];
        int count = searchInx(a, 8, 9, idx);

        System.out.println(count);
    }
}
