package programowanie.zadanie4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;



public class Main {
    public static void main(String[] args) {

      Storage<String, String> magazyn =new Storage<>();
        magazyn.addToStorage("A", "żelazko");
        magazyn.addToStorage("B", "lodówka");
        magazyn.findValues("lodówka");
        magazyn.printValues("A");

    }

}
