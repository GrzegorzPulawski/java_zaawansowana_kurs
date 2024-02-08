package interfejsy;

public class Main {


    //Napisz implementację interfejsu MovieRepository, która będzie implementować metody z interfejsu MovieRepositoryApi
    public static void main(String[] args) {
        Movie movie = new Movie("Lot nad Kukułczym gniazdem", 1978);
        Movie movie1 = new Movie("Casablanca", 1943);
        MovieRepository movieRepository = new MovieRepository();
        movieRepository.add(movie);
        movieRepository.add(movie1);
        System.out.println(movieRepository);
    }
}
