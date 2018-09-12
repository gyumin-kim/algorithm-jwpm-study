package examples.test.chap02;

import java.util.Scanner;

public class Prac6 {
    static int cardConv(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] tmp = new char[32];

        do {
            tmp[digits++] = dchar.charAt(x % r);
            x /= r;
        } while (x > 0);

        for (int i = 0; i < digits; i++)
            d[i] = tmp[digits - i - 1];

        for (int i = 0; i < digits; i++)
            System.out.print(d[i]);

        return digits;
    }

    public static void main(String[] args) {
        int no;
        int cd;
        char[] cno = new char[36];
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("변환할 정수: ");
            no = in.nextInt();
        } while (no < 0);
        do {
            System.out.print("어떤 정수로 변환? (2~36): ");
            cd = in.nextInt();
        } while (cd < 2 || cd > 36);

        System.out.print(no + "를 " + cd + "진수로 변환한 결과: ");
        cardConv(no, cd, cno);
    }
}
