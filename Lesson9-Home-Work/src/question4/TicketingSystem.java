package question4;

import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Queue;

public class TicketingSystem {
    private int nextId;
    private Queue<Ticket> ticketQueue;

    TicketingSystem() {
        this.ticketQueue = new LinkedList<Ticket>();
        this.nextId = 1;
    }

    public void addTicket(String description ) {
        String ticketId = String.format("T-%d", nextId++);
        Ticket newTicket = new Ticket(ticketId, description);
        this.ticketQueue.add(newTicket);
    }

    public void processTicket() {
        Ticket processedTicket = this.ticketQueue.poll();
        if(processedTicket != null) {
            System.out.println("Processed ticket: " + processedTicket);
        } else {
            System.out.println("No tickets to process");
        }
    }

    public void viewNextTicket() {
        Ticket nextTicket = this.ticketQueue.peek();
        if(nextTicket != null) {
            System.out.println("View ticket: " + this.ticketQueue.peek());
        } else {
            System.out.println("No ticket in the queue");
        }
    }

    public boolean isQueueEmpty() {
        return ticketQueue.isEmpty();
    }

    // Get the current size of the queue
    public int getQueueSize() {
        return ticketQueue.size();
    }

    public void clearQueue() {
        ticketQueue.clear();
    }

    @Override
    public String toString() {
        return this.ticketQueue.toString();
    }
}
