package examples.test.etc;

import java.util.ArrayList;
import java.util.Scanner;

public class SecretMap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n: ");
        int n = in.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        char[][] tmp = new char[n][n];

        for (int i = 0; i < n; i++)
            arr1[i] = in.nextInt(); // 9 20 28 18 11
        for (int i = 0; i < n; i++)
            arr2[i] = in.nextInt(); // 30 1 21 17 28

        for (int i = 0; i < n; i++) {
            String arr1Str = Integer.toBinaryString(arr1[i]);   // 9 -> 1001
            String arr2Str = Integer.toBinaryString(arr2[i]);
            char[] charArr1 = String.format("%05d", Integer.parseInt(arr1Str)).toCharArray();   // ['0', '1', '0', '0', '1']
            char[] charArr2 = String.format("%05d", Integer.parseInt(arr2Str)).toCharArray();

            for (int j = 0; j < n; j++) {
                if (charArr1[j] == '1' | charArr2[j] == '1')    // 둘 중 하나만 1이면 #
                    tmp[i][j] = '#';
                else
                    tmp[i][j] = ' ';
            }
        }

//        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            ArrayList<Character> result = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                result.add(tmp[i][j]);
            }
        }

        // 전체 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(tmp[i][j]);
            }
            System.out.println("");
        }
    }
}
