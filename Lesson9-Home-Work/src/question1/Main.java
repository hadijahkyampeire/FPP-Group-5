package question1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayQueueImpl arrayQueue = new ArrayQueueImpl();
        System.out.println("Initial Array size: " + arrayQueue.size());
        arrayQueue.dequeue(); // log Queue is empty
        // Testing enqueue, we expect 2, 3, 4, 5 to be added.
        arrayQueue.enqueue(2);
        // Dequeue when we have on value in the array // should reset to avoid an exception
        System.out.println("After dequeue: " + arrayQueue.dequeue());
        System.out.println(arrayQueue);
        arrayQueue.enqueue(3);
        arrayQueue.enqueue(4);
        arrayQueue.enqueue(5);
        System.out.println("ArrayQueue after adding 2,3,4,5: "+ arrayQueue);

        // Testing dequeue, we expect 2 to be removed and return the removed 2
        System.out.println("Dequeued item: " + arrayQueue.dequeue());
        System.out.println("ArrayQueue after dequeue: "+ arrayQueue);

        // Testing size();
        System.out.println("Array size: " + arrayQueue.size());

        System.out.println("Peek value: " + arrayQueue.peek());

        // Test Resizing and use a custom AddAll
        int[] itemsToAdd = {22,32,42,52,62,72,33,44,55,66,77,88,99,12,44,22};
        arrayQueue.enqueueAll(itemsToAdd);

        System.out.println("Resized(Size): " + arrayQueue.size() + " Capacity: " + arrayQueue.getArr().length);
        System.out.println("Queue structure: " + arrayQueue);

        arrayQueue.enqueue(23);
        System.out.println("Resized(Size) number again: " + arrayQueue.size() + " Capacity: " + arrayQueue.getArr().length);
        System.out.println("Queue structure after second resize: " + arrayQueue);
    }
}
