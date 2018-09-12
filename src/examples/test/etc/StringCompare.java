package examples.test.etc;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a, b;

        System.out.println("두 문자열 입력:");
        do {
            a = in.nextLine();
            b = in.nextLine();
        } while(capsCheck(a, b) < 0);

        System.out.println(compare(a, b));
    }

    static int compare(String a, String b) {
        int i = 0;

        while (i < a.length()) {
            if (a.charAt(i) < b.charAt(i)) return -1;
            else if (a.charAt(i) > b.charAt(i)) return 1;
            i++;
        }

        return 0;
    }

    static int capsCheck(String a, String b) {
        boolean isLower = true;

        int aLength = a.length();
        for (int i = 0; i < aLength; i++) {
            if (!(a.charAt(i) >= 97 && a.charAt(i) <= 122))
                isLower = false;
        }

        int bLength = b.length();
        for (int i = 0; i < bLength; i++) {
            if (!(b.charAt(i) >= 97 && b.charAt(i) <= 122))
                isLower = false;
        }

        if (!isLower) {
            System.out.println("소문자를 입력하세요.");
            return -1;
        } else {
            return 1;
        }
    }
}
