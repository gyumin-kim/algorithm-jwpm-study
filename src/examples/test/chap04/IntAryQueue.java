package examples.test.chap04;

/**
 * Prac4
 */
public class IntAryQueue {
    private int max;    // 큐의 최대용량
    private int num;    // 현재 데이터 수
    private int[] que;
//    private int front;  // 첫번째 요소의 인덱스
//    private int rear;   // 맨 나중에 넣은 요소의 하나 뒤의 인덱스

    public class EmptyIntQueException extends RuntimeException {
        public EmptyIntQueException() {}
    }

    public class OverflowIntQueException extends RuntimeException {
        public OverflowIntQueException() {}
    }

    public IntAryQueue(int capacity) {
        num = 0;
        max = capacity;
        try {
            que = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public int enque(int x) throws OverflowIntQueException {
        if (num >= max)
            throw new OverflowIntQueException();
        que[num++] = x;

        return x;
    }

    public int deque() throws EmptyIntQueException {
        if (num <= 0)
            throw new EmptyIntQueException();
        int x = que[0];                     // front에 있는 요소를 deque
        for (int i = 1; i < num; i++)  // deque되는 요소의 다음 요소들을 왼쪽으로 한칸씩 이동
            que[i-1] = que[i];
        num--;

        return x;
    }

    public int peek() throws EmptyIntQueException {
        if (num <= 0)
            throw new EmptyIntQueException();
        return que[num-1];
    }

    public int indexOf(int x) {
        for (int i = 0; i < num; i++)
            if (que[i] == x)
                return i;
        return -1;
    }

    public void clear() {
        num = 0;
    }

    public int capacity() {
        return max;
    }

    public int size() {
        return num;
    }

    public boolean isEmpty() {
        return num <= 0;
    }

    public boolean isFull() {
        return num >= max;
    }

    public void dump() {
        if (num <= 0)
            System.out.println("큐가 비어 있습니다.");
        else {
            for (int i = 0; i < num; i++)
                System.out.print(que[i] + " ");
            System.out.println("");
        }
    }
}
