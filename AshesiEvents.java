import java.time.LocalDate;
import java.time.LocalTime;

public abstract class AshesiEvents implements EventShchedule, EventDetails {

    private String eventName;
    private String eventType;
    private String eventLocation;
    private LocalDate eventDate;
    private LocalTime eventTime;
    private int Duration;// in hours
    private String eventorganizer;

    // Constructor
    public AshesiEvents(String eventName,String eventType, String eventLocation, LocalDate eventDate, LocalTime eventTime, int duration, String eventorganizer) {
        this.eventName = eventName;
        this.eventType = eventType;
        this.eventLocation = eventLocation;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.Duration = duration;
        this.eventorganizer = eventorganizer;
    }

    // getter methods
    public String getEventName() {
        return eventName;
    }
    public String getEventType() {
        return eventType;
    }
    public String getEventLocation() {
        return eventLocation;
    }
    public LocalDate getEventDate() {
        return eventDate;
    }
    public LocalTime getEventTime() {
        return eventTime;
    }
    public int getDuration() {
        return Duration;
    }
    public String getEventorganizer() {
        return eventorganizer;
    }

    // setter methods
    public void setEventName(String eventName) {
        this.eventName = eventName; 
    }
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
    public void setEventLocation(String location) {
        this.eventLocation = location;
    }
    public void setEventDate(LocalDate date) {
        this.eventDate = date;
    }
    public void setEventTime(LocalTime time) {
        this.eventTime = time;
    }
    public void setDuration(int duration) {
        this.Duration = duration;
    }
    public void setEventorganizer() {
        this.eventorganizer = eventorganizer;
    }

    // event summary method
    public String eventSummary() {
        return "Event Name: " + eventName + "\n" +
               "Event Type: " + eventType + "\n" +
               "Organizer: " + eventorganizer + "\n" +
               "Location: " + eventLocation + "\n" +
               "Date: " + eventDate + "\n" +
               "Time: " + eventTime + "\n" +
               "Duration: " + Duration + " hours";
    }

}


    






   
