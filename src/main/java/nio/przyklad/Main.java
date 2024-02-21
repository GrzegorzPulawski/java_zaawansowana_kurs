package nio.przyklad;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path sciezka = Path.of("resources/data"); // obiekt reprezentujący ścieżkę do pliku
        Files.createFile(sciezka); // tworzę plik
        Files.write(sciezka, "\njakiś tekst".getBytes(), StandardOpenOption.APPEND); // dopisuję do niego zawartość

        List<String> a = Files.readAllLines(sciezka); // wczytuję wszystkie linijki z pliku pod ścieżką
        a.forEach(System.out::println); // wypisuje je

        Files.readAllLines(Path.of("resources/data.txt")).forEach(System.out::println); // wypisuje zawartość innego pliku
    }
}
