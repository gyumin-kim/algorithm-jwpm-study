package examples.test.chap02;

public class Exam2_8A {
    static int cardConvR(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while(x > 0);

        System.out.println(r + "진수로 변환된 결과: ");
        for (int i = 0; i < digits; i++)
            System.out.print(d[i]);
        System.out.println("");

        return digits;
    }

    public static void main(String[] args) {
        int x = 59;
        int r = 16;
        char[] d = new char[32];

        System.out.println(cardConvR(x, r, d));
    }
}
