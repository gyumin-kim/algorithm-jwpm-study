package examples.test.chap03;

public class Prac4 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 8, 9 };
        int n = arr.length;
        int key = 6;
        int index = -1;

        System.out.print("  |  ");
        for (int i = 0; i < n; i++)
            System.out.print(i + "  ");
        System.out.println("");
        System.out.println("--+------------------------");

        int lo = 0;
        int hi = n - 1;
        int mid;

        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;

            // 화살표와 (+) 기호가 포함된 line
            System.out.print("  | ");
            for (int j = 0; j < lo; j++)
                System.out.print("   ");
            System.out.print("<- ");
            for (int j = lo + 1; j < mid; j++)
                System.out.print("   ");
            if (hi - lo >= 2)
                System.out.print(" +  ");
            for (int j = mid+1; j < hi; j++)
                System.out.print("   ");
            System.out.println("-> ");

            // 현재 검색하고 있는 index와 배열의 element들이 포함된 line
            System.out.print(" " + mid + "| ");
            for (int j = 0; j < n; j++)
                System.out.print(" " + arr[j] + " ");
            System.out.println("");

            if (key == arr[mid]) {
                index = mid;
                break;
            }
            else if (key < arr[mid])
                hi = mid - 1;
            else if (key > arr[mid])
                lo = mid + 1;

            // 마지막 line
            System.out.println("  |");
        }

        if (index == -1)
            System.out.println(key + "을(를) 찾을 수 없습니다.");
        else
            System.out.println(key + "은(는) x[" + index + "]에 있습니다.");
    }
}
