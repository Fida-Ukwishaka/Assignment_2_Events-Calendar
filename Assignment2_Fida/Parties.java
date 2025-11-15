package Assignment2_Fida;
import java.time.LocalDate;
import java.time.LocalTime;

public class Parties extends AshesiEvents {
    private String partyTheme;
    private String partyLocation;
    private String specialPerformer;
    private String dJName;
    private String dressCode;

    // Constructor
    public Parties(String eventName, String eventType, String eventLocation, LocalDate eventDate, LocalTime eventTime, int duration, String eventorganizer, String partyTheme, String PartyLocation, String SpecialPerfomer,String DJName, String DressCode) {
        super(eventName, eventType, eventLocation, eventDate, eventTime, duration, eventorganizer);
        this.partyTheme = partyTheme;
        this.partyLocation = PartyLocation;
        this.specialPerformer = SpecialPerfomer;
        this.dJName = DJName;
        this.dressCode = DressCode;
    }

    // Getter methods
    public String getPartyTheme() {
        return partyTheme;
    }
    public String PartyLocation() {
        return partyLocation;
    }
    public String getSpecialPerformer() {
        return specialPerformer;
    }
    public String getDJName() {
        return dJName;
    }
    public String getDressCode() {
        return dressCode;
    }


    // Implementing the eventSummary method from EventDetails interface
    @Override
    public void specificData() {
        System.out.println("Party Theme: " + partyTheme);
        System.out.println("Location: " + partyLocation);
        System.out.println("Perfomance By: " + specialPerformer);
        System.out.println("DJ: " + dJName );
        System.out.println("Dress Code: " + dressCode);
    }
    
}
