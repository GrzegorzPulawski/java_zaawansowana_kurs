package programowanie.zadanie16;

public class Main {
    public static void main(String[] args) {
        try {
            Runner runner = Runner.getFitnessLevel(200);
            System.out.println("Poziom maratończyka to: " + runner);
        }catch (IllegalAccessException e){
            System.err.println(e.getMessage());
        }
    }
}
