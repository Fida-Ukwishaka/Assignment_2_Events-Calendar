import java.time.LocalDate;
import java.time.LocalTime;

public interface EventShchedule {
    LocalDate getEventDate();
    String getEventType();
    LocalTime getEventTime();
    String getEventLocation();
    int getDuration();

    void setEventDate(LocalDate date);
    void setEventType(String type);
    void setEventTime(LocalTime time);
    void setEventLocation(String location); 
    void setDuration(int duration);

}
