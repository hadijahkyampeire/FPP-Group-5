package question4;

import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Queue;

public class TicketingSystem {
    Node nextId;
    Queue<Ticket> ticket;

    TicketingSystem() {
        this.ticket = new LinkedList<Ticket>();
        this.nextId = null;
    }

    public void addTicket(String description ) {
        Ticket newTicket = new Ticket(description);
        this.ticket.add(newTicket);
    }

    public void processTicket() {
        this.ticket.poll();
    }

    public void nextNextTicket() {
        this.ticket.peek();
    }
}
