import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TreeR {

    static void fun(int n) {
        if (n <= 0) {
            return;
        }

        System.out.println("Pre " + n);
        fun(n - 1);
        System.out.println("inner " + n);
        fun(n - 2);
        System.out.println("post " + n);
    }

    public static void main(String[] args) {
        // fun(3);

        // PriorityQueue<Integer> minheap = new PriorityQueue<>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<Map.Entry<Integer, Integer>>(
                (a, b) -> a.getValue() - b.getValue());
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (Map.Entry<Integer, Integer> ele : map.entrySet()) {
            heap.offer(ele);

            if (heap.size() > k) {
                heap.poll();
            }
        }

        int res[] = new int[k];
        int index = 0;
        while (!heap.isEmpty()) {
            res[index++] = heap.poll().getKey();
        }

        // heap.add(3);
        // heap.add(2);
        // heap.add(1);
        // heap.add(5);
        // heap.add(6);
        // heap.add(4);
        System.out.println(heap);
    }
}
