package standardlibusage;

import java.util.PriorityQueue;

/**
 * heap
 */
public class heap {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(0, null);
        // heap insertion
        minHeap.add(20);
        minHeap.add(5);
        minHeap.add(10);
        minHeap.add(1);
        // heap get the top node
        int minElement = minHeap.poll();
        System.out.println("Minimum Element : " + minElement);

        System.out.println("Minimum Element : " + minElement);
        // The poll() method removes and returns the minimum element (the root of the
        // heap),
        // and peek() returns the minimum element without removing it.
    }

}