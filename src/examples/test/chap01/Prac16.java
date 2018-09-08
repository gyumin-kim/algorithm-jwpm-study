package examples.test.chap01;

public class Prac16 {
    public static void main(String[] args) {
        spira(4);
    }

    /**
     * n단의 피라미드 출력
     * @param n
     */
    static void spira(int n) {
        int width = 2*n - 1;
        for (int i = 1; i <= n; i++) {
            int starCount = 2*i - 1;
            int lrBlank = (width - starCount) / 2;

            for (int j = 0; j < lrBlank; j++)
                System.out.print(" ");
            for (int j = 0; j < starCount; j++)
                System.out.print("*");
            for (int j = 0; j < lrBlank; j++)
                System.out.print(" ");

            System.out.println("");
        }
    }
}
