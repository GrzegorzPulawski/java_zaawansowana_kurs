package interfejsy;

import java.util.List;

public interface MovieRepositoryApi {
    // //Stwórz interfejs MovieRepositoryApi który będzie deklarować podstawowe operacji na tablicy obiektów typu Movie:
    //    //- add
    //    //- delete
    //    //- findAll
    //    //- findByTitle
    void  add(Movie movie);
    void delete(Movie movie);

    Movie[] findAll();
    String findByTitle(String title);

}
