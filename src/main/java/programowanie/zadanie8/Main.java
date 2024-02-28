package programowanie.zadanie8;

public class Main {
    public static void main(String[] args) {
        Parcel parcel = new Parcel(30,30,30, 18);
        ParcelRepository parcelRepository = new ParcelRepository();
        parcelRepository.validate(parcel);
    }
}
