package question4;

public class TestTicket {
    public static void main(String[] args) {
        TicketingSystem ticketingSystem = new TicketingSystem();
        System.out.println("Queue Size: "+ ticketingSystem.getQueueSize());
        System.out.println("Is queue empty? " + ticketingSystem.isQueueEmpty());
        ticketingSystem.addTicket("Car wash");
        ticketingSystem.addTicket("Save Roxy");
        ticketingSystem.addTicket("Free Burgers");

        System.out.println("After adding tickets: " + ticketingSystem); // return all 3 tickets

        ticketingSystem.processTicket(); // remove and return ticket at the front of the queue: car wash
        System.out.println("After processing the front ticket: " + ticketingSystem); // returns only 2 since 1 was removed

        ticketingSystem.viewNextTicket(); // View ticket at the front without removing it: save roxy
        System.out.println("After viewNextTicket: " + ticketingSystem); // returns 2  coz nothing was deleted
        System.out.println("Queue Size: "+ ticketingSystem.getQueueSize());
        System.out.println("Is queue empty? " + ticketingSystem.isQueueEmpty());
        // Clear the queue
        ticketingSystem.clearQueue();

        System.out.println("Queue Size: "+ ticketingSystem.getQueueSize());
        System.out.println("Is queue empty? " + ticketingSystem.isQueueEmpty());
        ticketingSystem.processTicket();
    }
}
