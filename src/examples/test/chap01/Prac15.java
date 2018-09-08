package examples.test.chap01;

public class Prac15 {
    public static void main(String[] args) {
        triangleRB(5);
    }

    /**
     * 왼쪽 아래가 직각인 이등변 삼각형을 출력
     * @param n
     */
    static void triangleLB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int j = i + 1; j <= n; j++)
                System.out.print(" ");
            System.out.println("");
        }
    }

    /**
     * 왼쪽 위가 직각인 이등변 삼각형을 출력
     * @param n
     */
    static void triangleLU(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++)
                System.out.print("*");
            for (int j = 0; j < i; j++)
                System.out.print(" ");
            System.out.println("");
        }
    }

    /**
     * 오른쪽 위가 직각인 이등변 삼각형을 출력
     * @param n
     */
    static void triangleRU(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++)
                System.out.print(" ");
            for (int j = i; j < n; j++)
                System.out.print("*");
            System.out.println("");
        }
    }

    /**
     * 오른쪽 아래가 직각인 이등변 삼각형을 출력
     * @param n
     */
    static void triangleRB(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++)
                System.out.print(" ");
            for (int j = 0; j < i+1; j++)
                System.out.print("*");
            System.out.println("");
        }
    }
}
