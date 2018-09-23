package examples.test.chap04;

/**
 * Prac5
 */
public class IntQueue2 {
    private int max;
    private int front;
    private int rear;
    private int num;
    private int[] que;

    public class EmptyIntQueException extends RuntimeException {
        public EmptyIntQueException() {}
    }

    public class OverflowIntQueException extends RuntimeException {
        public OverflowIntQueException() {}
    }

    public IntQueue2(int capacity) {
        num = front = rear = 0;
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
        que[rear++] = x;
        if (rear == max)    rear = 0;
        num++;

        return x;
    }

    public int deque() throws EmptyIntQueException {
        if (num <= 0)
            throw new EmptyIntQueException();
        int x = que[front++];
        if (front >= max)   front = 0;
        num--;

        return x;
    }

    public int peek() throws EmptyIntQueException {
        if (num <= 0)
            throw new EmptyIntQueException();
        return que[front];
    }

    public int indexOf(int x) {
        for (int i = 0; i < num; i++) {
            int index = (i + front) % max;
            if (que[index] == x)
                return index;
        }
        return -1;
    }

    public void clear() {
        num = front = rear = 0;
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
            for (int i = 0; i < num; i++) {
                int index = (front + i) % max;
                System.out.print(que[index] + " ");
            }
            System.out.println("");
        }
    }

    public int search(int x) {
        for (int i = 0; i < num; i++) {
            int index = (front + i) % max;
            if (que[index] == x)
                return i + 1;
        }
        return 0;
    }
}
