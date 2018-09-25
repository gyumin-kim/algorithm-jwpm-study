package examples.test.etc;

public class FunctionDevelopment {
    /**
     * https://programmers.co.kr/learn/courses/30/lessons/42586?language=java
     * progresses[i]가 100 이상이 될 때까지 speeds[i]를 더하면서
     * count를 센다. i번째의 최종 카운트를 queue에 enque한다.
     * queue에 모든 수가 다 들어가면, head에 있는 수를 dequq한다.
     * deque해서 얻은 수 보다 작은 값이 나올 때까지(최소값 갱신; min) deque하면서
     * count를 1씩 누적한다.
     */
    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new Queue<>();
        Queue<Integer> answerQueue = new Queue<>();
        int length = progresses.length;

        // 100까지 며칠의 작업이 필요한지를 담고있는 queue 초기화 작업
        for (int i = 0; i < length; i++) {
            int count = 0;
            while (progresses[i] < 100) {
                progresses[i] += speeds[i];
                count++;
            }
            queue.enqueue(count);
        }

        int size = queue.size();
        int returnVal = 1;
        int min = queue.dequeue();  // 3
        for (int i = 0; i < size-1; i++) {    // 0 1 2 3
            if (min < queue.peek()) {
                answerQueue.enqueue(returnVal);
                returnVal = 1;                      // 1
            } else if (min >= queue.peek())
                returnVal++;    // 2 3
            min = queue.dequeue();  // 3(2) 2 6 7
        }
        answerQueue.enqueue(returnVal);

        int queueSize = answerQueue.size();
        int[] answer = new int[queueSize];
        for (int i = 0; i < queueSize; i++)
            answer[i] = answerQueue.dequeue();

        return answer;
    }

    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        int[] returnArr = solution(progresses, speeds);
        for (int i = 0; i < returnArr.length; i++) {
            System.out.print(returnArr[i] + " ");
        }
    }
}

class Queue<Item> {
    private Node first;
    private Node last;
    private int n;

    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() { return first == null; }
    public int size() { return n; }
    public void enqueue(Item item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty())  first = last;
        else    oldLast.next = last;
        n++;
    }
    public Item dequeue() {
        Item item = first.item;
        first = first.next;
        if (isEmpty())  last = null;
        n--;
        return item;
    }
    public Item peek() {
        return first.item;
    }
}