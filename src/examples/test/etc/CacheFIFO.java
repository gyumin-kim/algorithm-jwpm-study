package examples.test.etc;

/**
 * http://tech.kakao.com/2017/09/27/kakao-blind-recruitment-round-1/
 * 3. 캐시(난이도: 하)
 */
public class CacheFIFO {
    public static int getRuntime(int cacheSize, String[] cities) {
        final int CACHE_HIT = 1;
        final int CACHE_MISS = 5;
        int result = 0;
        int citiesLen = cities.length;

        if (cacheSize == 0) return citiesLen * CACHE_MISS;

        CacheQueue<String> queue = new CacheQueue<>();
        for (String city : cities) {
            // 현재 queue에 city가 있는가?
            // 있으면(Cache hit)
            if (queue.isHit(city))
                result += CACHE_HIT;

            // 없으면(Cache miss)
            else {
                // 현재 queue가 꽉 차있으면, dequeue하고, city를 enqueue한다.
                if (queue.size() == cacheSize)
                    queue.dequeue();
                // city를 enqueue한다.
                queue.enqueue(city);
                result += CACHE_MISS;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int cacheSize1 = 3;
        String[] cities1 = { "Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA" };
        int cacheSize2 = 3;
        String[] cities2 = { "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul" };
        int cacheSize3 = 2;
        String[] cities3 = { "Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome" };
        int cacheSize4 = 5;
        String[] cities4 = { "Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome" };
        int cacheSize5 = 2;
        String[] cities5 = { "Jeju", "Pangyo", "NewYork", "newyork" };
        int cacheSize6 = 0;
        String[] cities6 = { "Jeju", "Pangyo", "Seoul", "NewYork", "LA" };

        System.out.println("1번 실행시간: " + getRuntime(cacheSize1, cities1));
        System.out.println("2번 실행시간: " + getRuntime(cacheSize2, cities2));
        System.out.println("3번 실행시간: " + getRuntime(cacheSize3, cities3));
        System.out.println("4번 실행시간: " + getRuntime(cacheSize4, cities4));
        System.out.println("5번 실행시간: " + getRuntime(cacheSize5, cities5));
        System.out.println("6번 실행시간: " + getRuntime(cacheSize6, cities6));
    }
}

class CacheQueue<Item> {
    private Node first;
    private Node last;
    private int n;
    private int tmpPriority = 0;

    private class Node {
        Item item;
        Node next;
        int priority;
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

    // 현재 queue에 item이 있는가?
    public boolean isHit(Item item) {
        Node pointer = first;
        while (pointer != null) {
            if (pointer.item.toString().toLowerCase()
                    .equals(item.toString().toLowerCase())) {
                pointer.priority = tmpPriority++;
                return true;
            }
            pointer = pointer.next;
        }
        return false;
    }
}