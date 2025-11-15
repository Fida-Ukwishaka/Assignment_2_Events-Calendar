package Assignment2_Fida;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;


public class EventDriver {
    public static void main(String[] args) {
        ArrayList<AshesiEvents> events = new ArrayList<>();
        // Create some event objects (assuming Lecture and Parties are subclasses of AshesiEvents)
        AshesiEvents lecture1 = new Lectures(
            "CLASS COURSE: Object-Oriented Programming",
            "Lecture",
            "Nana Araba APT Hall 217",
            LocalDate.of(2024, 6, 20),
            LocalTime.of(9, 45),
            2,
            "Computer Science Department",
            "Dr. Ebo",
            "Abstraction and Inheritance",
            "Object-Oriented Programming",
            "Blaise Izerimana"
        );

        // Second Lecture object
        AshesiEvents lecture2 = new Lectures(
            "CLASS COURSE: Data Structures",
            "Lecture",
            "Nana Araba APT Hall 216",
            LocalDate.of(2025, 6, 21),
            LocalTime.of(11, 30),
            2,
            "Computer Science Department",
            "Dr. Daniel Addo",
            "Trees and Graphs",
            "Algorithms and Data Structures",
            "Sarah Mensah"
        );


        // Create Sports objects
         Sports sportsEvent1 = new Sports(
            "Varsity League",
            "Sports",
            "Ashesi New Basketaball Court",
            LocalDate.of(2025, 11, 18),
            LocalTime.of(17, 0),
            5,
            "Sports Committee",
            "Basketball",
            "Ashesi Basketball Association",
            2025,
            "Ashesi University vs. Academic City University"
        ); 

        // Second Sports object
        Sports sportsEvent2 = new Sports(
            "Interclasses Tournaments",
            "Sports",
            "Ashesi Football Field",
            LocalDate.of(2025, 12, 20),
            LocalTime.of(19, 0),
            3,
            "Ashesi Students Council",
            "Football, Volleyball, and Basketball",
            "Ashesi Football Association, Ashesi Volleyball Association, and Ashesi Basketball Association",
            2025,
            "Class of 2026&2029 vs. Class of 2027&2028"
        );

        // Create Party objects
        Parties party1 = new Parties(
            "Pary With Mavo",
            "Party",
            "Ashesi Campus",
            LocalDate.of(2025, 11, 29),
            LocalTime.of(20, 0),
            10,
            "Ashesi Sports Comittee",
            "Till Morning",
            "New Car Park",
            "Mavo",
            "DJ Phize",
            "Party casual"
        );
        
        // Second Party object
        Parties party2 = new Parties(
            "Ubora",
            "Awards Evening",
            "Alisa Hotel Accra",
            LocalDate.of(2025, 12, 3),
            LocalTime.of(17, 0),
            5,
            "Ashesi University",
            "Celebrating Excellence",
            "Grand Ballroom",
            "Live Performance by Tyler",
            "DJ Remy",
            "Elegance"
        );

        // Add events to the driver
        events.add(lecture1);
        events.add(lecture2);
        events.add(sportsEvent1);
        events.add(sportsEvent2);
        events.add(party1);
        events.add(party2);

        // Displaying events using a loop
        System.out.println("===== Ashesi Events Summary =====");
        for (AshesiEvents event : events) {
            event.eventSummary();
            System.out.println();
        }
        
    }

}
    



