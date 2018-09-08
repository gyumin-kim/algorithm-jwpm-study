package examples.test.chap01;

public class Prac17 {
    public static void main(String[] args) {
        npira(4);
    }

    static void npira(int n) {
        int width = 2*n - 1;
        for (int i = 1; i <= n; i++) {
            int numCount = 2*i - 1;
            int lrBlank = (width - numCount) / 2;
            String printNum = (i % 10) + "";

            for (int j = 0; j < lrBlank; j++)
                System.out.print(" ");
            for (int j = 0; j < numCount; j++)
                System.out.print(printNum);
            for (int j = 0; j < lrBlank; j++)
                System.out.print(" ");
            System.out.println("");
        }
    }
}
