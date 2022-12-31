package building;

public class Theater extends PublicBuilding {
    private int grandstand;
    private int auditorium;
    private String theaterName;

    public Theater(String theaterName, int auditorium, int grandstand, int floors, int entrances, String type, boolean heating) {
        super(floors, entrances, type, heating);

        this.theaterName = theaterName;
        this.auditorium = auditorium;
        this.grandstand = grandstand;
    }

    @Override
    public int getFloors() {
        return super.floors;
    }

    @Override
    public int getEntrances() {
        return super.entrances;
    }

    @Override
    public String getType() {
        return super.type;
    }

    @Override
    public void heatingOff(boolean heating) {
        super.heating = heating;
    }

    public int getGrandstand() {
        return grandstand;
    }

    public void setGrandstand(int grandstand) {
        this.grandstand = grandstand;
    }

    public int getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(int auditorium) {
        this.auditorium = auditorium;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    @Override
    public String toString() {
        return "Theater{" +
                "floors=" + floors +
                ", entrances=" + entrances +
                ", type='" + type + '\'' +
                ", heating=" + heating +
                ", grandstand=" + grandstand +
                ", auditorium=" + auditorium +
                ", theaterName='" + theaterName + '\'' +
                '}';
    }

    public static void printTheater(Theater theater) {
        System.out.println(theater);
    }
}
