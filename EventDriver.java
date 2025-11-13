import java.util.ArrayList;


public class EventDriver {
    // list of events
    private ArrayList<AshesiEvents> eventsList;
    // Constructor
    public EventDriver() {
        eventsList = new ArrayList<>();
    }
    // Method to add an event
    public void addEvent(AshesiEvents event) {
        eventsList.add(event);
    }
    // Method to display all events
    public void displayEvents() {
        for (AshesiEvents event : eventsList) {
            System.out.println(event.eventSummary());
            System.out.println();
        }
    }
    


}
