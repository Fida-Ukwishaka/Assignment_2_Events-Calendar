package Assignment2_Fida;
import java.time.LocalDate;
import java.time.LocalTime;

public class Lectures extends AshesiEvents {

    private String LecturerName;
    private String FacultyIntern;
    private String Course;
    private String Topic;

    // Constructor
    public Lectures(String eventName, String eventType, String eventLocation, LocalDate eventDate, LocalTime eventTime, int duration, String eventorganizer, String LecturerName, String Topic, String Course, String FacultyIntern) {
        super(eventName, eventType, eventLocation, eventDate, eventTime, duration, eventorganizer);
        this.LecturerName = LecturerName;
        this.FacultyIntern = FacultyIntern;
        this.Course = Course;
        this.Topic = Topic;
    }

    // Getter methods
    public String getLecturerName() {
        return LecturerName;
    }
    public String getFacultyIntern() {
        return FacultyIntern;
    }
    public String getCourse() {
        return Course;
    }
    public String getTopic() {
        return Topic;
    }


    // Implementing the eventSummary method from EventDetails interface
    @Override
    public String eventSummary() {
        return super.eventSummary() + 
               "\nLecturer Name: " + LecturerName + 
               "\nFaculty Intern: " + FacultyIntern + 
               "\nCourse: " + Course + 
               "\nTopic: " + Topic;
    }
    
}
