class MedianFinder {

    PriorityQueue<Integer> maxHeap =
            new PriorityQueue<Integer>(Collections.reverseOrder());

    PriorityQueue<Integer> minHeap =
            new PriorityQueue<Integer>();

    public MedianFinder() {

    }

    public void addNum(int num) {

        if (maxHeap.size() == 0)
            maxHeap.add(num);

        else {

            // Smaller half goes into maxHeap
            // Larger half goes into minHeap
            if (num > maxHeap.peek())
                minHeap.add(num);
            else
                maxHeap.add(num);
        }

        // Balance heaps
        if (maxHeap.size() == minHeap.size() + 2) {
            int top = maxHeap.remove();
            minHeap.add(top);
        }

        if (minHeap.size() == maxHeap.size() + 2) {
            int top = minHeap.remove();
            maxHeap.add(top);
        }
    }

    public double findMedian() {

        if (maxHeap.size() == minHeap.size())
            return (maxHeap.peek() + minHeap.peek()) / 2.0;

        else if (maxHeap.size() > minHeap.size())
            return maxHeap.peek();

        else
            return minHeap.peek();
    }
}