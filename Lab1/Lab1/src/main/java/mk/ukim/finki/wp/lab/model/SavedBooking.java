package mk.ukim.finki.wp.lab.model;

import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class SavedBooking {
    private String eventName;
    private int numberOfTickets;

    public SavedBooking(String eventName, int numberOfTickets) {
        this.eventName = eventName;
        this.numberOfTickets = numberOfTickets;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }
}