package programowanie.zadanie17;

public class Main {
    public static void main(String[] args) {
        MeasurementConverter measurementConverter = new MeasurementConverter();
        System.out.println(measurementConverter.convert(5, ConversionType.KILOMETERS_TO_MILES));
    }
}
