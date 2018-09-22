package examples.test.chap04;

import java.util.Scanner;

public class Prac1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        IntStack s = new IntStack(64);

        while (true) {
            System.out.println("현재 데이터 수: " + s.size() + "/" + s.capacity());
            System.out.print("(1) 푸시   (2) 팝   (3) 피크   (4) 검색   (5) 삭제   (6) 비어있는지 검사   (7) 가득찼는지 검사   (8) 덤프   (0) 종료: ");

            int menu = in.nextInt();
            if (menu == 0) break;

            int x;
            switch (menu) {
                case 1:     // 푸시
                    System.out.print("데이터: ");
                    x = in.nextInt();
                    try {
                        s.push(x);
                    } catch (IntStack.OverFlowIntStackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;
                case 2:     // 팝
                    try {
                        x = s.pop();
                        System.out.println("팝한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;
                case 3:     // 피크
                    try {
                        x = s.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;
                case 4:     // 검색
                    System.out.print("데이터: ");
                    x = in.nextInt();
                    System.out.println(x + "는 " + s.indexOf(x) + "에 있습니다.");
                    break;
                case 5:     // 삭제
                    s.clear();
                    break;
                case 6:     // 비어있는지 검사
                    if (s.isEmpty())
                        System.out.println("스택이 비어 있습니다.");
                    else
                        System.out.println("스택이 비어 있지 않습니다.");
                    break;
                case 7:     // 가득찼는지 검사
                    if (s.isFull())
                        System.out.println("스택이 가득 찼습니다.");
                    else
                        System.out.println("스택이 가득 차있지 않습니다.");
                    break;

                case 8:     // 덤프
                    s.dump();
                    break;
            }
        }
    }
}
