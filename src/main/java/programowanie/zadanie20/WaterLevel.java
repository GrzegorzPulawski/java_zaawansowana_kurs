package programowanie.zadanie20;

public enum WaterLevel {
    NIEDOLANO("Niedolano "),
    JESTOK("Jest OK"),
    PRZELANO("Przelano");


    private final String description;

    WaterLevel(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}