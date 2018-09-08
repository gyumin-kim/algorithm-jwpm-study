package examples.test.chap02;

public class Prac3 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 73, 2, -5, 42};
        System.out.println("배열 arr의 모든 요소의 합계: " + sumOf(arr));
    }

    static int sumOf(int[] a) {
        int length = a.length;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += a[i];
        }

        return sum;
    }
}
