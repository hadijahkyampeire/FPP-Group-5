package question1;

import java.util.Arrays;

public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;


    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    @Override
    public String toString() {
        if(isEmpty()) return "[]";

        StringBuilder sb = new StringBuilder("[");
        for(int i = front; i < rear; i++) {
            sb.append(arr[i]).append(", ");
        }
        sb.replace(sb.length() - 2, sb.length(), "]");
        return sb.toString();
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public void enqueue(int obj){
        if (front == -1){
            front = 0;
        }
        if(rear == arr.length){
            resize();
        }
        arr[rear++] = obj;
    }

    public void enqueueAll(int[] obj){
        for(int i: obj) {
           enqueue(i);
        }
    }

    public int dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int intToRemove = arr[front];
        front++;

        if(front == rear) {
            front = -1;
            rear = 0;
        }
        return intToRemove;
    }

    public boolean isEmpty(){
        return front == -1;
    }

    public int size() {
        if(front == -1) return 0;
        return rear - front;
    }

    private void resize(){
        arr = Arrays.copyOf(arr, arr.length * 2);
    }
}
