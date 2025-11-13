import java.time.LocalDate;
import java.time.LocalTime;


public class JUnit {
    public static void main(String[] args) {
        // Create a Lecture event
        AshesiEvents lecture1 = new Lectures(
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
            "Trees and Graphs"
        );
        // Summary
        System.out.println("===== Lecture Sessions =====");
        System.out.println(lecture1.eventSummary());
        System.out.println();
        System.out.println(lecture2.eventSummary());
        System.out.println();
        System.out.println("\n-----------------------\n");


        // Create a Sports event
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
        
        //Summary
        System.out.println("===== Sports Events =====");
        System.out.println(sportsEvent1.eventSummary());
        System.out.println();
        System.out.println(sportsEvent2.eventSummary());
        System.out.println();
        System.out.println("\n-----------------------\n");

        // Create a Party event
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

        // Summary
        System.out.println("\n===== Party Events =====");
        System.out.println(party1.eventSummary());
        System.out.println();
        System.out.println(party2.eventSummary());
        System.out.println();
        
        // Separator
        System.out.println("\n-----------------------\n");

    }


}
