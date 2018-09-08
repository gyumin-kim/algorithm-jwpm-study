package examples.test.chap01;

public class Prac4 {
    public static void main(String[] args) {
        System.out.println("세 값의 대소관계 13종류 각각에 대해 중앙값을 출력한다.");
        med3All();
    }

    static void med3All() {
        System.out.println("med3(1, 2, 3) = " + med3(1, 2, 3));
        System.out.println("med3(1, 3, 2) = " + med3(1, 3, 2));
        System.out.println("med3(2, 1, 1) = " + med3(2, 2, 1));
        System.out.println("med3(2, 1, 3) = " + med3(2, 1, 3));
        System.out.println("med3(2, 2, 3) = " + med3(2, 2, 3));
        System.out.println("med3(2, 3, 2) = " + med3(2, 3, 2));
        System.out.println("med3(2, 3, 3) = " + med3(2, 3, 3));
        System.out.println("med3(3, 1, 2) = " + med3(3, 1, 2));
        System.out.println("med3(3, 2, 1) = " + med3(3, 2, 1));
        System.out.println("med3(3, 2, 2) = " + med3(3, 2, 2));
        System.out.println("med3(3, 2, 3) = " + med3(3, 2, 3));
        System.out.println("med3(3, 3, 2) = " + med3(3, 3, 2));
        System.out.println("med3(3, 3, 3) = " + med3(3, 3, 3));
    }

    static int med3(int a, int b, int c) {
        if (b <= a) {   // b a
            if (c <= b) // c b a
                return b;
            else if (a <= c)  // b a c
                return a;
            else return c;  // b c a
        }
        else if (c < a) // c a (b)
            return a;
        else if (c < b) // c b (a)
            return b;
        else return b;  // a b c
    }
}
