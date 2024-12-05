package mk.ukim.finki.wp.lab.model;

import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class EventBooking {
    // Getters and Setters
    private String eventName;
    private String attendeeName;
    private String attendeeAddress;
    private Long numberOfTickets;

    // Constructor
    public EventBooking() {}

    public EventBooking(String eventName, String attendeeName, String attendeeAddress, Long numberOfTickets) {
        this.eventName = eventName;
        this.attendeeName = attendeeName;
        this.attendeeAddress = attendeeAddress;
        this.numberOfTickets = numberOfTickets;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setAttendeeName(String attendeeName) {
        this.attendeeName = attendeeName;
    }

    public void setAttendeeAddress(String attendeeAddress) {
        this.attendeeAddress = attendeeAddress;
    }

    public void setNumberOfTickets(Long numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }
}