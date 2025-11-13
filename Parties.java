import java.time.LocalDate;
import java.time.LocalTime;

public class Parties extends AshesiEvents {
    private String PartyTheme;
    private String PartyLocation;
    private String SpecialPerformer;
    private String DJName;
    private String DressCode;

    // Constructor
    public Parties(String eventName, String eventType, String eventLocation, LocalDate eventDate, LocalTime eventTime, int duration, String eventorganizer, String partyTheme, String PartyLocation, String SpecialPerfomer,String DJName, String DressCode) {
        super(eventName, eventType, eventLocation, eventDate, eventTime, duration, eventorganizer);
        this.PartyTheme = partyTheme;
        this.PartyLocation = PartyLocation;
        this.SpecialPerformer = SpecialPerfomer;
        this.DJName = DJName;
        this.DressCode = DressCode;
    }

    // Getter methods
    public String getPartyTheme() {
        return PartyTheme;
    }
    public String PartyLocation() {
        return PartyLocation;
    }
    public String getSpecialPerformer() {
        return SpecialPerformer;
    }
    public String getDJName() {
        return DJName;
    }
    public String getDressCode() {
        return DressCode;
    }


    // Setter methods
    public void setPartyTheme(String partyTheme) {
        this.PartyTheme = partyTheme;
    }
    public void setPartyLocation(String partyLocation) {
        this.PartyLocation = PartyLocation;
    }
    public void setSpecialPerformer(String specialPerformer) {
        this.SpecialPerformer = SpecialPerformer;
    }
    public void setDJName(String djName) {
        this.DJName = DJName;
    }
    public void setDressCode(String dressCode) {
        this.DressCode = DressCode;
    }


    // Implementing the eventSummary method from EventDetails interface
    @Override
    public String eventSummary() {
        return super.eventSummary() + 
               "\nParty Theme: " + PartyTheme + 
               "\nLocation: " + PartyLocation + 
               "\nPerfomance By: " + SpecialPerformer + 
               "\nDJ: " + DJName +
               "\nDress Code: " + DressCode;
    }
    
}
