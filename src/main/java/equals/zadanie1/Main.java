package equals.zadanie1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    //Przygotuj klasę o następujących polach:
    //- title (String)
    //- reżyser (String)
    //- rok wydania (int)
    //
    //Dodaj dwa jednakowe obiekty do list i HashSetu:
    //* najpierw bez implementacji metody hashCode i metody Equals
    //* z implementacją metody equals
    //* z implemenetacją metody hashCode
    //Zaobserwuj różnicę.
    public static void main(String[] args) {
        Nowa nowa1 = new Nowa("Rocy 3","Sylwester Stallone", 1988);
        Nowa nowa2 = new Nowa("Rocy 3", "Sylwester Stallone", 1988);
        List<Nowa> filmsList = new ArrayList<>();
        filmsList.add(nowa1);
        filmsList.add(nowa2);

     //   Set<Nowa> filmSet = new HashSet<>();
     //   filmSet.add(nowa1);
     //   filmSet.add(nowa2);

        boolean czyRowne = nowa1.equals(nowa2); // true, inne instancje ale moja implementacja equals działa na id
        int hashA = nowa1.hashCode();
        int hashB = nowa2.hashCode();

        System.out.println(filmsList.size());
      //  System.out.println(filmSet.size());;

    }
}

