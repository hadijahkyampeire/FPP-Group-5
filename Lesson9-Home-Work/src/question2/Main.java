package question2;

public class Main {
    public static void main(String[] args) {
        LinkedListStackImpl stack = new LinkedListStackImpl();
        System.out.println("Initial stack size: " + stack.size() + "\n");
        stack.push(10);
        stack.push(20);
        stack.push(50);
        stack.display();
        System.out.println("After adding 3 items - size is: " + stack.size() + "\n");

        System.out.println("Peek implementation: " + stack.peek() + "\n"); // return 50
        System.out.println("Pop implementation: " + stack.pop() + "\n"); // return 50
        stack.display(); // 50 should be gone and 20 is now top.

        System.out.println("After popping one item - size is: " + stack.size() + "\n");


    }
}
