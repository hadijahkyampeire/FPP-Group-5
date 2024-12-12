package question2;

import java.util.LinkedList;

public class LinkedListStackImpl {
    private static final int LEN = 500;
    private Node top;
    private int size;

    class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
        }
    }

    public void push(Object x) {
        if (top == null) {
            top = new Node(x);
            top.next = null;
        }else {
            Node newNode = new Node(x);
            newNode.next = top;
            top = newNode;
        }

        size++;
    }

    public Object peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty, cannot peek");
            return null; //returns null if stack is empty
        }

        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public Object pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty, cannot pop");
            return null; //returns null if stack is empty
        }
        Object data = top.data;
        top = top.next;
        size--;

        return data;
    }

    public int size(){ // returns number of items in the stack
        return size;
    }

    public void display() {
        Node p = top;
        System.out.print("LinkedList Stack: \n");
        if (p == null)
            System.out.println("Stack is empty");
        while (p != null) {
            System.out.println(p.data);
            p = p.next;
        }
        System.out.println();
    }
}
