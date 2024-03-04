package programowanie.zadanie16;

public enum Runner {
    //Stwórz klasę enum Runner ze stałymi BEGINNER, INTERMEDIATE, ADVANCED. Enum powinien posiadać dwa parametry:
    // minimalny czas przebiegnięcia maratonu w minutach
    //maksymalny czas przebiegnięcia maratonu w minutach
    BEGINNER(240, 300), INTERMEDIATE(180, 239), ADVANCED(120, 179);
    private int minTime;
    private int maxTime;

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public static Runner getFitnessLevel(int time) throws IllegalAccessException{
        for (Runner runner : Runner.values()) {
            if (time >= runner.minTime && time < runner.maxTime) {
            return runner;
            }
        }throw new IllegalAccessException("Nie znaleziono poziomu");
    }

    public int getMinTime() {
        return minTime;
    }

    public int getMaxTime() {
        return maxTime;
    }
}
