package examples.test.chap02;

public class Prac4 {
    public static void main(String[] args) {
        int[] b = {10, 73, 2, -5, 42};
        int[] a = new int[b.length];
        System.out.print("int[] a: ");
        print(a);
        System.out.print("int[] b: ");
        print(b);

        copy(a, b);
        System.out.println("=====copy 후=====");
        System.out.print("int[] a: ");
        print(a);
        System.out.print("int[] b: ");
        print(b);
    }

    static void print(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    static void copy(int[] a, int[] b) {
        int length = b.length;
        for (int i = 0; i < length; i++)
            a[i] = b[i];
    }
}
