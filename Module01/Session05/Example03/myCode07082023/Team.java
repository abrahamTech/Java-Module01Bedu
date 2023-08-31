package Session05.Example03.myCode07082023;

public class Team {
    private String name;
    private String city;
    private int points;

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getPoints() {
        return points;
    }


    //Constructors
    //They will be differentiated by the NUMBER of parameters and by the TYPE of these

    public Team(String name, String city, int points) {
        this.name = name;
        this.city = city;
        this.points = points;
    }

    public Team(String name, String city) {
        //Use the Constructor
        this(name, city, 0);
    }

    public Team(String city) {
        //Use the Constructor
        this("Anonymous", city);
    }

    public Team(int points) {
        //Use the Constructor
        this("Anonymous", "Without City", points);
    }

    public void update(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public void update(String name) {
        this.name = name;
    }

    public void update(int points) {
        this.points = points;
    }
}
