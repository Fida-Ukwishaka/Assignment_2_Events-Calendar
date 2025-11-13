import java.time.LocalDate;
import java.time.LocalTime;

public class Sports extends AshesiEvents {
    private String sportType;
    private String HostAssociation;
    private int GameSeason;
    private String Teams;
    

    // Constructor
    public Sports(String eventName, String eventType, String eventLocation, LocalDate eventDate, LocalTime eventTime, int duration, String eventorganizer, String sportType, String HostAssociation, int GameSeason, String Teams) {
        super(eventName, eventType, eventLocation, eventDate, eventTime, duration, eventorganizer);
        this.sportType = sportType;
        this.Teams = Teams;
        this.HostAssociation = HostAssociation;
        this.GameSeason = GameSeason;

    }

    // Getter methods
    public String getSportType() {
        return sportType;
    }
    public String getHostAssociation() {
        return HostAssociation;
    }
    public int getGameSeason() {
        return GameSeason;
    }
    public String getTeamsPlaying() {
        return Teams;
    }
   

    // Setter methods
    public void setSportType(String sportType) {
        this.sportType = sportType;
    }
    public void setHostAssociation(String hostAssociation) {
        this.HostAssociation = hostAssociation;
    }
    public void setGameSeason(int gameSeason) {
        this.GameSeason = gameSeason;
    }
    public void setTeamsInvolved(String teamsInvolved) {
        this.Teams = Teams;
    }

    // Implementing the eventSummary method from EventDetails interface
    @Override
    public String eventSummary() {
        return super.eventSummary() + 
               "\nSport Type: " + sportType + 
               "\nHosted by: " + HostAssociation + 
               "\nSeason " + GameSeason +
               "\nTeams Involved: " + Teams;
    }
    
}
