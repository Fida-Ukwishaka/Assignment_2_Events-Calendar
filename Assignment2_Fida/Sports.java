package Assignment2_Fida;
import java.time.LocalDate;
import java.time.LocalTime;

public class Sports extends AshesiEvents {
    private String sportType;
    private String hostAssociation;
    private int gameSeason;
    private String teams;
    

    // Constructor
    public Sports(String eventName, String eventType, String eventLocation, LocalDate eventDate, LocalTime eventTime, int duration, String eventorganizer, String sportType, String hostAssociation, int gameSeason, String teams) {
        super(eventName, eventType, eventLocation, eventDate, eventTime, duration, eventorganizer);
        this.sportType = sportType;
        this.teams = teams;
        this.hostAssociation = hostAssociation;
        this.gameSeason = gameSeason;

    }

    // Getter methods
    public String getSportType() {
        return sportType;
    }
    public String getHostAssociation() {
        return hostAssociation;
    }
    public int getGameSeason() {
        return gameSeason;
    }
    public String getTeamsPlaying() {
        return teams;
    }

    // Implementing the eventSummary method from EventDetails interface
    @Override
    public String eventSummary() {
        return super.eventSummary() + 
               "\nSport Type: " + sportType + 
               "\nHosted by: " + hostAssociation + 
               "\nSeason " + gameSeason +
               "\nTeams Involved: " + teams;
    }
    
}
