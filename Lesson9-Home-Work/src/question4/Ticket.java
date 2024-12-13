package question4;

import java.util.Random;

public class Ticket {
    private final String ticketId;
    private String description;

    public Ticket(String ticketId, String description) {
        this.ticketId = ticketId;
        this.description = description;
    }

    public String getTicketId() {
        return ticketId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Ticket: " + "ticketId: " + getTicketId() + ", description: " + getDescription() + "\n";
    }
}
