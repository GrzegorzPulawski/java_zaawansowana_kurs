package programowanie.zadanie2;

import java.util.Comparator;

public class IgnoreCase implements Comparator<String> {

    @Override
    public int compare(String a1, String a2){
        return a1.compareToIgnoreCase(a2);
    }
}
