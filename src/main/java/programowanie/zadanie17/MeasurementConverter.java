package programowanie.zadanie17;

public class MeasurementConverter {
    public double convert(int value, ConversionType conversionType){
         return value * ConversionType.getConverter(conversionType);
    }
}
