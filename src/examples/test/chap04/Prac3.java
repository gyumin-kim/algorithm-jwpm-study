package examples.test.chap04;

public class Prac3 {
    private int max;
    private int ptrA;
    private int ptrB;
    private int[] stk;

    public enum StackAB {
        StackA,
        StackB
    }

    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {}
    }

    public class OverFlowIntStackException extends RuntimeException {
        public OverFlowIntStackException() {}
    }

    public Prac3(int capacity) {
        ptrA = 0;
        ptrB = capacity - 1;
        max = capacity;
        try {
            stk = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public int push(StackAB s, int x) throws OverFlowIntStackException {
//        if (ptrA >= ptrB + 1)
        if (isFull())
            throw new OverFlowIntStackException();
        switch (s) {
            case StackA:
                stk[ptrA++] = x;
                break;
            case StackB:
                stk[ptrB--] = x;
                break;
        }

        return x;
    }

    public int pop(StackAB s) throws EmptyIntStackException {
        int x = 0;
        switch (s) {
            case StackA:
//                if (ptrA <= 0)
                if (isEmpty(StackAB.StackA))
                    throw new EmptyIntStackException();
                x = stk[--ptrA];
                break;
            case StackB:
//                if (ptrB >= max-1)
                if (isEmpty(StackAB.StackB))
                    throw new EmptyIntStackException();
                x = stk[++ptrB];
                break;
        }

        return x;
    }

    public int peek(StackAB s) throws EmptyIntStackException {
        int x = 0;
        switch (s) {
            case StackA:
//                if (ptrA <= 0)
                if (isEmpty(StackAB.StackA))
                    throw new EmptyIntStackException();
                x = stk[ptrA - 1];
                break;
            case StackB:
//                if (ptrB >= max-1)
                if (isEmpty(StackAB.StackB))
                    throw new EmptyIntStackException();
                x = stk[ptrB + 1];
                break;
        }

        return x;
    }

    public int indexOf(StackAB s, int x) {
        switch (s) {
            case StackA:
                for (int i = ptrA - 1; i >= 0; i--)
                    if (stk[i] == x)
                        return i;
                break;
            case StackB:
                for (int i = ptrB + 1; i < max; i++)
                    if (stk[i] == x)
                        return i;
                break;
        }

        return -1;
    }

    public void clear(StackAB s) {
        switch (s) {
            case StackA:
                ptrA = 0;
                break;
            case StackB:
                ptrB = max - 1;
                break;
        }
    }

    public int capacity() {
        return max;
    }

    public int size(StackAB s) {
        switch (s) {
            case StackA:
                return ptrA;
            case StackB:
                return max - ptrB - 1;
        }
        return 0;
    }

    public boolean isEmpty(StackAB s) {
        switch (s) {
            case StackA:
                return ptrA <= 0;
            case StackB:
                return ptrB >= max - 1;
        }
        return true;
    }

    public boolean isFull() {
        return ptrA >= ptrB + 1;
    }

    public void dump(StackAB s) {
        switch (s) {
            case StackA:
//                if (ptrA <= 0)
                if (isEmpty(StackAB.StackA))
                    System.out.println("스택 A가 비어 있습니다.");
                else {
                    for (int i = 0; i < ptrA; i++)
                        System.out.print(stk[i] + " ");
                    System.out.println("");
                }
                break;
            case StackB:
//                if (ptrB >= max - 1)
                if (isEmpty(StackAB.StackB))
                    System.out.println("스택 B가 비어 있습니다.");
                else {
                    for (int i = max - 1; i > ptrB; i--)
                        System.out.print(stk[i] + " ");
                    System.out.println("");
                }
                break;
        }
    }
}
