package examples.test.chap04;

public class Gqueue<E> {
    private int max;
    private int num;
    private int front;
    private int rear;
    private E[] que;

    public static class EmptyGQueException extends RuntimeException {
        public EmptyGQueException() {}
    }

    public static class OverflowGQueException extends RuntimeException {
        public OverflowGQueException() {}
    }

    public Gqueue(int capacity) {
        num = front = rear = 0;
        max = capacity;
        try {
            que = (E[]) new Object[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public E enque(E x) throws OverflowGQueException {
        if (num >= max)
            throw new OverflowGQueException();
        que[rear++] = x;
        if (rear == max)    rear = 0;
        num++;

        return x;
    }

    public E deque() throws EmptyGQueException {
        if (num <= 0)
            throw new EmptyGQueException();
        E x = que[front++];
        if (front >= max)   front = 0;
        num--;

        return x;
    }

    public E peek() throws EmptyGQueException {
        if (num <= 0)
            throw new EmptyGQueException();
        return que[front];
    }

    public int indexOf(E x) {
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

    public int search(E x) {
        for (int i = 0; i < num; i++) {
            int index = (front + i) % max;
            if (que[index] == x)
                return i + 1;
        }
        return 0;
    }
}
