package examples.test.chap02;

public class Prac2 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 73, 2, -5, 42};
        print(arr);
        reverse(arr);
    }

    static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    static void print(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            System.out.println("a[" + i + "]과(와) a[" + (a.length - i - 1) + "]를 교환합니다.");
            swap(a, i, a.length - i - 1);
            print(a);
        }
        System.out.println("역순 정렬을 마쳤습니다.");
    }
}
