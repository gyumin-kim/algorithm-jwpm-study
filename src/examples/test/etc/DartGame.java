package examples.test.etc;

public class DartGame {
    public static int getScore(String dartResult) {
        String[] dartArr = dartResult.split("");
        int len = dartArr.length;
        int result = 0;
        int[] tmp = new int[3];
        int index = 0;

        tmp[index] = Integer.parseInt(dartArr[0]);
        for (int i = 1; i < len; i++) {
            if (dartArr[i].charAt(0) == 'S') {
                tmp[index] = (int) Math.pow(tmp[index], 1);
                index++;
            }
            else if (dartArr[i].charAt(0) == 'D') {
                tmp[index] = (int) Math.pow(tmp[index], 2);
                index++;
            }
            else if (dartArr[i].charAt(0) == 'T') {
                tmp[index] = (int) Math.pow(tmp[index], 3);
                index++;
            }
            else if (dartArr[i].charAt(0) == '*') {
                tmp[index-1] *= 2;
                if (index >= 2)
                    tmp[index-2] *= 2;
            }
            else if (dartArr[i].charAt(0) == '#') {
                tmp[index-1] *= (-1);
            }
            else if (dartArr[i].charAt(0) >= '0' && dartArr[i].charAt(0) <= '9') {
                if (dartArr[i-1].charAt(0) == '1')
                    tmp[index] = 10;
                else
                    tmp[index] = Integer.parseInt(dartArr[i]);
            }
        }

        for (int i = 0; i < 3; i++)
            result += tmp[i];

        return result;
    }

    public static void main(String[] args) {
        String dartResult1 = "1S2D*3T";
        String dartResult2 = "1D2S#10S";
        String dartResult3 = "1D2S0T";
        String dartResult4 = "1S*2T*3S";
        String dartResult5 = "1D#2S*3S";
        String dartResult6 = "1T2D3D#";
        String dartResult7 = "1D2S3T*";

        System.out.println(dartResult1 + ": " + getScore(dartResult1) + "점입니다.");
        System.out.println(dartResult2 + ": " + getScore(dartResult2) + "점입니다.");
        System.out.println(dartResult3 + ": " + getScore(dartResult3) + "점입니다.");
        System.out.println(dartResult4 + ": " + getScore(dartResult4) + "점입니다.");
        System.out.println(dartResult5 + ": " + getScore(dartResult5) + "점입니다.");
        System.out.println(dartResult6 + ": " + getScore(dartResult6) + "점입니다.");
        System.out.println(dartResult7 + ": " + getScore(dartResult7) + "점입니다.");
    }
}
