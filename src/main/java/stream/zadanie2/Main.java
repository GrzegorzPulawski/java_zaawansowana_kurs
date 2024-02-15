package stream.zadanie2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.lang.Math.min;
import static java.util.spi.ToolProvider.findFirst;


public class Main {

    public static void main(String[] args) {

        PracownikDTO pracownik1 = new PracownikDTO(1,"Adam","Kowalski", 70, DzialEnum.IT, BigDecimal.valueOf(8000));
        PracownikDTO pracownik2 = new PracownikDTO(2,"Janek","Wiśniewski", 70, DzialEnum.HR, BigDecimal.valueOf(4000));
        PracownikDTO pracownik3 = new PracownikDTO(3,"Czarek","Wiśniewski", 50, DzialEnum.SALES, BigDecimal.valueOf(8000));
        PracownikDTO pracownik4 = new PracownikDTO(4,"Janek","Jabłkowski", 30, DzialEnum.SALES, BigDecimal.valueOf(6000));
        PracownikDTO pracownik5 = new PracownikDTO(5,"Franek","Jabłkowski", 40, DzialEnum.IT, BigDecimal.valueOf(6000));
        PracownikDTO pracownik6 = new PracownikDTO(6,"Franek","Adamczewski", 45, DzialEnum.IT, BigDecimal.valueOf(6400));
        PracownikDTO pracownik7 = new PracownikDTO(7,"Janek","Wiśniewski", 70, DzialEnum.HR, BigDecimal.valueOf(4000));
        PracownikDTO pracownik8 = new PracownikDTO(8,"Ola","Wiśniewska", 70, DzialEnum.HR, BigDecimal.valueOf(4000));
        PracownikDTO pracownik9 = new PracownikDTO(9,"Olek","Adamczewski", 45, DzialEnum.IT, BigDecimal.valueOf(10000));

        List<PracownikDTO> pracownikList = List.of(pracownik1,pracownik3,pracownik2,pracownik4,pracownik5,pracownik6,pracownik7,pracownik8,pracownik9);
        System.out.println(polecenie1(pracownikList));
        System.out.println(polecenie2(pracownikList));
        System.out.println(polecenie3(pracownikList));
        System.out.println(polecenie4(pracownikList));
        System.out.println(polecenie5(pracownikList));
        System.out.println(polecenie6(pracownikList));
        System.out.println(polecenie7(pracownikList));
        System.out.println(polecenie8(pracownikList));
        System.out.println(polecenie10(pracownikList));
    }
    //Policzenie pracowników z działu IT.
    public static long polecenie1(List<PracownikDTO> pracownicy){
        return pracownicy.stream().filter(element -> element.getDzial() == DzialEnum.IT).count();
    }
    //Sprawdzenie, czy wszyscy pracownicy w dziale HR mają pensję powyżej 5000.
    public static boolean polecenie2(List<PracownikDTO> pracownicy){
        return  pracownicy.stream().filter(element -> element.getDzial() == DzialEnum.HR)
                .allMatch(element -> element.getSalary().doubleValue()>5000);
    }
    //Znalezienie pierwszego pracownika z działu IT, który ma pensję powyżej 7000.
    public static String polecenie3(List<PracownikDTO> pracownicy){
        return pracownicy.stream().filter(s -> s.getSalary().doubleValue()>7000).findFirst().toString();
    }
    //Obliczenie średniej pensji pracowników w dziale Sales.
    public  static  Double polecenie4(List<PracownikDTO> pracownicy){
        return pracownicy.stream().filter(element -> element.getDzial() == DzialEnum.SALES)
                .mapToDouble(element -> element.getSalary().doubleValue()).average().getAsDouble();
    }
    //Wyświetlenie unikalnych nazwisk pracowników z działu IT, którzy mają więcej niż 30 lat, posortowanych alfabetycznie.
    public static List<String> polecenie5(List<PracownikDTO> pracownicy){
        return pracownicy.stream().filter(element -> element.getDzial() == DzialEnum.IT)
                .filter(element -> element.getWiek()>30)
                .map(PracownikDTO::getNazwisko)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
    //Znalezienie liczby unikalnych imion pracowników w dziale HR.
    public static long polecenie6(List<PracownikDTO> pracownicy){
        return pracownicy.stream().filter(element-> element.getDzial()  == DzialEnum.HR)
                .map(PracownikDTO::getImie)
                .distinct()
                .count();
    }
    //Sprawdzenie, czy jakikolwiek pracownik w dziale HR lub IT zarabia dokładnie 10,000.
    public static boolean polecenie7(List<PracownikDTO> pracownicy){
        return pracownicy.stream().filter(element -> element.getDzial() == DzialEnum.HR && element.getDzial() == DzialEnum.IT)
             //   .map(PracownikDTO::getSalary)
               // .filter(element -> element.doubleValue() == 10000)
                .allMatch(element -> element.getSalary().doubleValue() == 10000);
    }
    //Zwrócenie nazwy działu pracownika o imieniu X.
    public static Enum<DzialEnum> polecenie8(List<PracownikDTO> pracownicy){
        return pracownicy.stream()
            .filter(element -> element.getImie().equals("Czarek"))
                .map((PracownikDTO::getDzial))
                .findFirst().get();
    }
    //Obliczenie różnicy wieku między najstarszym a najmłodszym pracownikiem (2 streamy mogą być wymagane).
    //Wypisz imiona pracowników którzy mają parzyste id a następnie zwróć Listę takich pracowników (wszystko w jednym stream'ie).
    public static List<PracownikDTO> polecenie10(List<PracownikDTO> pracownicy){
        return pracownicy.stream().filter(element -> element.getId() % 2 == 0)
                .toList();
    }
}



