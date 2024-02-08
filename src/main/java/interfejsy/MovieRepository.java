package interfejsy;

import java.util.Arrays;

public class MovieRepository implements MovieRepositoryApi{
    private Movie[] movies;
    private int size;

    public MovieRepository() {
        this.movies = new Movie[5];
        this.size  = 0;
    }

    @Override
    public String toString() {
        return "MovieRepository{" +
                "movies=" + Arrays.toString(movies) +
                '}';
    }

    @Override
    public void add(Movie movie) {
        ensureSize();
    movies[size++]=movie;
    }
    private void ensureSize() {
        if (size == movies.length) {
            movies = Arrays.copyOf(movies, 2 * size);
        }
    }

    @Override
    public void delete(Movie movie) {

    }

    @Override
    public Movie[] findAll() {
        return new Movie[0];
    }

    @Override
    public String findByTitle(String title) {
        return null;
    }
}
