package question4;

import java.util.Random;

public class Ticket {
    private int ticketId;
    private String description;

    public Ticket(String description) {
        this.ticketId = new Random().nextInt();
        this.description = description;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
