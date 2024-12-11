package prob4;

public class DoublyLinkedList {
    Node header;

    // constructor
    DoublyLinkedList(){
        header = new Node();
    }

    // Inner class Node
    class Node {
        String value;
        Node next;
        Node previous;

        //default constructor
        public Node() {
            this.value = null;
        }

        // parameterized constructor
        public Node(String value) {
            this.value = value;
        }

        public String toString() {
            return value == null ? "null" : value;
        }
    }

    //1. adds to the end of the list
    public void addLast(String item){
        if (item == null) return;

        Node newNode = new Node(item);
        Node last = header;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        newNode.previous = last;
    }

    // 2. adds to the beginning of the list
    public void addFirst(String item){
        if (item == null) return;

        Node newNode = new Node(item);
        newNode.next = header.next;
        newNode.previous = header;

        if(header.next != null){
            header.next.previous = newNode;
        }
        header.next = newNode;
    }

    // 3. Remove by passing object
    public boolean remove(String item){
        if (item == null) return false;

        Node currentNode = header.next;
        while (currentNode != null) {
            if (currentNode.value.equals(item)) {
                currentNode.previous.next = currentNode.next;
                if (currentNode.next != null) {
                    currentNode.next.previous = currentNode.previous;
                }
                return true;
            }
            currentNode = currentNode.next;
        }

        return false;
    }

    // 4. Remove the First Node
    public boolean removeFirst() {
        if (header.next == null) return false;

        Node currentNode = header.next;
        if (currentNode.next != null) {
            header.next = currentNode.next;
            currentNode.next.previous = header;
        }else {
            header.next = null;
        }
        return true;
    }

    // 5. Prints the list from last to first
    // version 1
    public void printReverse() {
        if (header.next == null) {
            System.out.println("List is empty.");
            return;
        }

        Node currentNode = header.next;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        for(Node newNode = currentNode; newNode != header; newNode = newNode.previous) {
            System.out.print(newNode + " ");
        }
    }

    //version 2: recursive
    public static void printReverseHelper(Node node){
        // Base case: End of the list
        if (node == null) {
            return;
        }

        printReverseHelper(node.next); // Recursive call to the next node
        System.out.print(node.value + " "); // Print value after returning
    }

    public void printReverse2() {
        printReverseHelper(header.next);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        toString(sb, header);
        return sb.toString();

    }
    private void toString(StringBuilder sb, Node n) {
        if(n==null) return;
        if(n.value != null) sb.append(" " + n.value);
        toString(sb, n.next);
    }

    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("Bob");
        list.addLast("Harry");
        list.addLast("Steve");
        System.out.println(list);

        // addFirst
        list.addFirst("qwerty");
        System.out.println(list);

        // addLast
        list.addLast("Jack");
        System.out.println(list);

        // remove
        list.remove("qwerty"); // can remove first item successfully.
        System.out.println("Removed qwerty: " + list);
        list.remove("Jack"); // can remove last item successfully.
        System.out.println("Removed Jack: " + list);
        list.remove("Harry"); // ofcos middle item too.
        System.out.println("Removed Harry: " + list);
        list.remove("Harry"); //Try to remove Harry again.
        System.out.println("Removed Harry who is already removed: " + list); //nothing happens because it returns false.

        // removeFirst
        list.removeFirst();
        System.out.println("Removed Bob: " + list);
        list.removeFirst();
        System.out.println("Removed Steve: " + list);

        // printReverse
        list.addLast("Bob");
        list.addLast("Harry");
        list.addLast("Steve");
        System.out.println("Before reversing: " + list);
        System.out.print("After reversing v1: ");
        list.printReverse(); // using version 1

        System.out.print("\nAfter reversing v2: ");
        list.printReverse2(); // using version 2

    }
}

