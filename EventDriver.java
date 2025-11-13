import java.time.LocalDate;
import java.time.LocalTime;


public class EventDriver {
    public static void main(String[] args) {
        // Create a Lecture event
        AshesiEvents lecture = new Lectures(
            "CLASS COURSE: Object-Oriented Programming",
            "Lecture",
            "Nana Araba APT Hall 217",
            LocalDate.of(2024, 6, 20),
            LocalTime.of(9, 45),
            2,
            "Computer Science Department",
            "Dr. Ebo",
            "Abstraction and Inheritance"
        );
        // Print the event summary
        System.out.println(lecture.eventSummary());


        // Separator
        System.out.println("\n-----------------------\n");


        // Create a Sports event
        Sports sportsEvent = new Sports(
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
        // Print the event summary
        System.out.println(sportsEvent.eventSummary());

        // Separator
        System.out.println("\n-----------------------\n");



        // Create a Party event
        Parties party = new Parties(
            "Summer Bash",
            "Party",
            "Ashesi Campus",
            LocalDate.of(2024, 7, 15),
            LocalTime.of(18, 0),
            4,
            "Ashesi Events Team",
            "Tropical Fiesta",
            "Main Hall",
            "DJ Cool Beats",
            "DJ Smooth",
            "Casual Tropical"
        );

        // Print the event summary
        System.out.println(party.eventSummary());
    }


}
