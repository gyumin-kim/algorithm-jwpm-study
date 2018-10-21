package examples.test.chap08;

import java.util.Scanner;

public class Exam8_1 {
    static int bfMatch(String txt, String pat) {
        int pt = 0;
        int pp = 0;

        while (pt != txt.length() && pp != pat.length()) {
            if (txt.charAt(pt) == pat.charAt(pp)) {
                pt++;
                pp++;
                System.out.println("pt: " + pt + ", pp: " + pp);
            } else {
                pt = pt - pp + 1;
//                pt++;
                pp = 0;
                System.out.println("pt: " + pt + ", pp: " + pp);
            }
//            pp = (txt.charAt(pt++) == pat.charAt(pp)) ? pp+1 : 0;
        }
        if (pp == pat.length())
            return pt - pp;

        // 다른 방법
//        int tl = txt.length();
//        int pl = pat.length();
//
//        for (int i = 0; i <= tl - pl; i++) {
//            int j = 0;
//            while (j < pl && pat.charAt(j) == txt.charAt(i + j))
//                j++;
//            if (j == pl)
//                return i;
//        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("텍스트: ");
        String txt = in.next();
        System.out.print("패턴: ");
        String pat = in.next();

        int idx = bfMatch(txt, pat);
        if (idx == -1)
            System.out.println("텍스트에 패턴이 없습니다.");
        else {
            int len = 0;
            for (int i = 0; i < idx; i++)
                len += txt.substring(i, i+1).length();
            len += pat.length();

            System.out.println((idx+1) + "번째 문자부터 일치합니다.");
            System.out.println("텍스트: " + txt);
            System.out.printf(String.format("패턴: %%%ds\n", len), pat);
        }
    }
}
