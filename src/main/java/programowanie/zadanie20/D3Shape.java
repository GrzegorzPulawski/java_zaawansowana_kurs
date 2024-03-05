package programowanie.zadanie20;

public abstract class D3Shape extends Shape implements Fillable {

    //Zadanie 21
    //Stwórz abstrakcyjną klasę 3DShape rozszerzającą klasę Shape
    // z poprzedniego zadania. Dodaj dodatkową metodę calculateVolume().
    //Stwórz klasy Cone oraz Qube rozszerzając klasę 3DShape, odpowiednio implementując metody abstrakcyjne.
    // Sprawdź poprawność działania.
    abstract double calculateVolume();

    WaterLevel waterLevel = WaterLevel.PRZELANO;
    WaterLevel waterLevel1 = WaterLevel.NIEDOLANO;
    WaterLevel waterLevel2 = WaterLevel.JESTOK;

    @Override
    public void fill(int volumeOfWater) {

        if (volumeOfWater == calculateVolume()) {

            System.out.println(waterLevel2.getDescription());
        } else if (volumeOfWater < calculateVolume()) {

            System.out.println(waterLevel1.getDescription());
        } else if (volumeOfWater > calculateVolume()) {

            System.out.println(waterLevel.getDescription());
        }
    }
}
