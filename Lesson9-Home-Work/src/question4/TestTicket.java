package question4;

public class TestTicket {
    public static void main(String[] args) {
        TicketingSystem ticketingSystem = new TicketingSystem();
        ticketingSystem.addTicket("Car wash");
        ticketingSystem.addTicket("Save Roxy");
        ticketingSystem.addTicket("Free Burgers");

        System.out.println(ticketingSystem);
    }
}
