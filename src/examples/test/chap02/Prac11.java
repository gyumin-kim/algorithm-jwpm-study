package examples.test.chap02;

public class Prac11 {
    public static void main(String[] args) {
        YMD ymd = new YMD(2018, 9, 10);
        System.out.print("오늘 날짜 ==> ");
        System.out.println(ymd);

        ymd.before(71);
        System.out.print("71일 앞으로 ==> ");
        System.out.println(ymd);

        ymd.after(45);
        System.out.print("45일 뒤로 ==> ");
        System.out.println(ymd);
    }
}

class YMD {
    int y;
    int m;
    int d;

    public YMD(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    public YMD(int y, int m) {
        this.y = y;
        this.m = m;
    }

    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
    };

    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    YMD after(int n) {
        int plusDay = d + n;

        // n일만큼 더해도 해당 월인 경우
        if (d + n <= mdays[isLeap(y)][m-1])
            this.d = plusDay;
        else {
            plusDay -= mdays[isLeap(y)][m-1];
            while (plusDay > mdays[isLeap(y)][m])
                plusDay -= mdays[isLeap(y)][m++];
            this.m = ++m;
            this.d = plusDay;
        }

        return this;
    }

    YMD before(int n) {
        // n일만큼 빼도 해당 월인 경우
        if (d - n >= 1)
            this.d = d - n;

        // 이전달의 마지막 날
        else if (d - n == 0) {
            this.m = m-1;
            this.d = mdays[isLeap(y)][m-1];
        }

        // d - n: 음수, 이전 달로 넘어감 (2달 이상씩 넘어갈 수도 있다)
        else {
            int minusDay = Math.abs(d - n);

            m -= 2;
            while (minusDay > mdays[isLeap(y)][m])
                minusDay -= mdays[isLeap(y)][m--];

            this.m = ++m;
            this.d = mdays[isLeap(y)][m-1] - minusDay;
        }

        return this;
    }

    @Override
    public String toString() {
        return "YMD { y = " + y + ", m = " + m + ", d = " + d + " }";
    }
}
