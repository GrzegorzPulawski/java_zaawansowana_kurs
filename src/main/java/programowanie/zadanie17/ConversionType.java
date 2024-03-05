package programowanie.zadanie17;

public enum ConversionType {

    METERS_TO_YARDS(1.0936), YARDS_TO_METERS(1.0936), CENTIMETERS_TO_ICHES(0.393701), INCHES_TO_CENTIMETERS(0.393701), KILOMETERS_TO_MILES(0.621371), MILES_TO_KILOMETERS(0.621371);

    //Enum powinien posiadać parametr typu Converter służący do przeprowadzania obliczeń dla danego typu.
    private double converter;

    ConversionType(double converter) {
        this.converter = converter;
    }

    public static double getConverter(ConversionType conversionType) {
        return conversionType.converter;
    }
    // ConvertionType conversionType) i na podstawie przekazanej wartości oraz typu konwersji, korzystała z Convertera danego typu i zwracała wynik.
}
