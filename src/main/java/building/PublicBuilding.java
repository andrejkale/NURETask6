package building;

public abstract class PublicBuilding implements Building {
    int floors;
    int entrances;
    String type;
    boolean heating;

    public PublicBuilding(int floors, int entrances, String type, boolean heating) {
        this.floors = floors;
        this.entrances = entrances;
        this.type = type;
        this.heating = heating;
    }
}
