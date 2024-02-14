package stream.zadanie1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {
    //Korzystając z Stream API, napisz funkcję, która dla poniższego przykładu:
    //
    //
    //    gdzie Movie to klasa
    //    class Movie {
    //    String title;
    //    String type;
    //    long duration;//min
    //    LocalDate releaseDate
    //    }
    //
    //zwróci listę filmów, gdzie:
    //- długość filmu będzie większa niż 20 min
    //- rok wydania nie będzie starszy niż 2018
    //- typ to horror
    public static void main(String[] args) {
        Movie movie1 = new Movie("Rocy", "Film akcji", 110, LocalDate.of(1986,10,01));
        Movie movie2 = new Movie("Lśnienie", "Horror",120, LocalDate.of(2019,11,01));
        List<Movie> movies = Arrays.asList(movie1, movie2).stream().filter(element -> element.getDuration()>20)
                .filter(element -> element.getReleaseDate().getYear()>2018)
                .filter(element-> element.getType().equals("Horror"))
                .toList();
        System.out.println(movies.toString());
    }
}
