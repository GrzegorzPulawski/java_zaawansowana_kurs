package programowanie.zadanie8;

public class ParcelRepository implements Validator {
    @Override
    public boolean validate(Parcel input) {
        if (input.getxLength() + input.getyLength() + input.getzLength() > 300) {
            return false;
        }
        if (input.getxLength() < 30 || input.getyLength() < 30 || input.getzLength() < 30) {
            System.out.println("Błąd: Każdy z rozmiarów musi być większy lub równy 30.");
            return false;
        }
        float maxWeight = input.isExpress ? 15.0f : 30.0f;
        if (input.getWeight() > maxWeight) {
            System.out.println("Błąd: Waga przekracza dozwoloną wartość (" + maxWeight + ").");
            return false;
        }
        System.out.println("Wszystko OK");
        return true;

    }
}



