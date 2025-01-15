public class Spielen {
    private int id;
    private String team1;

    private String team2;

    private String date;

    private String spielort;

    private int kapazitaet;


    public int getId() {
        return id;
    }

    public String getTeam1() {
        return team1;
    }

    public String getTeam2() {
        return team2;
    }

    public String getDate() {
        return date;
    }

    public String getSpielort() {
        return spielort;
    }

    public int getKapazitaet() {
        return kapazitaet;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setSpielort(String spielort) {
        this.spielort = spielort;
    }

    public void setKapazitaet(int kapazitaet) {
        this.kapazitaet = kapazitaet;
    }
}
