package examples.test.chap02;

import java.util.Scanner;

public class Prac7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int no;
        int cd;
        int digits = 0;
        char[] tmp = new char[32];
        char[] d = new char[32];

        System.out.println("10진수를 기수 변환합니다.");
        do {
            System.out.print("변환하는 음이 아닌 정수 : ");
            no = in.nextInt();
        } while (no <= 0);
        do {
            System.out.print("어떤 진수로 변환할까요?(2-36) : ");
            cd = in.nextInt();
        } while (cd < 2 || cd > 36);

        System.out.println("");
        System.out.printf(cd + " |" + "%6d\n", no);

        do {
            System.out.println("  + ------");
            System.out.printf(cd + " |" + "%6d  " + "... %d\n", no / cd, no % cd);
            tmp[digits++] = dchar.charAt(no % cd);
            no /= cd;
        } while (no > cd);
        System.out.println("  + ------");
        System.out.printf("   %7d  " + "... %d\n", no / cd, no % cd);
        tmp[digits++] = dchar.charAt(no % cd);

        for (int i = 0; i < digits; i++)
            d[i] = tmp[digits - i - 1];
        System.out.print(cd + "진수로 ");
        for (int i = 0; i < digits; i++)
            System.out.print(d[i]);
        System.out.print("입니다.");
    }
}